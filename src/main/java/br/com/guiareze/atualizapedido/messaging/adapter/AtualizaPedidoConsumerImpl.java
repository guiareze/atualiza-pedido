package br.com.guiareze.atualizapedido.messaging.adapter;

import br.com.guiareze.atualizapedido.client.dto.PedidoDTO;
import br.com.guiareze.atualizapedido.core.ports.messaging.AtualizaPedidoConsumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class AtualizaPedidoConsumerImpl implements AtualizaPedidoConsumer {

    private static Logger logger = LoggerFactory.getLogger(AtualizaPedidoConsumerImpl.class);

    @Value("${topic.name}")
    private String topicName;

    @Override
    @KafkaListener(topics = "${topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeMessage(ConsumerRecord<String, PedidoDTO> payload) {
        logger.info("Efetuando leitura de mensagem da fila..");
        logger.info("Tópico: {}", topicName);
        logger.info("key: {}", payload.key());
        logger.info("Headers: {}", payload.headers());
        logger.info("Partion: {}", payload.partition());
        logger.info("Order: {}", payload.value());
    }

}
