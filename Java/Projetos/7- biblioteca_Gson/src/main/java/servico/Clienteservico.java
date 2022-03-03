package servico;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import arquivo.Clientearquivo;
import entidade.Cliente;


public class Clienteservico {
    private List<Cliente> clientes;
    Clientearquivo clientearquivo= new Clientearquivo();
    public Clienteservico() {
        clientes=new ArrayList<Cliente>();
    }
    public boolean addCliente(Cliente cliente) {
        clientes.add(cliente);
        clientearquivo.salvar(clientes);
        return true;
    }
    public boolean removeCliente(Cliente cliente) {
        boolean y= false;
        if(cliente.getNlivro()==0) {
            clientes.remove(cliente);
            clientearquivo.salvar(clientes);
            y= true;
        }
        return y;
    }
    public boolean listaCliente() {
        boolean y=false;
        if(clientes!=null) {
            y=true;
            System.out.println("---Lista de clientes---");
            for(Cliente f:clientes) {
                System.out.println(f);
            }
        }
        return y;
    }
    public boolean pesquisaNome(String nome) {
        boolean y= false;
        for (int i=0; i< clientes.size();i++) {
            Cliente c=clientes.get(i);
            if(c.getNome().equalsIgnoreCase(nome)) {
                System.out.println("--Pesquisando cliente--");
                System.out.println("-Cliente encontrado ");
                System.out.println("id:"+ clientes.get(i).getId());
                System.out.println("nome:"+ clientes.get(i).getNome());

                y= true;
            }

        }
        return y;
    }
    public boolean contadorLivro(int id) {
        boolean y= false;
        for (int i=0; i< clientes.size();i++) {
            Cliente c=clientes.get(i);
            if(c.getId()==id) {
                System.out.println("Nome do cliente:"+c.getNome()+" Número de livros:"+c.getNlivro());
                y= true;
            }

        }
        return y;
    }
    public boolean contadoremprestimo(int id) {
        boolean y= false;
        for (int i=0; i< clientes.size();i++) {
            Cliente c=clientes.get(i);
            if(c.getId()==id) {
                System.out.println("Nome do cliente:"+c.getNome()+" Número de emprestimo:"+c.getNemprestimo());
                y= true;
            }

        }
        return y;
    }
    public String top10usuarios() {
        StringBuilder top10LIsta = new StringBuilder();
        System.out.println("---TOP 10 CLIENTES FIZERAM MAIS EMPRESTIMO---");
        clientes.stream().sorted(Comparator.comparingInt(Cliente::getNemprestimo).reversed()).limit(10)
                .collect(Collectors.toList()).forEach(l -> top10LIsta.append(l).append("\n"));


        return top10LIsta.toString();
    }
}

