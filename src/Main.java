//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Criar um pedido
    Pedido pedido = new Pedido(1, "João", StatusPedido.AGUARDANDO_PAGAMENTO);

    // Exibir status inicial
    IO.println("Status inicial: " + pedido.getStatus());

    // Avançar status algumas vezes
    pedido.avancarStatus();
    IO.println("Após 1 avanço: " + pedido.getStatus());

    pedido.avancarStatus();
    IO.println("Após 2 avanços: " + pedido.getStatus());

//    pedido.avancarStatus();
//    IO.println("Após 3 avanços: " + pedido.getStatus());

    // Cancelar o pedido
    pedido.calcelarStatus();

    // Exibir status final
    IO.println("Status final: " + pedido.getStatus());
}
