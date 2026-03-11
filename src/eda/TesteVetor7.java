package eda;

public class TesteVetor7 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");

        System.out.println(vetor);

        vetor.remove(0);

        System.out.println(vetor);

        vetor.remove(1);

        System.out.println(vetor);

        vetor.remove(2);

        System.out.println(vetor);

        vetor.remove(10);
    }
}