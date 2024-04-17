import java.util.Scanner;

public class Questao3 {
    public Questao3() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o código de letra do carro: ");
        String carro = scan.nextLine();
        char carro2 = carro.toUpperCase().charAt(0);

        if (carro2 == 'B') {
            System.out.println("BYD");
        } else if (carro2 == 'J') {
            System.out.println("JAC");
        } else if (carro2 == 'C') { 
            System.out.println("Caoa") ;
        } else {
            System.out.println("Entrada incorreta");
        }
            scan.close();
        }
    public static void main(String[] args) {
        new Questao3();
    }
}
