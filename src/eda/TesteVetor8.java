package eda;

public class TesteVetor8 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("B");
        vetor.adiciona("D");

        System.out.println(vetor);

        vetor.remove("B");

        System.out.println(vetor);

        vetor.remove("X");

        System.out.println(vetor);
    }
}