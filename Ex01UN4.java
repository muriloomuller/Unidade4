import java.util.Scanner;

public class Ex01UN4 {
    public Ex01UN4() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as horas trabalhadas no mês: ");
        int horasMes = scan.nextInt();

        System.out.println("Valor pago p/ hora: ");
        double horasValor = scan.nextDouble();

        double salarioTotal = horasMes * horasValor;

        if (horasMes > 160) {
            double salarioExtra = (horasMes - 160) * (horasValor / 2);
            salarioTotal = salarioTotal + salarioExtra;
        }

        System.out.println("O salario total é : " + salarioTotal);
        
        scan.close();
    }

    public static void main(String[] args) {
        new Ex01UN4();
    }
}