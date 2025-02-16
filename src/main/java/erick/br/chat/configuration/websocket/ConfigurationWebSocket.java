package erick.br.chat.configuration.websocket;

import jakarta.websocket.server.ServerEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@Configuration
public class ConfigurationWebSocket {

    @Bean
    public ServerEndpointExporter serverEndpoint(){
        return  new ServerEndpointExporter();
    }
}
