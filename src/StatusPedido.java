public enum StatusPedido {
    AGUARDANDO_PAGAMENTO("Aguardando pagamento do cliente"),
    PROCESSANDO("Processando"),
    ENVIADO("Pedido enviado para entrega"),
    ENTREGUE("Pedido entregue"),
    CANCELADO("Pedido cancelado"),;

    private String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
