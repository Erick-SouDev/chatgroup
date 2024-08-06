package erick.br.chat.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ControllerPageAuthentication {
    @GetMapping("/")
    public String getPageLogin(){
        return  "view/login";
    }
}
