package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
private String name;
private String email;
private Date aniversario;
private int idcliente;
public Cliente(String name, String email, Date aniversario,int idcliente) {
	
	this.name = name;
	this.email = email;
	this.aniversario = aniversario;
	this.idcliente-= idcliente;
}
public int getIdcliente() {
	return idcliente;
}
public void setIdcliente(int idcliente) {
	this.idcliente = idcliente;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public Date getAniversario() {
	return aniversario;
}
public void setAniversario(Date aniversario) {
	this.aniversario = aniversario;
}
@Override
public String toString() {
	return name+"("+sdf.format(aniversario)+ ") "+email;
}


}
