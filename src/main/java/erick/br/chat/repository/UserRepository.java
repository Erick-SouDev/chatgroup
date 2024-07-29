package erick.br.chat.repository;

import erick.br.chat.model.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.rmi.server.UID;
import java.util.UUID;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<Usuario, UUID> {

    @Query("select u from Usuario u where u.email = ?1")
    public Usuario buscarLoginDoUsuario(@Param("email") String email);





}
