package entidade;



import java.util.ArrayList;
import java.util.List;



public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private boolean status;

    public Livro() {

    }


    public boolean getStatus() {
        return status;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }


    public Livro(int id, String titulo, String autor) {

        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.status= false;
    }




    public int getId() {
        return id;
    }

    public int setId(int id) {
        return this.id = id;
    }

    public String getTitle() {
        return titulo;
    }

    public void setTitle(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return  "[LIVRO"+"Id=" +id+ " Autor="+ autor+" Titulo="+titulo+ "]";
    }


}
