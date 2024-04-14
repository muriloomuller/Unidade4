import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex18UN4 {
    public Ex18UN4() {

        Scanner scan = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.2");

        System.out.println("Digite o dia de vencimento (até dia 10): ");
        int dia = scan.nextInt();

        System.out.println("Digite o valor da prestação: ");
        double prest = scan.nextDouble();

        System.out.println("Digite o dia em que foi pago: ");
        double pag = scan.nextInt();

        if (pag <= dia) {

            double desc10 = prest - (prest * 0.10f);
            System.out.println("O pagamento está em dia, você ganhou um desconto de 10%, R$" + df.format(desc10)); 
        }

        else if (pag > dia - 5) {
        System.out.println("Você perdeu o desconto");
        }

        else {
                double multa = (pag - dia) * 0.02;
                System.out.println("Você atrasou, terá que pagar uma multa de R$" + df.format(multa));
            }
        scan.close();
    }
    public static void main(String[] args) {
        new Ex18UN4();
    }
}