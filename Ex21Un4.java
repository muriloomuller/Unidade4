import java.util.Scanner;

public class Ex21Un4 {
    public Ex21Un4() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        float peso = scan.nextFloat();

        System.out.println("Digite sua altura: ");
        float altura = scan.nextFloat();

        float imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Magreza");
        }

        else if (imc >= 18.5 && imc <= 24.9){
        System.out.println("Saudável");
        }

        else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        }

        else if (imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade Grau 1");
        }

        else if (imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade Grau 2 (severa)");
        }

        else {
            System.out.println("Obesidade Grau 3 (mórbida)");
        }
        scan.close();
    }
    public static void main(String[] args) {
        new Ex21Un4();
    }
}
