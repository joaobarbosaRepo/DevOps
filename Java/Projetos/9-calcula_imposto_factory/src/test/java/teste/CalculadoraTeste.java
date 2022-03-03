package teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import entidade.Icms;
import entidade.Imposto;
import entidade.Irpf;
import entidade.Renda;
import excecao.ImpostoExcecao;
import factory.ImpostoFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
    @Test
    public void icmsTeste() {
        ImpostoFactory impostof = new ImpostoFactory();
        Imposto imposto = impostof.tipoImposto("ICMS");
        Assertions.assertTrue(imposto instanceof Icms);
    }

    @Test
    public void irpfTeste() {
        ImpostoFactory impostof = new ImpostoFactory();
        Imposto imposto = impostof.tipoImposto("IRPF");
        Assertions.assertTrue(imposto instanceof Irpf);
    }

    @Test
    public void calculadoratesteICMS() {
        Renda renda = new Renda(10000);
        ImpostoFactory impostof = new ImpostoFactory();
        Imposto imposto = impostof.tipoImposto("ICMS");
        assertEquals(500.0, imposto.calculaimposto(renda));
        renda.setValor(1000);
        assertEquals(50, imposto.calculaimposto(renda));
        renda.setValor(0);            //testando quando a renda for =0
        assertEquals(0, imposto.calculaimposto(renda));


    }

    @Test
    public void calculadoratesteIRPF() {
        Renda renda = new Renda(30000);
        ImpostoFactory impostof = new ImpostoFactory();
        Imposto imposto = impostof.tipoImposto("IRPF");
        assertEquals(3000, imposto.calculaimposto(renda));
        renda.setValor(1000);
        assertEquals(100, imposto.calculaimposto(renda));
        renda.setValor(0);               //testando quando a renda for =0
        assertEquals(0, imposto.calculaimposto(renda));


    }


    @Test
    public void calculadoraExcecaoTeste() {
        ImpostoExcecao thrown = Assertions.assertThrows(ImpostoExcecao.class, () -> {
            ImpostoFactory impostof = new ImpostoFactory();
            Imposto imposto = impostof.tipoImposto("ITT");
        });
        Assertions.assertEquals("TIPO DE IMPOSTO INVALIDO", thrown.getMessage());

    }
}
