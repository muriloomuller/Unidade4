import java.util.Scanner;

public class Ex20UN4 {
    public Ex20UN4() {
        
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite a primeira nota: ");
        float notaProva1 = scan.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float notaProva2 = scan.nextFloat();

        System.out.println("Digite a terceira nota: ");
        float notaProva3 = scan.nextFloat();

        System.out.println("Digite a nota dos exercícios: ");
        float notaEx = scan.nextFloat();

        float media = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaEx) / 7;


        if (media >= 9) {
            System.out.println("Conceito A, aprovado");
        }

        else if (media >= 7.5 && media < 9) {
            System.out.println("Conceito B, aprovado");
        }

        else if (media >= 6 && media < 7.5) {
            System.out.println("Conceito C, aprovado");
        }

        else if (media >= 4 && media < 6) {
            System.out.println("Conceito D, reprovado");
        }

        else {
            System.out.println("Conceito E, reprovado");
        }
        scan.close();
    }
    public static void main(String[] args) {
        new Ex20UN4();
    }
    
}
