package br.com.guiareze.atualizapedido.core.service;

import br.com.guiareze.atualizapedido.core.ports.messaging.AtualizaPedidoProducer;
import br.com.guiareze.atualizapedido.core.ports.operation.RecebePayloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecebePayloadServiceImpl implements RecebePayloadService {

    @Autowired
    private AtualizaPedidoProducer atualizaPedidoProducer;

    @Override
    public String recebePayloadEnviaParaTopico(String message) {
        atualizaPedidoProducer.sendMessage(message);
        return message;
    }

}
