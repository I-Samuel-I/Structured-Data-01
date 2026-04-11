package Filas;

public class exc06 {
    private String[] nomes;
    private int[] paginas;
    private int[] prioridades;

    public int tamanho;
    private int inicio;
    private int fim;

    public exc06(int capacidade) {
        nomes = new String[capacidade];
        paginas = new int[capacidade];
        prioridades = new int[capacidade];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    public void adicionar(String nome, int qtdPaginas, int prioridade) {
        if (tamanho == nomes.length) {
            System.out.println("Fila Cheia");
            return;
        }
        fim++;
        nomes[fim] = nome;
        paginas[fim] = qtdPaginas;
        prioridades[fim] = prioridade;
        tamanho++;
    }

    public void remover() {
        if (tamanho == 0) {
            System.out.println("Fila vazia");
            return;
        }
        inicio++;
        tamanho--;
    }

    public void imprimir() {
        if (tamanho == 0) {
            System.out.println("Fila vazia");
            return;
        }

        System.out.println("Iniciando impressão...");
        System.out.println();

        while (tamanho > 0) {
            int indice = inicio;

            for (int i = inicio; i <= fim; i++) {
                if (prioridades[i] < prioridades[indice]) {
                    indice = i;
                }
            }

            System.out.println("Imprimindo: " + nomes[indice] +
                    " | Páginas: " + paginas[indice] +
                    " | Prioridade: " + prioridades[indice]);

            for (int i = indice; i < fim; i++) {
                nomes[i] = nomes[i + 1];
                paginas[i] = paginas[i + 1];
                prioridades[i] = prioridades[i + 1];
            }

            fim--;
            tamanho--;

            System.out.println("Documentos restantes: " + tamanho);
            System.out.println();
        }

        System.out.println("Impressão finalizada!");
    }

    public void mostrarFila() {
        if (tamanho == 0) {
            System.out.println("Fila vazia");
            return;
        }

        System.out.println("FILA ATUAL:");
        for (int i = inicio; i <= fim; i++) {
            System.out.println("Documento: " + nomes[i] +
                    " | Páginas: " + paginas[i] +
                    " | Prioridade: " + prioridades[i]);
        }
    }

    public void verInicio() {
        if (tamanho == 0) {
            System.out.println("Fila Vazia");
            return;
        }
        System.out.println("Início: Nome - " + nomes[inicio] +
                " | Páginas: " + paginas[inicio] +
                " | Prioridade: " + prioridades[inicio]);
    }

    public void verFinal() {
        if (tamanho == 0) {
            System.out.println("Fila Vazia");
            return;
        }
        System.out.println("Fim: Nome - " + nomes[fim] +
                " | Páginas: " + paginas[fim] +
                " | Prioridade: " + prioridades[fim]);
    }
}
