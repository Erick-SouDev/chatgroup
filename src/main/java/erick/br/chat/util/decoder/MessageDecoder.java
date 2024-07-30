package erick.br.chat.util.decoder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import erick.br.chat.model.entity.Mensagem;
import jakarta.websocket.DecodeException;
import jakarta.websocket.Decoder;
import jakarta.websocket.EndpointConfig;

public class MessageDecoder implements Decoder.Text<Mensagem> {

    public  static  final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Override
    public Mensagem decode(String message) throws DecodeException {
        try {
            return OBJECT_MAPPER.readValue(message , Mensagem.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public boolean willDecode(String s) {
        return false;
    }

    @Override
    public void init(EndpointConfig endpointConfig) {
        Text.super.init(endpointConfig);
    }


    @Override
    public void destroy() {
        Text.super.destroy();
    }
}
