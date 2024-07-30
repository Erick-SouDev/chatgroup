package erick.br.chat.util.encoder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import erick.br.chat.model.entity.Mensagem;
import jakarta.websocket.EncodeException;
import jakarta.websocket.Encoder;
import jakarta.websocket.EndpointConfig;


public class MessageEncoder implements Encoder.Text<Mensagem> {

    public  static  final  ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    @Override
    public String encode(Mensagem object) throws EncodeException {
        try {
            return  OBJECT_MAPPER.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
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
