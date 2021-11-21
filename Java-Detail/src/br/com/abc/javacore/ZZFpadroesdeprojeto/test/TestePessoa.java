package br.com.abc.javacore.ZZFpadroesdeprojeto.test;

import br.com.abc.javacore.ZZFpadroesdeprojeto.classes.Pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa.PessoaBuilder("Darlan")
                .nomeDoMeio("a")
                .ultimoNome("Noetzold")
                .nomeDoPai("Clovis")
                .apelido("JirayaBolado")
                .build();
        System.out.println(p);
    }
}
