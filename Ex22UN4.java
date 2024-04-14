import java.util.Scanner;

public class Ex22UN4 {
    public Ex22UN4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 = Ciência da Computação, 2 = Licenciatura da Computação e 3  = Sistemas de Informaçao :");
        int op = scan.nextInt();

        switch (op) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.println("Licenciatura em Computação");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        scan.close();
    }

    public static void main(String[] args) {
        new Ex22UN4();
    }
}