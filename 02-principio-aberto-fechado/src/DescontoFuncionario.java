public class DescontoFuncionario implements Desconto {
    public double calcular(double valorCompra) {
        return valorCompra * 0.3;
    }
}
