import java.util.Scanner;

public class Ex12UN4 {
 
    public Ex12UN4() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o comprimento do lado 1: ");
        double lado1 = scan.nextDouble();

        System.out.println("Entre com o comprimento do lado 2: ");
        double lado2 = scan.nextDouble();

        System.out.println("Entre com o comprimento do lado 3: ");
        double lado3 = scan.nextDouble();

        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {

            if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("é equilatero");
            }

            else if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("é isósceles");
            }
            else {
            System.out.println("é escaleno");
            }
        }
        else {
            System.out.println("não formam um triângulo");
        }
        scan.close();
    }
    public static void main(String[] args) {
        new Ex12UN4();
    }
}