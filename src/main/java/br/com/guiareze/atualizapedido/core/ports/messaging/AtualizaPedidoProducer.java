package br.com.guiareze.atualizapedido.core.ports.messaging;

import br.com.guiareze.atualizapedido.client.dto.PedidoDTO;

public interface AtualizaPedidoProducer {

    void sendMessage(PedidoDTO pedidoDTO);

}
