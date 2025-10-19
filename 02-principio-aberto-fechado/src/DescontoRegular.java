public class DescontoRegular implements Desconto{
    public double calcular(double valorCompra) {
        return valorCompra * 0.1;
    }
}
