package entidade;

public class Irpf implements Imposto {
    private double valorimposto;

    @Override
    public double calculaimposto(Renda renda) {
        valorimposto = renda.getValor() * 0.10;
        return valorimposto;
    }


    public double getValorimposto() {
        return valorimposto;
    }


    public void setValorimposto(double valorimposto) {
        this.valorimposto = valorimposto;
    }


    @Override
    public String toString() {
        return "Irpf [valor pago =" + valorimposto + "]";
    }

}
