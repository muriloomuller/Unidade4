import java.util.Scanner;

public class Ex03UN4 {
    public Ex03UN4() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = scan.nextInt();

        System.out.print("Digite um número: ");
        int n2 = scan.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + " é maior que " + n2 );
        } if (n2 > n1) {
            System.out.println(n2 + " é maior que " + n1);
        }
        scan.close();
    }
    public static void main(String[] args) {
        new Ex03UN4();
    }
}