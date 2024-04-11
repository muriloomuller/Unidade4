import java.util.Scanner;

public class Ex02UN4 {
    public Ex02UN4() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um valor inteiro mairo do que 0: ");
        int valor = scan.nextInt();

        scan.close();
        
        if (valor % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é impar");
        }
    }
    public static void main(String[] args) {
        new Ex02UN4();
    }
}
