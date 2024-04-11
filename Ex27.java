import java.util.Scanner;

public class Ex27 {
    public Ex27() {
        Scanner teclado = new Scanner(System.in);
        
        int tempohoraentrada;
        int tempominutoentrada;
        int tempohorasaida;
        int tempominutosaida;
        int tempohoraestacionado;
        int tempominutoestacionado;
        int tempointeiroentrada;
        int tempointeirosaida;
        int tempointeiroestacionado;
        double valor = 0;
        boolean valorCalculado = false;

        System.out.println("Informe a hora em que o carro foi estacionado");
        tempohoraentrada = teclado.nextInt();
        System.out.println("Informe o minuto em que o carro foi estacionado");
        tempominutoentrada = teclado.nextInt();
        System.out.println("Informe a hora em que o carro saiu do estacionamento");
        tempohorasaida = teclado.nextInt();
        System.out.println("Informe o minuto em que o carro saiu do estacionamento");
        tempominutosaida = teclado.nextInt();

        tempointeiroentrada = (tempohoraentrada * 60) + tempominutoentrada;
        tempointeirosaida = (tempohorasaida * 60) + tempominutosaida;
        tempointeiroestacionado = tempointeirosaida - tempointeiroentrada;
        
        tempohoraestacionado = tempointeiroestacionado / 60;
        tempointeiroestacionado %= 60;
        tempominutoestacionado = tempointeiroestacionado; 

        if (tempohoraentrada >= 0 && tempohoraentrada < 24 && tempominutoentrada >= 0 && tempominutoentrada < 60 &&
                tempohorasaida >= 0 && tempohorasaida < 24 && tempominutosaida >= 0 && tempominutosaida < 60 &&
                tempointeiroestacionado > 0) {

                    switch (tempohoraestacionado) {
                        case 1: case 2:
                            valor = 5 * tempohoraestacionado;
                            valorCalculado = true;
                        case 3: case 4:
                            if (!valorCalculado) {
                                valor = 7.5 * tempohoraestacionado;
                                valorCalculado = true;
                            }
                        case 5:
                            if (!valorCalculado) {
                                valor = 10 * tempohoraestacionado;
                                valorCalculado = true;
                            }
                    }

            System.out.println("O carro ficou estacionado por " + tempohoraestacionado + " horas e " + tempominutoestacionado + " minutos.");
            System.out.println("Assim o valor que deve ser pago é : R$" + valor);
        }

        else {
            System.out.println("Inválida");
        }

        teclado.close();
    }

    public static void main(String[] args) {
        new Ex27();
    }
}
