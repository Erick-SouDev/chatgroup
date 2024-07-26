package erick.br.chat.controler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value = "ControlePaginaCadastroUser")
@RequestMapping(value = {"/inicio"} , produces = {"text/html"})
public class ControlerCreaterUser  {

    public  ControlerCreaterUser(){
        System.out.println("Subindo Minha Aplicação Web");
    }

    @GetMapping(value = {"/createuser"})
    public String getPaginaCraeteUser(){
        return  "/view/usuario";
    }

}
