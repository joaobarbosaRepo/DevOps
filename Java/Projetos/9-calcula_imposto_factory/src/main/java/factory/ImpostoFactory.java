package factory;

import entidade.Icms;
import entidade.Imposto;
import entidade.Irpf;
import excecao.ImpostoExcecao;

public class ImpostoFactory {
    public Imposto tipoImposto(String tipoimpost) {

        if (tipoimpost == "ICMS") {
            return new Icms();
        }
        if (tipoimpost == "IRPF") {
            return new Irpf();
        }

        throw new ImpostoExcecao("TIPO DE IMPOSTO INVALIDO");

    }

}
