package br.com.guiareze.atualizapedido.client.dto;

public class PedidoDTO {

    private String id;
    private String status;
    private String responsavel;

    public PedidoDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return "PedidoDTO{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", responsavel='" + responsavel + '\'' +
                '}';
    }
}
