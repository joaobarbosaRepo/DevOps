
package entidade;

public class Contato {
	private String nome;
	private int id;
	private String numero;
	private String email;

	public Contato(String nome, String numero, String email) {
		this.nome = nome;
		this.numero = numero;
		this.email = email;
	}

	public Contato() {

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "[ID: " + id + " NOME: " + nome + " CONTATO: " + numero + " EMAIL:" + email + "]" + "\n"
				+ "---------------------------";

	}

}
