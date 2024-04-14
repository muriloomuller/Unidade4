import java.util.Scanner;

public class Ex05UN4 {
    public Ex05UN4() {

        Scanner scan = new Scanner(System.in);

        System.out.println("a cor é azul? (true, false)");
        boolean sn = scan.nextBoolean();

        if (sn) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
        scan.close();
    }
    public static void main(String[] args) {
        new Ex05UN4();
    }
}