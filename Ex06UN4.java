import java.util.Scanner;


public class Ex06UN4 {
    public Ex06UN4() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite F para FEMININO, M para MASCULINO e I para não informar: ");
        String caractere = scan.nextLine();

        char letra = caractere.toUpperCase().charAt(0);

        if (letra == 'M') {
        System.out.println("Masculino");
    } else if (letra == 'F') {
        System.out.println("Feminino");
    } else if (letra == 'I') { 
        System.out.println("Não informado") ;
    } else {
        System.out.println("Entrada inválida");
    }
        scan.close();
    }
    public static void main(String[] args) {
        new Ex06UN4();
    }
}