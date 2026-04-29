package pilhas;

public class Main {
    public static void main(String[] args) {

        Pilha pilha = new Pilha(10);

        pilha.empilha("A");
        pilha.empilha("B");
        pilha.empilha("C");

        System.out.println("Topo: " + pilha.topo());

        String removido = pilha.desempilha();
        System.out.println("Removido: " + removido);

        System.out.println("Topo: " + pilha.topo());

        pilha.inverterPalavra("hello");

        pilha.isPalindromo("arara");

        pilha.isPalindromo("casa");

        System.out.println(pilha.inverterFrase("eu gosto de java"));

    }
}

/**\
 Respostas das questões fechadas
 7. b) Último que entra é o primeiro que sai
 8. c) A,B,D
 9. d) E
 10. b) 4,3,2,1
 11. b) overflow
 12. c) underflow
 13. c) push
 14. a) push e pop
 15. c) tamanho − 1 */