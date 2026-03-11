package eda;

public class TesteVetor11 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adicionarSeNaoExiste("A");
        vetor.adicionarSeNaoExiste("B");
        vetor.adicionarSeNaoExiste("A");
        vetor.adicionarSeNaoExiste("B");

        System.out.println(vetor);
    }
}