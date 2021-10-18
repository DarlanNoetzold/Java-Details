package br.com.abc.javacore.ZZBclassesinternas.test;

public class ClassesLocaisTest {
    private String nome1 = " Darlan";

    public void fazAlgumaCoisa() {
        String sobrenome1 = "Noetzold";
        class Interna {
            public void imprimeNomeExterno() {
                System.out.println(nome1);
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
