package erick.br.chat.controller.websocket;

import jakarta.websocket.*;
import jakarta.websocket.server.ServerEndpoint;
import org.springframework.stereotype.Component;


@Component
@ServerEndpoint(value = "/chatgroup")
public class ControllerServerChat {

    public ControllerServerChat(){
         System.out.println("Servidor rodando");
    }
    @OnOpen
    public void onOpen(Session session) {
        System.out.println("Connected ... " + session.getId());
    }

    @OnClose
    public void onClose(Session session) {
        System.out.println("Session " + session.getId() + " closed.");
    }

    @OnMessage
    public void onMessage(String message, Session session) {
        System.out.println("Received ...." + message);

    }

    @OnError
    public void onError(Throwable t) {
        t.printStackTrace();
    }
}
