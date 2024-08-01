package erick.br.chat.components.monitoring.session;

import erick.br.chat.controller.websocket.ControllerServerChat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.LogoutSuccessEvent;
import org.springframework.stereotype.Component;

@Component(value = "monitora evento de logout")
public class MonitorEventLogout implements ApplicationListener<LogoutSuccessEvent> {


    @Override
    public void onApplicationEvent(LogoutSuccessEvent event) {
        System.out.println(event.getAuthentication() + " Usuario deslogou");
    }
}
