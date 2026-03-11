package eda;

public class TesteVetor4 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");

        System.out.println("Antes: " + vetor);

        vetor.limpar();

        System.out.println("Depois: " + vetor);
    }
}