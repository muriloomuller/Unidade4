import java.util.Scanner;

public class Ex14UN4 {
    public Ex14UN4() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia: ");
        int dia = scan.nextInt();
        System.out.println("Digite o mes: ");
        int mes = scan.nextInt();
        System.out.println("Digite o ano: ");
        int ano = scan.nextInt();

        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
            if (mes == 1  || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                System.out.println("válida");
            } else if (mes != 2 && dia < 31) {
                System.out.println("válida");
            } else if (mes == 2 && dia < 29) {
                System.out.println("válida");
            } else if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)) {
                System.out.println("válida");
            } else {
                System.out.println("Nao válida");
            }
        } else {
            System.out.println("Nao válida");
        }
        scan.close();
    }

    public static void main(String[] args) {
        new Ex14UN4();
    }
}