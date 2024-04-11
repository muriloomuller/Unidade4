import java.util.Scanner;

public class Ex07UN4 {
    public Ex07UN4() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com peso da carta");
        double peso = scan.nextDouble();

        double custoBase = 0.45; 

        if (peso <= 50) {
            System.out.println(custoBase);
        } else { 
            double pesoExcedente = peso - 50;
            double adicional = (pesoExcedente / 20) + 1;
            double valorPagar = 0.45 + 0.45 * adicional;
            System.out.println(valorPagar);
        }

        scan.close();
    }
    public static void main(String[] args) {
        new Ex07UN4();
    }
}
