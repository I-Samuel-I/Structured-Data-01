package BuscaBinaria;

public class Main {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 2, 2, 3, 4};

        int resultado1 = BuscaBinaria.primeiraOcorrencia(numeros, 2);
        System.out.println("Primeira ocorrência de 2: " + resultado1);

        int resultado2 = BuscaBinaria.ultimaOcorrencia(numeros, 2);
        System.out.println("Última ocorrência de 2: " + resultado2);

        String[] nomes = {"Ana", "Bruno", "Carlos", "Carlos", "Carlos", "Eduardo"};

        int resultado3 = BuscaBinaria.primeiraOcorrencia(nomes, "Carlos");
        System.out.println("Primeira ocorrência de Carlos: " + resultado3);

        int resultado4 = BuscaBinaria.ultimaOcorrencia(nomes, "Carlos");
        System.out.println("Última ocorrência de Carlos: " + resultado4);

        int resultado5 = BuscaBinaria.primeiraOcorrencia(numeros, 10);
        System.out.println("Valor não encontrado: " + resultado5);


    }
}