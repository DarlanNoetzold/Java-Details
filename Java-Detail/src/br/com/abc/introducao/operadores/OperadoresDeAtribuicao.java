package br.com.abc.introducao.operadores;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        // =, -=, +=, *=, /=, %=
        int salario = 1800;
        int numero = 11;
        numero %= 2;
        numero = numero % 2;
        System.out.println(numero);
    }
}
