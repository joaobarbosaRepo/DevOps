package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import db.Dbexception;
import db.Dbconexao;
import entidade.Contato;

public class ContatoDao {
	public void salvar(Contato contato) {

		String sql = "INSERT INTO contatos(nome,numero,email)VALUES(?,?,?)";

		try {
			Connection conn = Dbconexao.createConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			if (pesquisaPnumero(contato.getNumero()) == null) {
				pstm.setString(1, contato.getNome());
				pstm.setString(2, contato.getNumero());
				pstm.setString(3, contato.getEmail());
				pstm.execute();
				System.out.println("***Contato salvo****");
			} else {
				System.out.println("**Atenção contato já existe**");

			}

		} catch (Exception s) {
			throw new Dbexception(s.getMessage());
		}

	}

	public List<Contato> getContatos() {
		String sql = "SELECT * FROM contatos";
		List<Contato> contatos = new ArrayList<Contato>();

		// vai recuperar os dados do banco ***select***

		try {
			Connection conn = db.Dbconexao.createConnection();
			PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rset = pstm.executeQuery();

			while (rset.next()) {
				Contato contato = new Contato();
				// Recupera id
				contato.setId(rset.getInt("id"));
				// Recupera nome
				contato.setNome(rset.getString("nome"));
				// Recupera contato
				contato.setNumero(rset.getString("numero"));
				// Recupera email
				contato.setEmail(rset.getString("email"));
				contatos.add(contato);

			}
		} catch (Exception e) {
			throw new Dbexception(e.getMessage());
		}
		return contatos;
	}

	public void deletaPid(int id) {
		String sql = "DELETE FROM contatos WHERE id=?";

		try {
			Connection conn = Dbconexao.createConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			pstm.execute();
		} catch (Exception e) {
			throw new Dbexception(e.getMessage());
		}

	}

	public List<Contato> pesquisaPnome(String nome) {
		String sql = "SELECT * FROM contatos WHERE nome=?";
		List<Contato> contatos = new ArrayList<Contato>();
		try {
			Connection conn = Dbconexao.createConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, nome);
			ResultSet rset = pstm.executeQuery();
			while (rset.next()) {
				Contato contato = new Contato();
				// Recupera id
				contato.setId(rset.getInt("id"));
				// Recupera nome
				contato.setNome(rset.getString("nome"));
				// Recupera contato
				contato.setNumero(rset.getString("numero"));
				// Recupera email
				contato.setEmail(rset.getString("email"));
				contatos.add(contato);

			}
		} catch (Exception e) {
			throw new Dbexception(e.getMessage());
		}
		return contatos;
	}

	public void atualizaCadastro(Contato contato) {
		String sql = "UPDATE contatos SET nome = ?, numero = ?, email = ?" + "WHERE id = ?";

		try {
			Connection conn = db.Dbconexao.createConnection();
			PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
			// Atuliza valores no banco de dados.
			pstm.setString(1, contato.getNome());
			pstm.setString(2, contato.getNumero());
			pstm.setString(3, contato.getEmail());
			pstm.setInt(4, contato.getId());
			pstm.execute();

		} catch (Exception s) {
			throw new Dbexception(s.getMessage());
		}
	}

	public Contato pesquisaPnumero(String numero) {
		String sql = "SELECT * FROM contatos WHERE numero=?";

		try {
			Connection conn = Dbconexao.createConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, numero);
			ResultSet rset = pstm.executeQuery();
			Contato contato = new Contato();
			if (rset.next()) {

				contato.setId(rset.getInt("id"));
				// Recupera nome
				contato.setNome(rset.getString("nome"));
				// Recupera contato
				contato.setNumero(rset.getString("numero"));
				// Recupera email
				contato.setEmail(rset.getString("email"));

			} else {
				System.out.println("Não existe cadastro com esse número");
			}
			return contato;

		} catch (Exception e) {
			throw new Dbexception(e.getMessage());
		}
	}

}
