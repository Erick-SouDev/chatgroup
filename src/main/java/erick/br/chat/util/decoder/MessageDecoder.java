package erick.br.chat.util.decoder;

import erick.br.chat.model.entity.Mensagem;
import jakarta.websocket.DecodeException;
import jakarta.websocket.Decoder;
import jakarta.websocket.EndpointConfig;

public class MessageDecoder implements Decoder.Text<Mensagem> {
    /**
     * @param s
     * @return
     * @throws DecodeException
     */
    @Override
    public Mensagem decode(String s) throws DecodeException {
        return null;
    }

    /**
     * @param s
     * @return
     */
    @Override
    public boolean willDecode(String s) {
        return false;
    }

    /**
     * Initialise the decoder. The default implementation is a NO-OP.
     *
     * @param endpointConfig The end-point configuration
     */
    @Override
    public void init(EndpointConfig endpointConfig) {
        Text.super.init(endpointConfig);
    }

    /**
     * Destroy the decoder. The default implementation is a NO-OP.
     */
    @Override
    public void destroy() {
        Text.super.destroy();
    }
}
