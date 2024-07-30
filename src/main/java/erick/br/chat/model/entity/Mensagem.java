package erick.br.chat.model.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_mensagem")
public class Mensagem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String contetudo;
    private Usuario userId;

    public String getContetudo() {
        return contetudo;
    }

    public void setContetudo(String contetudo) {
        this.contetudo = contetudo;
    }

    public Usuario getUserId() {
        return userId;
    }

    public void setUserId(Usuario userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mensagem mensagem = (Mensagem) o;
        return Objects.equals(id, mensagem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Mensagem{" +
                "contetudo='" + contetudo + '\'' +
                ", id=" + id +
                ", userId=" + userId +
                '}';
    }
}
