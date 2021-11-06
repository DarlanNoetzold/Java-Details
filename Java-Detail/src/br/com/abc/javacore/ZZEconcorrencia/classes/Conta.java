package br.com.abc.javacore.ZZEconcorrencia.classes;


public class Conta {
    private int saldo = 50;

    public int getSaldo() {
        return saldo;
    }

    public void saque(int valor) {
        saldo = saldo - valor;
    }
}
