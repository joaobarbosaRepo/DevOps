package excecao;

public class ImpostoExcecao extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ImpostoExcecao(String mensagem) {
        super(mensagem);
    }

}
