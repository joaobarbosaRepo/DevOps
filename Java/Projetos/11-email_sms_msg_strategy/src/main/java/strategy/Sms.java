package strategy;

public class Sms implements  MensagemStrategy{
    @Override
    public String enviaMensagem(String mensagem) {
        return "Enviando SMS- "+mensagem;
    }
}