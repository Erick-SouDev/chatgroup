package erick.br.chat.util.encoder;

import erick.br.chat.model.entity.Mensagem;
import jakarta.websocket.EncodeException;
import jakarta.websocket.Encoder;
import jakarta.websocket.EndpointConfig;

public class MessageEncoder implements Encoder.Text<Mensagem> {
    /**
     * @param object
     * @return
     * @throws EncodeException
     */
    @Override
    public String encode(Mensagem object) throws EncodeException {
        return "";
    }

    /**
     * Initialise the encoder. The default implementation is a NO-OP.
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
