package Filas;

public class exc07 {

    private String[] nomes;
    private String[] assuntos;

    public int tamanho;
    private int inicio;
    private int fim;

    public exc07(int capacidade) {
        nomes = new String[capacidade];
        assuntos = new String[capacidade];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    public void adicionar(String nome, String assunto) {
        if (tamanho == nomes.length) {
            System.out.println("Fila Cheia");
            return;
        }
        fim++;
        nomes[fim] = nome;
        assuntos[fim] = assunto;
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

        System.out.println("Iniciando atendimentos...");
        System.out.println();

        while (tamanho > 0) {
            System.out.println("Atendendo: " + nomes[inicio] +
                    " | Assunto: " + assuntos[inicio]);

            remover();

            System.out.println("Chamadas aguardando: " + tamanho);
            System.out.println();
        }

        System.out.println("Atendimentos finalizados!");
    }

    public void mostrarFila() {
        if (tamanho == 0) {
            System.out.println("Fila vazia");
            return;
        }

        System.out.println("FILA ATUAL:");
        for (int i = inicio; i <= fim; i++) {
            System.out.println("Nome: " + nomes[i] + " | Assunto: " + assuntos[i]);
        }
    }

    public void verInicio() {
        if (tamanho == 0) {
            System.out.println("Fila Vazia");
            return;
        }
        System.out.println("Chamada atual: " + nomes[inicio] + " | Assunto: " + assuntos[inicio]);
    }

    public void verFinal() {
        if (tamanho == 0) {
            System.out.println("Fila Vazia");
            return;
        }
        System.out.println("Última chamada: " + nomes[fim] + " | Assunto: " + assuntos[fim]);
    }
}