package Filas;

public class Main {
    public static void main(String[] args) {

        exc01 fila01 = new exc01(5);
        exc02 fila02 = new exc02(6);
        exc03 fila03 = new exc03(5);
        exc04 fila04 = new exc04(6);
        exc05 fila05 = new exc05(6);
        exc06 fila06 = new exc06(6);
        exc07 fila07 = new exc07(5);
        exc08 fila08 = new exc08(5);


        fila07.adicionar("Teste1", "assuont01");
        fila07.adicionar("Teste2", "assuont02");
        fila07.adicionar("Teste3", "assuont03" );
        fila07.adicionar("Teste4", "assuont04");
        fila07.adicionar("Teste5", "assuont05" );
        fila07.adicionar("Teste6", "assuont06" );

        fila07.mostrarFila();
        fila07.verInicio();
        fila07.verFinal();
        fila07.atendimento();


    }
    }
