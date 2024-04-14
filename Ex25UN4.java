import java.util.Scanner;

public class Ex25UN4 {
    public Ex25UN4() {
        Scanner scan = new Scanner(System.in);

        double resultado = 0;

        System.out.println("Digite o numero da operacao");
        System.out.println("1 - soma entre dois numeros");
        System.out.println("2 - subtracao entre dois numeros");
        System.out.println("3 - multiplicacao entre dois numeros");
        System.out.println("4 - divisao entre dois numeros");

        int operacao = scan.nextInt();

        System.out.println("Digite o primeiro numero");
        double numero1 = scan.nextDouble();
        System.out.println("Digite o segundo numero");
        double numero2 = scan.nextDouble();

        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Opcao Invalida");
                break;
        }

        System.out.println(resultado);
        
        scan.close();
    }

    public static void main(String[] args) {
        new Ex25UN4();
    }
}
