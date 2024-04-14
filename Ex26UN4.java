import java.util.Scanner;

public class Ex26UN4 {
    public Ex26UN4() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma opcao: ");
        System.out.println("T: calcular a area de um triangulo de base B e altura H");
        System.out.println("Q: calcular a area de um quadrado de lado L");
        System.out.println("R: calcular a area de um retangulo de base B e altura L");
        System.out.println("C: calcular a area de um circulo de raio R");

        String opcao = scan.nextLine();
        char letra = opcao.toUpperCase().charAt(0);

        switch (letra) {
            case 'T':
                System.out.println("Digite a base e a altura do triangulo");
                double basetriangulo = scan.nextDouble();
                double alturatriangulo = scan.nextDouble();
                double areatriangulo;
                areatriangulo = (basetriangulo * alturatriangulo) / 2;
                System.out.println(areatriangulo);
                break;
            case 'Q':
                System.out.println("Digite o lado do quadrado");
                double ladoquadrado = scan.nextDouble();
                double areaquadrado = Math.pow(ladoquadrado, 2);
                System.out.println(areaquadrado);
                break;
            case 'R':
                System.out.println("Digite a base e a altura do retangulo");
                double baseretangulo = scan.nextDouble();
                double alturaretangulo = scan.nextDouble();
                double arearetangulo = baseretangulo * alturaretangulo;
                System.out.println(arearetangulo);
                break;
            case 'C':
                System.out.println("Digite o raio do circulo");
                double raio = scan.nextDouble();
                double areacirculo = Math.PI * Math.pow(raio, 2);
                System.out.println(areacirculo);
            default:
                System.out.println("Opcao invalida");
                break;
        }
        scan.close();
    }

    public static void main(String[] args) {
        new Ex26UN4();
    }
}
