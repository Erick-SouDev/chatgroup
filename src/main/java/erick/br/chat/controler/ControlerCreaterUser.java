package erick.br.chat.controler;


import erick.br.chat.exeption.error.ErrorNotSaveUserJpa;
import erick.br.chat.model.Usuario;
import erick.br.chat.services.jpa.repository.ServicesRepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "ControlePaginaCadastroUser")
@RequestMapping(value = {"/create"} , produces = {"text/html"})
public class ControlerCreaterUser  {

    @Autowired
    private ServicesRepositoryUser servicesRepositoryUser;
    public  ControlerCreaterUser(){
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
        System.out.println(usuario);
        ModelAndView view = new ModelAndView("view/usuario");
        Usuario salvo = servicesRepositoryUser.createUser(usuario);

        if(!(salvo != null)){
            throw  new ErrorNotSaveUserJpa("Erro! Não Foi Possivel Salvar A Entidade No Banco");
        }
        view.addObject("salvo" , "Usuario Salvo Com Sucesso!");
        return  view;
    }

}
