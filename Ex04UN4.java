import java.util.Scanner;

public class Ex04UN4 {
    public Ex04UN4() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número maior que zero: ");
        float num = scan.nextFloat();

        if ((num * 10) % 10 != 0) {
            System.out.println("Sim, foram digitadas casas decimais");
        } else {
            System.out.println("Não foram digitadas casas decimais");
        }
        scan.close();
    }
    public static void main(String[] args) {
        new Ex04UN4();
    }
}
