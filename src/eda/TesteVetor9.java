package eda;

public class TesteVetor9 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("B");
        vetor.adiciona("D");
        vetor.adiciona("B");

        System.out.println(vetor);

        System.out.println("Último índice de B: " + vetor.indiceUltimo("B"));
    }
}