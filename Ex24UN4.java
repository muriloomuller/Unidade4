import java.util.Scanner;

public class Ex24UN4 {

    public Ex24UN4() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 3 numeros");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();
        double numeromaior = 0;
        double numeromedio = 0;
        double numeromenor = 0;

        System.out.println("Escolha a opcao");
        System.out.println("opção = 1, escreva os 3 valores em ordem crescente");
        System.out.println("se opção = 2, escreva os 3 valores em ordem decrescente");
        System.out.println("se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio");
        int opcao = scan.nextInt();

        if (n1 > n2 && n1 > n3 && n2 > n3) {
            numeromaior = n1;
            numeromedio = n2;
            numeromenor = n3;
        } else if (n1 > n2 && n1 > n3 && n3 > n2) {
            numeromaior = n1;
            numeromedio = n3;
            numeromenor = n2;
        } else if (n2 > n1 && n2 > n3 && n1 > n3) {
            numeromaior = n2;
            numeromedio = n1;
            numeromenor = n3;
        } else if (n2 > n1 && n2 > n3 && n3 > n1) {
            numeromaior = n2;
            numeromedio = n3;
            numeromenor = n1;
        } else if (n3 > n2 && n3 > n1 && n2 > n1) {
            numeromaior = n3;
            numeromedio = n2;
            numeromenor = n1;
        } else if (n3 > n2 && n3 > n1 && n1 > n2) {
            numeromaior = n3;
            numeromedio = n1;
            numeromenor = n2;
        }

        switch (opcao) {
            case 1:
                System.out.println(numeromenor);
                System.out.println(numeromedio);
                System.out.println(numeromaior);
                break;
            case 2:
                System.out.println(numeromaior);
                System.out.println(numeromedio);
                System.out.println(numeromenor);
                break;
            case 3:
                System.out.println(numeromenor);
                System.out.println(numeromaior);
                System.out.println(numeromedio);
                break;
            default:
                break;
        }
        scan.close();
    }

    public static void main(String[] args) {
        new Ex24UN4();
    }
}