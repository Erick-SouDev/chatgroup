package erick.br.chat.controller.user;


import erick.br.chat.exeption.error.ErrorNotSaveUserJpa;
import erick.br.chat.model.entity.Usuario;
import erick.br.chat.services.operations.user.ServicesRepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "ControlePaginaCadastroUser")
@RequestMapping(value = {"/create"} , produces = {"text/html"})
public class ControllerPageCreaterUser {



    @Autowired
    private ServicesRepositoryUser servicesRepositoryUser;

    public ControllerPageCreaterUser(){
        System.out.println("Subindo Minha Aplicação Web");
    }

    @GetMapping(value = {"/user"})
    public ModelAndView getPaginaCraeteUser(){
        ModelAndView view = new ModelAndView("/view/usuario");
        view.addObject("usuario" , new Usuario());
        return  view;
    }

    @PostMapping(value = {"/newUser"})
    public ModelAndView salvarUsuario(@ModelAttribute(value = "usuario") Usuario usuario){
        ModelAndView view = new ModelAndView("view/usuario");
        Usuario salvo = servicesRepositoryUser.createUser(usuario);

        if(!(salvo != null)){
            throw  new ErrorNotSaveUserJpa("Erro! Não Foi Possivel Salvar A Entidade No Banco");
        }
        view.addObject("salvo" , "Usuario Salvo Com Sucesso!");
        return  view;
    }

}
