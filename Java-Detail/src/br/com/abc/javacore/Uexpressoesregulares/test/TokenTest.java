package br.com.abc.javacore.Uexpressoesregulares.test;

public class TokenTest {
    public static void main(String[] args) {
        String str = "William9 Paulo1 Joana2 Camila3 Anna4 John5 Matheus";
        String[] tokens = str.split("\\d");
        for(String arr: tokens){
            System.out.println(arr.trim());
        }
    }
}
