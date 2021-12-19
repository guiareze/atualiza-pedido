package br.com.guiareze.atualizapedido.core.ports.messaging;

import br.com.guiareze.atualizapedido.client.dto.PedidoDTO;
import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface AtualizaPedidoConsumer {

    void consumeMessage(ConsumerRecord<String, PedidoDTO> payload);

}
