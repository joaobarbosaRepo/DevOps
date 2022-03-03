package com.joaobilegra.core.tema06;

public class Contato {
	private String nome;
	private int id;
    private String numero;
    
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Contato(String nome, int id, String contato) {
		
		this.nome = nome;
		this.id = id;
		this.numero = contato;
	}
	@Override
	public String toString() {
		return "ID:" + id+"\n"
				+ "NOME: " + nome+"\n"
				+ "CONTATO: " +numero +"\n"
				+"---------------------------";
		
  }
}
