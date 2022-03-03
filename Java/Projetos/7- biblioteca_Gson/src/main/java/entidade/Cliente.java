package entidade;

public class Cliente {
    private String nome;
    private int id;
    private int nemprestimo;
    private int nlivro;
    public Cliente() {

    }
    public Cliente(int id,String nome) {
        this.id=id;
        this.nome=nome;
    }
    public Cliente(String nome, int id, int nemprestimo, int nlivro) {
        this.nome = nome;
        this.id = id;
        this.nemprestimo = nemprestimo;
        this.nlivro = nlivro;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNemprestimo() {
        return nemprestimo;
    }
    public void setNemprestimo(int nemprestimo) {
        this.nemprestimo = nemprestimo;
    }
    public int getNlivro() {
        return nlivro;
    }
    public void setNlivro(int nlivro) {
        this.nlivro = nlivro;
    }
    @Override
    public String toString() {
        return "Cliente [Nome=" + nome + ", id=" + id + ", Emprestimos geral=" + nemprestimo + ", Livros emprestados=" + nlivro + "]";
    }



}

