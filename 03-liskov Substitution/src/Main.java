public class Main {
    public static void main(String[] args) {

        CentralDeEnvio central = new CentralDeEnvio();

        Notificacao sms = new NotificacaoSMS();


        central.processarEnvio(sms, "99999-9999", "Seu código de confirmação é 1234.");

        Notificacao email = new NotificacaoSMS();

        central.processarEnvio(email, "usuario@dominio.com", " Obrigado por se cadastrar.");

    }
}