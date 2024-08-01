package erick.br.chat.components.monitoring.session;

import org.springframework.security.authentication.event.*;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component(value = "monitora evento login")
public class MonitorEventLogin implements   ApplicationListener<AuthenticationSuccessEvent>{


    @Override
    public void onApplicationEvent(AuthenticationSuccessEvent event) {


    }
}
