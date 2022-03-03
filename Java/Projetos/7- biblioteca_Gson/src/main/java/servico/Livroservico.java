package servico;


import arquivo.Livroarquivo;
import entidade.Livro;

import java.util.ArrayList;
import java.util.List;

public class Livroservico {
    private List<Livro>listaL;
    Livroarquivo livroarquivo= new Livroarquivo();


    public Livroservico() {
        listaL=new ArrayList <Livro> ();
    }

    public List<Livro> getListaL() {
        return listaL;
    }

    public boolean addLivro(Livro livro) {

        listaL.add(livro);
        livroarquivo.salvar(listaL);
        return true;

    }
    public boolean removeLivro(int id) {
        boolean y= false;
        for (int i=0; i< listaL.size();i++) {
            Livro b= listaL.get(i);
            if(b.getId()==id && b.getStatus()==false) {
                System.out.println("-Removendo livro id:" + id);
                listaL.remove(b);
                livroarquivo.salvar(listaL);

                y= true;
                return y;
            }
            else {
                System.out.println("Livro está emprestado, não pode ser removido.");
            }
        }
        return y;
    }
    public boolean pesquisAutor(String autor) {
        boolean y= false;
        for (int i=0; i< listaL.size();i++) {
            Livro b= listaL.get(i);
            if(b.getAutor().equalsIgnoreCase(autor)) {
                System.out.println("--Pesquisando por autor--");
                System.out.println("-Autor encontrado ");
                System.out.println("Autor:" +listaL.get(i).getAutor());
                System.out.println("Livro:"+ listaL.get(i).getTitle());
                System.out.println("Id: " +listaL.get(i).getId());
                y= true;

            }
        }
        return y;
    }
    public boolean pesquisaTitulo(String titulo) {
        boolean y= false;
        for (int i=0; i< listaL.size();i++) {
            Livro b= listaL.get(i);
            if(b.getTitle().equalsIgnoreCase(titulo)) {
                System.out.println("--Pesquisando por título--");
                System.out.println("AUTOR:" +listaL.get(i).getAutor());
                System.out.println("LIVRO:"+ listaL.get(i).getTitle());
                System.out.println("ID: " +listaL.get(i).getId());
                y= true;

            }

        }
        return y;
    }
    public void listarLivros() {
        System.out.println("---Lista de livros---");
        for(Livro f:listaL) {

            System.out.println(f);
        }
    }

    @Override
    public String toString() {
        return "Livroservico []";
    }








}
