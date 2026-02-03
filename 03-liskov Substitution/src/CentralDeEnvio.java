public class CentralDeEnvio {

    public void processarEnvio(Notificacao tipoNotificacao, String destino, String texto) {


        System.out.println("--- Processando Envio");
        tipoNotificacao.enviar(destino, texto);
        System.out.println("---------------------");
    }
}
