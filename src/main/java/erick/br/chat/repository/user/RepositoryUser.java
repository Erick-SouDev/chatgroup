package erick.br.chat.repository.user;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import  erick.br.chat.model.entity.*;
import java.util.UUID;

@Repository
public interface RepositoryUser extends JpaRepository<Usuario, UUID> {

    @Transactional
    @Query("select u from Usuario u where u.email = ?1 and u.senha = ?2")
    public Usuario buscarUsuario(@Param("email") String email , @Param("senha") String senha);

    @Transactional
    @Query("SELECT u.nome , u.id from Usuario as u where u.email = ?1")
    public  Usuario pesquisarUsuarioEmail(@Param("email") String email);



}
