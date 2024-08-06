package erick.br.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.socket.config.annotation.EnableWebSocket;


@SpringBootApplication
@EnableWebSocket
@EnableWebMvc
@EntityScan(basePackages = {"erick.br.chat.model"})
@ComponentScan(basePackages = {"erick.br.chat.*"})
public class ChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatApplication.class, args);
	}


}
