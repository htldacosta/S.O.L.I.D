public class Main {
    public static void main(String[] args) {

        CalculadoraDesconto calc = new CalculadoraDesconto();

        double valor = 1000;
        double descontoVip = calc.calcular(new DescontoVip(), valor);
        double descontoRegular = calc.calcular(new DescontoRegular(), valor);

        System.out.println("Desconto VIP: " + descontoVip);
        System.out.println("Desconto Regular: " + descontoRegular);
    }
}