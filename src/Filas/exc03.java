package Filas;

public class exc03 {

    private String[] nomes;
    private int[] produtos;
    public int tamanho;
    private int inicio;
    private int fim;

    public exc03(int capacidade) {
        nomes = new String[capacidade];
        produtos = new int[capacidade];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    public void adicionar(String nome, int produto) {
        if (tamanho == nomes.length) {
            System.out.println("Fila Cheia");
            return;
        }
        fim++;
        nomes[fim] = nome;
        produtos[fim] = produto;
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

    public void atendimento() {
        if (tamanho == 0) {
            System.out.println("Fila vazia");
            return;
        }

        System.out.println("Inicio do Atendimento...");
        System.out.println();

        while (tamanho > 0) {
            System.out.println("Atendimneto: " + nomes[inicio]);
            inicio++;
            tamanho--;
            System.out.println("Clientes restantes: " + tamanho);

            System.out.println();
        }
        System.out.println();
        System.out.println("Atendimento Encerrado! Fila vazia...");
    }

    public void mostrarFila() {
        if (tamanho == 0) {
            System.out.println("Fila vazia");
            return;
        }

        System.out.println("FILA ATUAL:");
        for (int i = inicio; i <= fim; i++) {
            System.out.println("Cliente: " + nomes[i] + " | " + "Produto: " + produtos[i]);
        }
    }

    public void verInicio() {
        if (tamanho == 0) {
            System.out.println("Fila Vazia");
            return;
        }
        System.out.println("Início: " + "Nome - " + nomes[inicio] + " Produto - " + produtos[inicio]);

    }

    public void verFinal() {
        if (tamanho == 0) {
            System.out.println("Fila Vazia");
            return;
        }
        System.out.println("Fim: " + "Nome - " + nomes[fim] + " Produto - " + produtos[fim]);
    }
}
