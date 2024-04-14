import java.util.Scanner;

public class Ex09UN4 {
    public Ex09UN4() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int n1 = scan.nextInt();

        System.out.println("Digite outro valor inteiro: ");
        int n2 = scan.nextInt(); 

        if (n1 % n2 == 0) {
            System.out.println("É multiplo");
        } else {
            System.out.println("Não é multiplo");
        }
        scan.close();
    }
    public static void main(String[] args) {
        new Ex09UN4();
    }
}