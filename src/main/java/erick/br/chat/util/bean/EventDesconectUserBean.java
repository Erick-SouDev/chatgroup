package erick.br.chat.util.bean;

import erick.br.chat.enumerator.actions.EventWebSocket;
import erick.br.chat.model.entity.Usuario;

public class EventDesconectUserBean {

    private Usuario usuario;
    private EventWebSocket eventWebSocket;

    public EventDesconectUserBean() {
    }

    public EventDesconectUserBean(Usuario usuario, EventWebSocket eventWebSocket) {
        this.usuario = usuario;
        this.eventWebSocket = eventWebSocket;
    }

    public EventWebSocket getEventWebSocket() {
        return eventWebSocket;
    }

    public void setEventWebSocket(EventWebSocket eventWebSocket) {
        this.eventWebSocket = eventWebSocket;
    }

    public Usuario getUserConect() {
        return usuario;
    }

    public void setUserConect(Usuario userConect) {
        this.usuario = userConect;
    }
}
