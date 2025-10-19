public class DescontoVip implements Desconto{
    public double calcular(double valorCompra) {
        return valorCompra * 0.2;
    }
}
