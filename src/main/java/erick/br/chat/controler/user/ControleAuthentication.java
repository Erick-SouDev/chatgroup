package erick.br.chat.controler.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/"} ,produces = {"text/html"})
public class ControleAuthentication {
    @GetMapping(value = {"/login"})
    public String getPageLogin(){
        return  "view/login";
    }
}
