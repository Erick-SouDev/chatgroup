package erick.br.chat.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatHome {

    @GetMapping(value = {"/chat"})
    public  String getChatHome(){
        return  "view/chat";
    }

}
