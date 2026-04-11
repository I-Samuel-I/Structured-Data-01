package Filas;

public class exc09 {

    private String[] nomes;
    private int[] prioridades;

    public int tamanho;
    private int inicio;
    private int fim;

    public exc09(int capacidade) {
        nomes = new String[capacidade];
        prioridades = new int[capacidade];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    public void adicionar(String nome, int prioridade) {
        if (tamanho == nomes.length) {
            System.out.println("Fila Cheia");
            return;
        }

        fim++;
        nomes[fim] = nome;
        prioridades[fim] = prioridade;
        tamanho++;

        for (int i = fim; i > inicio; i--) {
            if (prioridades[i] < prioridades[i - 1]) {
                int tempP = prioridades[i];
                prioridades[i] = prioridades[i - 1];
                prioridades[i - 1] = tempP;

                String tempN = nomes[i];
                nomes[i] = nomes[i - 1];
                nomes[i - 1] = tempN;
            }
        }
    }

    public void remover() {
        if (tamanho == 0) {
            System.out.println("Fila vazia");
            return;
        }
        inicio++;
        tamanho--;
    }

    public void executar() {
        if (tamanho == 0) {
            System.out.println("Fila vazia");
            return;
        }

        System.out.println("Iniciando execução...\n");

        while (tamanho > 0) {

            System.out.println("FILA ANTES:");
            mostrarFila();
            System.out.println();

            System.out.println("Executando: " + nomes[inicio] +
                    " | Prioridade: " + prioridades[inicio]);

            remover();

            System.out.println("\nFILA DEPOIS:");
            mostrarFila();
            System.out.println("Restantes: " + tamanho);
            System.out.println();
        }

        System.out.println("Execução finalizada!");
    }

    public void mostrarFila() {
        if (tamanho == 0) {
            System.out.println("Fila vazia");
            return;
        }

        for (int i = inicio; i <= fim; i++) {
            System.out.println("Tarefa: " + nomes[i] +
                    " | Prioridade: " + prioridades[i]);
        }
    }

    public void verInicio() {
        if (tamanho == 0) {
            System.out.println("Fila Vazia");
            return;
        }
        System.out.println("Próxima tarefa: " + nomes[inicio] +
                " | Prioridade: " + prioridades[inicio]);
    }

    public void verFinal() {
        if (tamanho == 0) {
            System.out.println("Fila Vazia");
            return;
        }
        System.out.println("Última tarefa: " + nomes[fim] +
                " | Prioridade: " + prioridades[fim]);
    }
}