package model;

import service.ClienteService;

import java.util.List;

public class Cliente {
    private int id_cliente;
    private String nome;
    ClienteService cs;

    public Cliente(int id_cliente, String nome) {
        this.id_cliente = id_cliente;
        this.nome = nome;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id_cliente=" + id_cliente +
                ", nome='" + nome +
                '}';
    }
}
