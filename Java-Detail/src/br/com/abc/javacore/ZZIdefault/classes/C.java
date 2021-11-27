package br.com.abc.javacore.ZZIdefault.classes;

import br.com.abc.javacore.ZZIdefault.interfaces.A;
import br.com.abc.javacore.ZZIdefault.interfaces.B;


public class C implements A, B {
    public static void main(String[] args) {
        new C().oi();
    }
    public void oi(){
        B.super.oi();
    }
}
