public class ServicoDeEmail {

    public void envioConfirmacao(Pedido pedido) {
        System.out.println("E-mail de confirmação do pedido " + pedido.getId());
    }
}
