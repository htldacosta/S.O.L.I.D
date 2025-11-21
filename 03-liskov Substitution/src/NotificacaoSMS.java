public class NotificacaoSMS implements Notificacao{

    @Override
    public void enviar(String numero, String mensagem){
        System.out.println("SMS enviado para " + numero + ": " + mensagem);
    }
}
