package br.com.guiareze.atualizapedido.messaging.adapter;

import br.com.guiareze.atualizapedido.client.dto.PedidoDTO;
import br.com.guiareze.atualizapedido.core.ports.messaging.AtualizaPedidoProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class AtualizaPedidoProducerImpl implements AtualizaPedidoProducer {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    private static Logger logger = LoggerFactory.getLogger(AtualizaPedidoConsumerImpl.class);

    @Value("${topic.name}")
    private String topicName;

    @Override
    public void sendMessage(PedidoDTO pedidoDTO) {
        logger.info("Enviando Mensagem: {}", pedidoDTO);
        kafkaTemplate.send(topicName,pedidoDTO);
    }
}
