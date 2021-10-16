package br.com.abc.javacore.ZZBclassesinternas.test;

public class ClassesLocaisTest {
    private String nome = " Darlan";

    public void fazAlgumaCoisa() {
        String sobrenome = "Noetzold";
        class Interna {
            public void imprimeNomeExterno() {
                System.out.println(nome);
            }
        }
        Interna in = new Interna();
        in.imprimeNomeExterno();
    }

    public static void main(String[] args) {
        ClassesLocaisTest externa = new ClassesLocaisTest();
        externa.fazAlgumaCoisa();
    }
}
