package servico;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;


import arquivo.Emprestimoarquivo;
import entidade.Cliente;
import entidade.Emprestimo;
import entidade.Livro;

public class Emprestimoservico {
    private List<Emprestimo> emprestimos;
    Emprestimoarquivo emprestimoarquivo= new Emprestimoarquivo();
    public Emprestimoservico() {

        emprestimos= new ArrayList<Emprestimo>();
    }
    public boolean pegarEmprestimo(Livro livro,Cliente cliente,int ano,int mes,int dia) {
        boolean y= false;

        if(livro.getStatus()==true) {
            System.out.println("LIVRO "+livro.getId()+ " Ja ESTa EMPRESTADO");
            y= true;
        }
        else
        if(cliente.getNlivro()>=5) {
            System.out.println("Cliente só pode pegar 5 livros");
            y= true;
        }
        else {
            emprestimos.add(new Emprestimo(livro,cliente,LocalDate.of(ano, mes, dia)));
            cliente.setNlivro(cliente.getNlivro()+1);
            cliente.setNemprestimo(cliente.getNemprestimo()+1);
            livro.setStatus(true);
            emprestimoarquivo.salvar(emprestimos);
            y= true;
        }

        return y;
    }
    public void listarEmpres() {
        System.out.println("---Lista de emprestimos---");
        for(Emprestimo e:emprestimos) {
            System.out.println(e);
        }
    }
    public boolean renovaLivro(int id ,int idc) {
        boolean y= false;
        for (int i=0; i< emprestimos.size();i++) {
            Emprestimo l= emprestimos.get(i);
            if(l.getLivro().getId()==id && l.getCliente().getId()==idc)  {
                l.setEntregaE(LocalDate.now());
                int diasEmprestimo = (int) ChronoUnit.DAYS.between(l.getInicioE(),l.getEntregaE());
                int diasAtraso= diasEmprestimo-7;
                l.setDiasAt(diasAtraso);

                if(diasEmprestimo>7) {
                    double multa= diasAtraso*5;
                    l.setMulta(multa);
                    System.out.println("---Renovar emprestimo Livro: "+l.getLivro().getId()+" cliente: "+l.getCliente().getNome()+"---");
                    System.out.println("Voce Tem uma multa de ="+ multa);
                    l.setInicioE(LocalDate.now());
                    System.out.println("Multa paga,livro renovado em:" +l.getInicioE());
                    emprestimoarquivo.salvar(emprestimos);
                    y=true;

                } else
                if(diasEmprestimo<=7) {
                    System.out.println("---Renovar emprestimo Livro: "+l.getLivro().getId()+" cliente: "+l.getCliente().getNome()+"---");
                    System.out.println("Sem taxas adicionais, Parabens!!!");
                    l.setInicioE(LocalDate.now());
                    System.out.println(l.getCliente().getNome()+",você tem mais 7 dias para entregar sem taxas contando de:"+l.getInicioE());
                    emprestimoarquivo.salvar(emprestimos);
                    y=true;
                }
                break;
            }
        }
        return y;
    }
    public boolean devolvelivro(int id) {
        boolean y= false;


        for (int i=0; i< emprestimos.size();i++) {
            Emprestimo l= emprestimos.get(i);
            if(l.getLivro().getId()==id)  {
                l.setEntregaE(LocalDate.now());
                int diasEmprestimo = (int) ChronoUnit.DAYS.between(l.getInicioE(),l.getEntregaE());
                int diasAtraso= diasEmprestimo-7;

                l.setDiasAt(diasAtraso);
                if(diasAtraso>=1) {
                    double multa= diasAtraso*5;
                    l.setMulta(multa);
                    System.out.println("---Devolvendo livro id: "+l.getLivro().getId()+"---");
                    System.out.println("Voce Tem uma multa de ="+ multa);
                    System.out.println("Multa paga");
                    emprestimos.remove(i);
                    y=true;
                    l.getLivro().setStatus(false);
                    l.getCliente().setNlivro(l.getCliente().getNlivro()-1);
                    emprestimoarquivo.salvar(emprestimos);
                } else
                if(diasEmprestimo<=7) {
                    System.out.println("---Devolvendo livro id: "+l.getLivro().getId()+"---");
                    System.out.println("Sem taxas adicionais, Parabens!!!");
                    emprestimos.remove(i);
                    y=true;
                    l.getLivro().setStatus(false);
                    l.getCliente().setNlivro(l.getCliente().getNlivro()-1);
                    emprestimoarquivo.salvar(emprestimos);
                }
                break;
            }

        }
        return y;
    }
    public void listarAtrados() {
        for (int i=0; i< emprestimos.size();i++) {
            Emprestimo l= emprestimos.get(i);
            int diasEmprestimo= (int) ChronoUnit.DAYS.between(l.getInicioE(),LocalDate.now());
            int diasAtraso = diasEmprestimo-7;
            if(diasAtraso>=1) {
                System.out.println("Cliente: "+l.getCliente().getNome()+" Dias atraso: " +diasAtraso );
            }
        }
    }
}