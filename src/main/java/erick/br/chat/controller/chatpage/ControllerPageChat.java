package erick.br.chat.controller.chatpage;

import erick.br.chat.model.dto.DtoUser;
import erick.br.chat.model.entity.Usuario;
import erick.br.chat.repository.user.RepositoryUser;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class ControllerPageChat {

    @Autowired
    private RepositoryUser userRepository;
    private ModelMapper modelMapper;

    public ControllerPageChat() {this.modelMapper = new ModelMapper();}

    @GetMapping(value = {"/chat"})
    public ModelAndView getChatHome() {
        ModelAndView view = new ModelAndView("view/chat");
//        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        String email = null;
//        if (principal instanceof UserDetails) {
//            email = ((UserDetails) principal).getUsername();
//        }
//
//        Usuario user = userRepository.buscarLoginDoUsuario(email);
//        DtoUser dtoUser = modelMapper.map(user, DtoUser.class);
//        List<DtoUser> dtoUsers = getDtoUsers().stream().filter(dto -> !dto.getId().equals(dtoUser.getId())).toList();
//
//
//        view.addObject("nome", dtoUser.getNome());
//        view.addObject("id", dtoUser.getId());
//        view.addObject("userdto", dtoUsers);
//        return view;
        return view;
    }

    private List<DtoUser> getDtoUsers() {
        List<DtoUser> dtoUsers = userRepository.findAll().stream()
                .map(user -> modelMapper.map(user, DtoUser.class)).collect(Collectors.toList());
        return dtoUsers;
    }

}
