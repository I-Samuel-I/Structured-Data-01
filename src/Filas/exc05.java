package Filas;

public class exc05 {

    private String[] nomes;
    private int[] prioridades;

    public int tamanho;
    private int inicio;
    private int fim;

    public exc05(int capacidade) {
        nomes = new String[capacidade];
        prioridades = new int[capacidade];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    public void adicionar(String nome, int tipo) {
        if (tamanho == nomes.length) {
            System.out.println("Fila Cheia");
            return;
        }
        fim++;
        nomes[fim] = nome;
        prioridades[fim] = tipo;
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
            int indice = -1;

            for (int i = inicio; i <= fim; i++) {
                if (prioridades[i] == 1) {
                    indice = i;
                    break;
                }
            }

            if (indice == -1) {
                for (int i = inicio; i <= fim; i++) {
                    if (prioridades[i] == 2) {
                        indice = i;
                        break;
                    }
                }
            }

            if (indice == -1) {
                indice = inicio;
            }

            System.out.println("Cliente: " + nomes[indice] + " | Prioridade: " + prioridades[indice]);

            for (int i = indice; i < fim; i++) {
                nomes[i] = nomes[i + 1];
                prioridades[i] = prioridades[i + 1];
            }

            fim--;
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
            System.out.println("Cliente: " + nomes[i] + " | Prioridade: " + prioridades[i]);
        }
    }

    public void verInicio() {
        if (tamanho == 0) {
            System.out.println("Fila Vazia");
            return;
        }
        System.out.println("Início: Nome - " + nomes[inicio] + " Prioridade: " + prioridades[inicio]);
    }

    public void verFinal() {
        if (tamanho == 0) {
            System.out.println("Fila Vazia");
            return;
        }
        System.out.println("Fim: Nome - " + nomes[fim] + " Prioridade: " + prioridades[fim]);
    }
}