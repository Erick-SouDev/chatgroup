package erick.br.chat.services.autentication;

import erick.br.chat.exeption.error.UserDoesNotExistException;
import erick.br.chat.implents.authtication.lmplementAuthentication;
import erick.br.chat.model.entity.Usuario;
import erick.br.chat.repository.user.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class ServicesAutenticationUser implements lmplementAuthentication {

    @Autowired
    private RepositoryUser userRepository;


    @Override
    public Usuario authenticationUser(String user, String password) {
        Usuario usuarioEncontrado = userRepository.buscarUsuario(user, password);
        if (!(usuarioEncontrado != null)) {
            new UserDoesNotExistException("Usuario Não pode ser encontrado");
        }

        return usuarioEncontrado;
    }
}

