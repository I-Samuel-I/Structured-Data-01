package eda;

public class TesteVetor2 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");

        System.out.println("Posição de C: " + vetor.busca("C"));

        System.out.println("Contém A? " + vetor.contem("A"));

        System.out.println("Contém X? " + vetor.contem("X"));
    }
}