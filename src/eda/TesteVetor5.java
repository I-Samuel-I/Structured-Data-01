package eda;

public class TesteVetor5 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("A");
        vetor.adiciona("C");
        vetor.adiciona("A");

        int total = vetor.contarOcorrencias("A");

        System.out.println("Ocorrências de A: " + total);
    }
}