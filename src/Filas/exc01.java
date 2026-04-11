package Filas;

public class exc01 {

    private String[] documentos;
    private int[] paginas;
    private int inicio;
    private int fim;
    int tamanho;

    public exc01(int capacidade) {
        documentos = new String[capacidade];
        paginas = new int[capacidade];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    public void adicionar(String documento, int pag) {
        if (tamanho == documentos.length) {
            System.out.println("Fila cheia");
            return;
        }

        fim++;
        documentos[fim] = documento;
        paginas[fim] = pag;
        tamanho++;
    }

    public void remover () {
        if (tamanho == 0) {
            System.out.println("Fila cheia");
            return;
        }
        System.out.println("Removido: " + documentos[inicio]);
        inicio++;
        tamanho--;
        System.out.println();
    }

    public void imprimir() {
        if (tamanho == 0) {
            System.out.println("Fila vazia");
            return;
        }
        while (tamanho > 0){
            System.out.println("Imprimindo: " + documentos[inicio] + " (" + paginas[inicio] + " páginas)");
            inicio++;
            tamanho--;
        }

    }

    public void mostrarFila() {
        if (tamanho == 0) {
            System.out.println("Fila vazia");
            return;
        }

        System.out.println("Fila de impressão:");

        for (int i = inicio; i <= fim; i++) {
            System.out.println("- " + documentos[i] + " (" + paginas[i] + " páginas)");
        }
    }

    public void verInicio() {
        if (tamanho == 0) {
            System.out.println("Fila Vazia");
            return;
        }
        System.out.println("Início: " + documentos[inicio]);

    }

    public void verFinal() {
        if (tamanho == 0) {
            System.out.println("Fila Vazia");
            return;
        }
        System.out.println("Final: " + documentos[fim]);
    }
}


