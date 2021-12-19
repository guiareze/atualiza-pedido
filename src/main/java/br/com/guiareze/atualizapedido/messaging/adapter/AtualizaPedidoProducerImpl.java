package br.com.guiareze.atualizapedido.messaging.adapter;

import br.com.guiareze.atualizapedido.core.ports.messaging.AtualizaPedidoProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class AtualizaPedidoProducerImpl implements AtualizaPedidoProducer {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Value("${topic.name}")
    private String topicName;

    @Override
    public void sendMessage(String message) {
        System.out.println("Enviar mensagem: " + message);
        kafkaTemplate.send(topicName,message);
    }
}
