package eda;



public class TesteVetor10 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("B");

        System.out.println(vetor);

        vetor.removerTodos("B");

        System.out.println(vetor);
    }
}