package command;
public class Deposito implements Solicitacao {
    private double valor;
    
    public  Deposito(double valor) {
    	 this.valor= valor;
    }
	@Override
	public double solicitar() {
	
		return this.valor;
		
	}
	@Override
	public String toString() {
		return "Deposito [valor=" + valor + "]";
	}

}
