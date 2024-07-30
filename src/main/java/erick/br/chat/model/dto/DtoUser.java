package erick.br.chat.model.dto;


import java.util.UUID;
public class DtoUser {
    private  UUID Id;
    private  String nome;

    public void setId(UUID id) {
        Id = id;
    }

    public UUID getId() {
        return  this.Id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
