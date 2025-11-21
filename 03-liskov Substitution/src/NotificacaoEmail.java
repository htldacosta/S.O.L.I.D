public class NotificacaoEmail implements Notificacao{
    @Override
    public void enviar(String email, String mensagem){
        System.out.println("E-mail enviado para " + email + ": " + mensagem);
    }
}
