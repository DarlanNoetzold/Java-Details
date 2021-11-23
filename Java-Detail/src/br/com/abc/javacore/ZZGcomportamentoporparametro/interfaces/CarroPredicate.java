package br.com.abc.javacore.ZZGcomportamentoporparametro.interfaces;

import br.com.abc.javacore.ZZGcomportamentoporparametro.classes.Carro;

@FunctionalInterface
public interface CarroPredicate {
    boolean test(Carro carro);
}
