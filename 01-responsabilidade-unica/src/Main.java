public class Main {
    public static void main(String[] args) {

        Pedido novoPedido = new Pedido("PEDido-1234", 200.00);

        RepositorioDePedidos repositorio = new RepositorioDePedidos();
        ServicoDeEmail email = new ServicoDeEmail();
        ImpressoraDeNotaFiscal impressora = new ImpressoraDeNotaFiscal();

        repositorio.salvar(novoPedido);
        email.envioConfirmacao(novoPedido);
        impressora.imprimir(novoPedido);
    }
}