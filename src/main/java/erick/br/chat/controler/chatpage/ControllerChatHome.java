package erick.br.chat.controler.chatpage;

import erick.br.chat.modelo.dto.DtoUser;
import erick.br.chat.modelo.entity.Usuario;
import erick.br.chat.repository.user.UserRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class ControllerChatHome {

    @Autowired
    private UserRepository userRepository;

    private ModelMapper modelMapper;

    public ControllerChatHome(){
        this.modelMapper = new ModelMapper();
    }

    @GetMapping(value = {"/chat"})
    public ModelAndView getChatHome() {
        ModelAndView view = new ModelAndView("view/chat");
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String email = null;
        if (principal instanceof UserDetails) {
            email = ((UserDetails) principal).getUsername();
        }
        Usuario user = userRepository.buscarLoginDoUsuario(email);
        DtoUser dtoUser =  modelMapper.map(user, DtoUser.class);
        return view;
    }

}
