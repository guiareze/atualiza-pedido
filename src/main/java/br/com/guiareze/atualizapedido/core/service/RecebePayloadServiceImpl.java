package br.com.guiareze.atualizapedido.core.service;

import br.com.guiareze.atualizapedido.client.dto.PedidoDTO;
import br.com.guiareze.atualizapedido.core.ports.messaging.AtualizaPedidoProducer;
import br.com.guiareze.atualizapedido.core.ports.operation.RecebePayloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecebePayloadServiceImpl implements RecebePayloadService {

    @Autowired
    private AtualizaPedidoProducer atualizaPedidoProducer;

    @Override
    public PedidoDTO recebePayloadEnviaParaTopico(PedidoDTO pedidoDTO) {
        atualizaPedidoProducer.sendMessage(pedidoDTO);
        return pedidoDTO;
    }

}
