package erick.br.chat.repository.messsage;

import erick.br.chat.model.entity.Message;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface RepositoryMessage extends JpaRepository<Message, Long> {
}
