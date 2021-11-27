package br.com.abc.javacore.ZZIdefault.interfaces;


public interface MyList {
    static void sort(){
        System.out.println("dentro do sort");
    }
    void add();

    default void remove(){
        System.out.println("dentro do remove");
    }

}
