package eda;

public class TesteVetor1 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");

        System.out.println("Tamanho: " + vetor.tamanho());

        System.out.println(vetor);

        vetor.imprimeUmPorLinha();
    }
}