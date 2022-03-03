package entidade;

public class Icms implements Imposto {
    private double valorimposto;


    public double getValorimposto() {
        return valorimposto;
    }


    public void setValorimposto(double valorimposto) {
        this.valorimposto = valorimposto;
    }


    @Override
    public double calculaimposto(Renda renda) {
        valorimposto = renda.getValor() * 0.05;
        return valorimposto;
    }


    @Override
    public String toString() {
        return "Icms [valor pago =" + valorimposto + "]";
    }


}
