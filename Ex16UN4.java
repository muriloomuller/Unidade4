import java.util.Scanner;

public class Ex16UN4 {
    public Ex16UN4() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a idade do primeiro homem: ");
        int h1 = scan.nextInt();

        System.out.println("Digite a idade do segundo homem: ");
        int h2 = scan.nextInt();

        System.out.println("Digite a idade da primeira mulher: ");
        int m1 = scan.nextInt();

        System.out.println("Digite a idade da segunda mulher: ");
        int m2 = scan.nextInt();

        int homemVelho;
        int homemNovo;
        int mulherVelha;
        int mulherNova;

        if (h1 > h2 ) {
            homemVelho = h1;
            homemNovo = h2;
        } else {
            homemVelho = h2;
            homemNovo = h1;
        }

        if (m1 < m2) {
            mulherNova = m1;
            mulherVelha = m2;
        } else {
            mulherNova = m2;
            mulherVelha = m1;
        }

        int somaIdades = homemVelho + mulherNova;

        int produtoIdades = homemNovo * mulherVelha;


        System.out.println("a soma das idades do homem mais velho com a mulher mais nova é " + somaIdades + " e o produto das idades do homem mais novo com a mulher mais velha é " + produtoIdades);

        scan.close();
    }
    public static void main(String[] args) {
        new Ex16UN4();
    }
}
