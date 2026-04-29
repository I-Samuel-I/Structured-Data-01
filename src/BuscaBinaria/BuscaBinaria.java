package BuscaBinaria;

public class BuscaBinaria {

    public static int buscaBinaria(int[] array, int valor) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (array[meio] == valor) {
                return meio;
            } else if (array[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }

    public static int buscaBinaria(String[] array, String valor) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            int comparacao = array[meio].compareTo(valor);

            if (comparacao == 0) {
                return meio;
            } else if (comparacao < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }

    public static int primeiraOcorrencia(int[] array, int valor) {
        int inicio = 0, fim = array.length - 1;
        int resultado = -1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (array[meio] == valor) {
                resultado = meio;
                fim = meio - 1; // continua à esquerda
            } else if (array[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return resultado;
    }

    public static int ultimaOcorrencia(int[] array, int valor) {
        int inicio = 0, fim = array.length - 1;
        int resultado = -1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (array[meio] == valor) {
                resultado = meio;
                inicio = meio + 1; // continua à direita
            } else if (array[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return resultado;
    }

    public static int primeiraOcorrencia(String[] array, String valor) {
        int inicio = 0, fim = array.length - 1;
        int resultado = -1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            int comp = array[meio].compareTo(valor);

            if (comp == 0) {
                resultado = meio;
                fim = meio - 1; // continua à esquerda
            } else if (comp < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return resultado;
    }

    public static int ultimaOcorrencia(String[] array, String valor) {
        int inicio = 0, fim = array.length - 1;
        int resultado = -1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            int comp = array[meio].compareTo(valor);

            if (comp == 0) {
                resultado = meio;
                inicio = meio + 1; // continua à direita
            } else if (comp < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return resultado;
    }
}