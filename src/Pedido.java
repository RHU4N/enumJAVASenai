public class Pedido {
    private int id;
    private String cliente;
    private StatusPedido status = StatusPedido.AGUARDANDO_PAGAMENTO;


    public Pedido() {
    }


    public Pedido(int id, String cliente, StatusPedido status) {
        this.id = id;
        this.cliente = cliente;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public void avancarStatus(){
        switch (this.status) {
            case AGUARDANDO_PAGAMENTO:
                this.status = StatusPedido.PROCESSANDO;
                break;
            case PROCESSANDO:
                this.status = StatusPedido.ENVIADO;
                break;
            case ENVIADO:
                this.status = StatusPedido.ENTREGUE;
                break;
            case ENTREGUE:
            case CANCELADO:
                break;
            default:
                this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
                break;
        }
    }

    public void calcelarStatus(){
        if (status != StatusPedido.ENTREGUE){
            IO.println("Pedido calcelado");
            this.status = StatusPedido.CANCELADO;
        }else {
            IO.println("O pedido já foi entregue");
        }
    }
}
