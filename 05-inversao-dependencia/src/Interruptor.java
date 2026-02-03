public class Interruptor {
    private Ligavel dispositivo;

    // Eu recebo 'algo ligável'. Não me importa se é lâmpada ou motor.
    public Interruptor(Ligavel dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void apertar() {
        dispositivo.ligar();
    }
}