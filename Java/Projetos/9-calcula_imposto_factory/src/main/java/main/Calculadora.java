package main;

import entidade.Imposto;
import entidade.Renda;
import factory.ImpostoFactory;

public class Calculadora {

    public static void main(String[] args) {
        Renda renda = new Renda(20000);
        ImpostoFactory impostof = new ImpostoFactory();
        Imposto imposto = impostof.tipoImposto("ICMS");
        System.out.println("**Imposto de ICMS**");
        System.out.println(imposto.calculaimposto(renda));
        System.out.println("-----------------------");
        System.out.println("**Imposto de IRPF**");
        imposto = impostof.tipoImposto("IRPF");
        System.out.println(imposto.calculaimposto(renda));


    }

}
