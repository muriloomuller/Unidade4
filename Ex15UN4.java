import java.util.Scanner;

public class Ex15UN4 {
    public Ex15UN4() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de meses que o funcionário foi admitido: ");
        int meses = scan.nextInt();

        if (meses <= 12) {
            System.out.println("A empresa irá conceder 5% de reajuste para o funcionário");
        } 

        else if (meses >= 13 && meses <= 48) {
            System.out.println("7% de reajuste");
        }
        else {
        System.out.println("quantidade de meses inválida");
        }
        scan.close();
    }
    public static void main(String[] args) {
        new Ex15UN4();
    }
}
