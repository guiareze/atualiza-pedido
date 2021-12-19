package br.com.guiareze.atualizapedido.core.ports.operation;

import br.com.guiareze.atualizapedido.client.dto.PedidoDTO;

public interface RecebePayloadService {

    PedidoDTO recebePayloadEnviaParaTopico(PedidoDTO pedidoDTO);

}
