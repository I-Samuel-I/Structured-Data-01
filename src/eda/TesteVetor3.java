package eda;

public class TesteVetor3 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        try{
            vetor.ultimo();
        } catch (IllegalStateException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

        vetor.adiciona("A");
        vetor.adiciona("B");

        System.out.println("Último: " + vetor.ultimo());
    }
}