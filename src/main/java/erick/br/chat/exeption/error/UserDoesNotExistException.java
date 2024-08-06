package erick.br.chat.exeption.error;

public class UserDoesNotExistException extends Exception {
    public UserDoesNotExistException(String mensagemErro) {
        super(mensagemErro);
    }
}
