package erick.br.chat.filter.login;

import erick.br.chat.enumerator.actions.EventWebSocket;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

@Component
public class MonitoraLoginUser implements ApplicationListener<AuthenticationSuccessEvent> {


    @Override
    public void onApplicationEvent(AuthenticationSuccessEvent event) {
        System.out.println(event + "Usuario Logou");

    }
}
