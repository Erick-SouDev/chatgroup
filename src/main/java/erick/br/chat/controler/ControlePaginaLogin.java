package erick.br.chat.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/inicio"})
public class ControlePaginaLogin {
    @GetMapping(value = {"/login"})
    public String getPageLogin(){
        return  "view/login";
    }
}
