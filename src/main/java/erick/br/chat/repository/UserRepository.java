package erick.br.chat.repository;

import erick.br.chat.model.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.rmi.server.UID;
import java.util.UUID;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<Usuario, UUID> {



}
