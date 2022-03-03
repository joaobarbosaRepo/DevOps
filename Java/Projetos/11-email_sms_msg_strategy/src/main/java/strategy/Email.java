package strategy;


public class Email implements  MensagemStrategy{
    @Override
    public String enviaMensagem(String mensagem) {
        return "Enviando Email- "+mensagem;
    }
}
