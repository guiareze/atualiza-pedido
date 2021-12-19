package br.com.guiareze.atualizapedido;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class AtualizaPedidoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtualizaPedidoApplication.class, args);
	}

}
