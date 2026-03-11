package eda;

public class TesteVetor6 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");

        System.out.println(vetor);

        boolean trocou = vetor.substituir("B", "X");

        System.out.println("Substituiu? " + trocou);

        System.out.println(vetor);
    }
}