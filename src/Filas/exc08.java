package Filas;

public class exc08 {

    private int[] ids;
    private int[] tempos;

    public int tamanho;
    private int inicio;
    private int fim;

    public exc08(int capacidade) {
        ids = new int[capacidade];
        tempos = new int[capacidade];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    public void adicionar(int id, int tempo) {
        if (tamanho == ids.length) {
            System.out.println("Fila Cheia");
            return;
        }
        fim++;
        ids[fim] = id;
        tempos[fim] = tempo;
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

    public void executar() {
        if (tamanho == 0) {
            System.out.println("Fila vazia");
            return;
        }

        System.out.println("Iniciando execução...\n");

        while (tamanho > 0) {
            System.out.println("Executando processo: " + ids[inicio] +
                    " | Tempo estimado: " + tempos[inicio]);

            remover();

            System.out.println("Processos restantes: " + tamanho);
            System.out.println();
        }

        System.out.println("Execução finalizada!");
    }

    public void mostrarFila() {
        if (tamanho == 0) {
            System.out.println("Fila vazia");
            return;
        }

        System.out.println("FILA ATUAL:");
        for (int i = inicio; i <= fim; i++) {
            System.out.println("Processo: " + ids[i] +
                    " | Tempo: " + tempos[i]);
        }
    }

    public void verInicio() {
        if (tamanho == 0) {
            System.out.println("Fila Vazia");
            return;
        }
        System.out.println("Processo atual: " + ids[inicio] +
                " | Tempo: " + tempos[inicio]);
    }

    public void verFinal() {
        if (tamanho == 0) {
            System.out.println("Fila Vazia");
            return;
        }
        System.out.println("Último processo: " + ids[fim] +
                " | Tempo: " + tempos[fim]);
    }
}