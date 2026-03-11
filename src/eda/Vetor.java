package eda;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    // adiciona no final
    public void adiciona(String elemento) {
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public int busca(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public String ultimo() {
        if (estaVazia()) {
            throw new IllegalStateException("Vetor vazio");
        }

        return elementos[tamanho - 1];
    }

    public void imprimeUmPorLinha() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(elementos[i]);
        }
    }

    public boolean contem(String elemento) {
        return busca(elemento) != -1;
    }

    public void limpar() {
        for (int i = 0; i < tamanho; i++) {
            elementos[i] = null;
        }

        tamanho = 0;
    }

    public int contarOcorrencias(String elemento) {
        int contador = 0;

        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                contador++;
            }
        }

        return contador;
    }

    public boolean substituir(String antigo, String novo) {
        int posicao = busca(antigo);

        if (posicao == -1) {
            return false;
        }

        elementos[posicao] = novo;

        return true;
    }

    // mostrar vetor
    public String toString() {

        String s = "[";

        for (int i = 0; i < this.tamanho - 1; i++) {
            s += this.elementos[i];
            s += ", ";
        }

        if (this.tamanho > 0) {
            s += this.elementos[this.tamanho - 1];
        }

        s += "]";
        return s;
    }

    // remove por posição
    public void remove(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        tamanho--;

        elementos[tamanho] = null;
    }

    // remove por elemento
    public boolean remove(String elemento) {
        int posicao = busca(elemento);

        if (posicao == -1) {
            return false;
        }

        remove(posicao);

        return true;
    }

    public int indiceUltimo(String elemento) {
        for (int i = tamanho - 1; i >= 0; i--) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    public void removerTodos(String elemento) {
        while (remove(elemento)) {

        }

    }

    public boolean adicionarSeNaoExiste(String elemento) {
        if (contem(elemento)) {
            return false;
        }

        adiciona(elemento);

        return true;
    }

    // inserir depois de um elemento
    public boolean inserirDepois(String referencia, String novoElemento) {
        int posicao = busca(referencia);

        if (posicao == -1) {
            return false;
        }

        for (int i = tamanho; i > posicao + 1; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[posicao + 1] = novoElemento;

        tamanho++;

        return true;
    }

}