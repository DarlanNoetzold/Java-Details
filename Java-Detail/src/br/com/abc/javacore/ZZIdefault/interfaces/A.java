package br.com.abc.javacore.ZZIdefault.interfaces;


public interface A {
    default void oi(){
        System.out.println("Dentro do oi de A");
    }
}
