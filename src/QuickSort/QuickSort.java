package  QuickSort;

public class QuickSort {

    public static void quickSort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int pivoIndex = particionar(arr, inicio, fim);
            quickSort(arr, inicio, pivoIndex - 1);
            quickSort(arr, pivoIndex + 1, fim);
        }
    }

    private static int particionar(int[] arr, int inicio, int fim) {
        int pivo = arr[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (arr[j] <= pivo) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[fim];
        arr[fim] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        quickSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
















