package Filas;

public class exc04 {

    private String[] nomes;
    private boolean[] tipos;
    private int[] senhas;
    public int tamanho;
    private int inicio;
    private int fim;

    public exc04(int capacidade) {
        nomes = new String[capacidade];
        tipos = new boolean[capacidade];
        senhas = new int[capacidade];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    public void adicionar(String nome, int senha, boolean tipo) {
        if (tamanho == nomes.length) {
            System.out.println("Fila Cheia");
            return;
        }
        fim++;
        nomes[fim] = nome;
        senhas[fim] = senha;
        tipos[fim] = tipo;
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

        int contadorPrioritario = 0;
        while (tamanho > 0) {
            int indice = -1;

            if (contadorPrioritario == 3) {
                for (int i = inicio; i <= fim; i++) {
                    if (tipos[i] == false) {
                        indice = i;
                        contadorPrioritario = 0;
                        break;
                    }
                }
            } else {
                for (int i = inicio; i <= fim; i++) {
                    if (tipos[i]) {
                        indice = i;
                        contadorPrioritario++;
                        break;
                    }
                }
            }
            if (indice == -1) {
                indice = inicio;
            }

            System.out.println("Cliente: " + nomes[indice] + (tipos[indice] ? " (PRIORITÁRIO)" : " (NORMAL)"));

            for (int i = indice; i < fim; i++) {
                nomes[i] = nomes[i + 1];
                senhas[i] = senhas[i + 1];
                tipos[i] = tipos[i + 1];
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
            System.out.println("Cliente: " + nomes[i] + " | " + " Senha: " + senhas[i] + " | " + (tipos[i] ? "PRIORITÁRIO" : "NORMAL"));
        }
    }

    public void verInicio() {
        if (tamanho == 0) {
            System.out.println("Fila Vazia");
            return;
        }
        System.out.println("Início: " + "Nome - " + nomes[inicio] + " Senha: " + senhas[inicio] + " | " + (tipos[inicio] ? "PRIORITÁRIO" : "NORMAL"));

    }

    public void verFinal() {
        if (tamanho == 0) {
            System.out.println("Fila Vazia");
            return;
        }
        System.out.println("Fim: " + "Nome - " + nomes[fim] + " Senha: " + senhas[fim] + " | " + (tipos[fim] ? "PRIORITÁRIO" : "NORMAL"));
    }
}
