package erick.br.chat.services.autentication;

import erick.br.chat.modelo.entity.Usuario;
import erick.br.chat.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ServicesAutenticationUser implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario userEncontrado = userRepository.buscarLoginDoUsuario(username);
        if(userEncontrado == null){
            throw  new UsernameNotFoundException("Usuario Não foi encontrado");
        }
        return new User(userEncontrado.getUsername(), userEncontrado.getSenha(), true, true, true, true, userEncontrado.getAuthorities());

    }
}
