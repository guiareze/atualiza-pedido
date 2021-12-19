package br.com.guiareze.atualizapedido.core.ports.messaging;

import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface AtualizaPedidoConsumer {

    void consumeMessage(ConsumerRecord<String, String> payload);

}
