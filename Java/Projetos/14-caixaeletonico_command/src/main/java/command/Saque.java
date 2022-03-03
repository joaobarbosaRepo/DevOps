package command;
public class Saque implements Solicitacao {
	private double saque;
public Saque(double saque){
	this.saque=saque;
}
	@Override
	public double solicitar() {
		return -this.saque;
	}
	@Override
	public String toString() {
		return "Saque [saque=" + saque + "]";
	}
	

}
