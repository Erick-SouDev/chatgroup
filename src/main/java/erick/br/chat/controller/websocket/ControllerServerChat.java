package erick.br.chat.controller.websocket;

import erick.br.chat.util.decoder.MessageDecoder;
import erick.br.chat.util.encoder.MessageEncoder;
import jakarta.websocket.*;
import jakarta.websocket.server.ServerEndpoint;
import org.springframework.stereotype.Component;


@Component
@ServerEndpoint(value = "/chatgroup" ,decoders = {MessageDecoder.class} , encoders = {MessageEncoder.class})
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
