package erick.br.chat.exeption.error;

public class ErrorNotSaveUserJpa extends  NullPointerException {

    public  ErrorNotSaveUserJpa(String menssagem){
        super(menssagem);
    }
}
