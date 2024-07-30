package erick.br.chat.services.crud;

import erick.br.chat.model.entity.Usuario;
import erick.br.chat.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class ServicesRepositoryUser {

    @Autowired
    private UserRepository userRepository;

    public Usuario createUser(Usuario usuario){return   userRepository.saveAndFlush(usuario);}


}
