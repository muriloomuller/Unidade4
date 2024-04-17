import java.util.Scanner;

public class Questao2 {
    public Questao2() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Valor aluguel primeiro mês: ");
        double aluguel1 = scan.nextDouble();

        System.out.println("Valor aluguel segundo mês: ");
        double aluguel2 = scan.nextDouble();

        System.out.println("Valor aluguel terceiro mês: ");
        double aluguel3 = scan.nextDouble();

        double numeromaior = 0;
        double numeromedio = 0;
        double numeromenor = 0;

        double media = aluguel1 + aluguel2 + aluguel3 / 3;

        System.out.println("Menu:");
        System.out.println("1) valor do mês mais alto");
        System.out.println("2) valor do mês mais baixo ");
        System.out.println("3) valores impressos em ordem crescente (mais baixo para o mais alto)");
        System.out.println("4) média dos valores pagos durante os três meses");
        int menu = scan.nextInt();
        
        if (aluguel1 > aluguel2 && aluguel1 > aluguel3 && aluguel2 > aluguel3) {
            numeromaior = aluguel1;
            numeromedio = aluguel2;
            numeromenor = aluguel3;
        } else if (aluguel1 > aluguel2 && aluguel1 > aluguel3 && aluguel3 > aluguel2) {
            numeromaior = aluguel1;
            numeromedio = aluguel3;
            numeromenor = aluguel2;
        } else if (aluguel2 > aluguel1 && aluguel2 > aluguel3 && aluguel1 > aluguel3) {
            numeromaior = aluguel2;
            numeromedio = aluguel1;
            numeromenor = aluguel3;
        } else if (aluguel2 > aluguel1 && aluguel2 > aluguel3 && aluguel3 > aluguel1) {
            numeromaior = aluguel2;
            numeromedio = aluguel3;
            numeromenor = aluguel1;
        } else if (aluguel3 > aluguel2 && aluguel3 > aluguel1 && aluguel2 > aluguel1) {
            numeromaior = aluguel3;
            numeromedio = aluguel2;
            numeromenor = aluguel1;
        } else if (aluguel3 > aluguel2 && aluguel3 > aluguel1 && aluguel1 > aluguel2) {
            numeromaior = aluguel3;
            numeromedio = aluguel1;
            numeromenor = aluguel2;
        }

        switch (menu) {
            case 1:
            System.out.println("O valor do mês mais alto é R$" + numeromaior);
            break;
            case 2:
            System.out.println("O valor do mês mais baixo é R$" + numeromenor);
            break;
            case 3:
            System.out.println(numeromenor + " , " + numeromedio + " , " + numeromaior);
            break;
            case 4:
            System.out.println("A média dos valores durante os três meses é R$" + media);
            break;
            default:
                break;
        }

        scan.close();
    }

    public static void main(String[] args) {
        new Questao2();
    }
}