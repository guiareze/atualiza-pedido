package br.com.guiareze.atualizapedido.client.controller;

import br.com.guiareze.atualizapedido.client.dto.PedidoDTO;
import br.com.guiareze.atualizapedido.core.ports.operation.RecebePayloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {

    @Autowired
    private RecebePayloadService recebePayloadService;

    @PostMapping("/atualiza-pedido")
    public ResponseEntity<String> enviaAtualizacaoPedido(@RequestBody PedidoDTO pedidoDTO){
        recebePayloadService.recebePayloadEnviaParaTopico(pedidoDTO);
        return ResponseEntity.status(HttpStatus.OK).body("OK");
    }

}
