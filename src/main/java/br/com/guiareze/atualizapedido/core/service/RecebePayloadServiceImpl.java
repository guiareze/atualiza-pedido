package br.com.guiareze.atualizapedido.core.service;

import br.com.guiareze.atualizapedido.client.dto.PedidoDTO;
import br.com.guiareze.atualizapedido.core.ports.messaging.AtualizaPedidoProducer;
import br.com.guiareze.atualizapedido.core.ports.operation.RecebePayloadService;
import br.com.guiareze.atualizapedido.pedido_a_atualizar.PedidoAtualizacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecebePayloadServiceImpl implements RecebePayloadService {

    @Autowired
    private AtualizaPedidoProducer atualizaPedidoProducer;

    @Override
    public PedidoDTO recebePayloadEnviaParaTopico(PedidoDTO pedidoDTO) {
        var pedido = PedidoAtualizacao.newBuilder()
                .setId(pedidoDTO.getId())
                .setStatus(pedidoDTO.getStatus())
                .setResponsavel(pedidoDTO.getResponsavel())
                .build();
        atualizaPedidoProducer.sendMessage(pedidoDTO);
        return pedidoDTO;
    }

}
