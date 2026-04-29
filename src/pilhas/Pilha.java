package pilhas;

public class Pilha {

    private String[] elementos;
    private int tamanho;

    public Pilha(int capacidade) {
        elementos = new String[capacidade];
        tamanho = 0;
    }

    // empilhar (push)
    public void empilha(String elemento) {
        elementos[tamanho] = elemento;
        tamanho++;
    }

    // desempilhar (pop)
    public String desempilha() {

        if (estaVazia()) {
            throw new IllegalStateException("Pilha vazia");
        }

        String elemento = elementos[tamanho - 1];
        tamanho--;

        return elemento;
    }

    // ver topo (peek)
    public String topo() {

        if (estaVazia()) {
            throw new IllegalStateException("Pilha vazia");
        }

        return elementos[tamanho - 1];
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for (int i = 0; i < tamanho; i++) {
            sb.append(elementos[i]);

            if (i < tamanho - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");

        return sb.toString();
    }

    public void inverterPalavra (String palavra){
        Pilha pilha = new Pilha(palavra.length());

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(String.valueOf(palavra.charAt(i)));
        }

        String invertida = "";

        while (!pilha.estaVazia()) {
            invertida += pilha.desempilha();
        }

        System.out.println(invertida);
    }

    public void isPalindromo (String palavra){
        Pilha pilha = new Pilha(palavra.length());

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(String.valueOf(palavra.charAt(i)));
        }

        String invertida = "";

        while (!pilha.estaVazia()) {
            invertida += pilha.desempilha();
        }

        if (palavra.equals(invertida)) {
            System.out.println("A palavra " + palavra + " é um palíndromo");
        } else {
            System.out.println("A palavra " + palavra +" não é um palíndromo");
        }
    }

    public String inverterFrase(String frase) {

        String[] palavras = frase.split(" ");

        Pilha pilha = new Pilha(palavras.length);

        // empilha todas as palavras
        for (String p : palavras) {
            pilha.empilha(p);
        }

        StringBuilder resultado = new StringBuilder();

        // desempilha formando a frase invertida
        while (!pilha.estaVazia()) {

            if (resultado.length() > 0) {
                resultado.append(" ");
            }

            resultado.append(pilha.desempilha());
        }

        return resultado.toString();
    }
}