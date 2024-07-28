package erick.br.chat.services.jpa.repository;

import erick.br.chat.exeption.error.ErrorNotSaveUserJpa;
import erick.br.chat.model.Usuario;
import erick.br.chat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@Component
public class ServicesRepositoryUser {

    @Autowired
    private UserRepository userRepository;

    public  Usuario createUser(Usuario usuario){return   userRepository.saveAndFlush(usuario);
    }

}
