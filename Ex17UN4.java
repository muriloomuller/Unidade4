import java.util.Scanner;

public class Ex17UN4 {
        public Ex17UN4() {

            Scanner scan = new Scanner(System.in);

            System.out.println("Digite a renda anual: ");
            double rendaAnual = scan.nextDouble();

            System.out.println("Digite o número de dependentes do contribuinte: ");
            double numeroDep = scan.nextDouble();

            double rendaLiquida = rendaAnual - (0.02f * numeroDep);

            
            if (rendaLiquida <= 2000) {
                System.out.println("O contribuinte não pagará imposto.");
            }

            else if (rendaLiquida > 2000 && rendaLiquida <= 5000) {
                
                double imp5 = (rendaLiquida * 0.05f); 
                System.out.println("O imposto é R$" + imp5);
            }

            else if (rendaLiquida > 5000 && rendaLiquida <= 10000) {

                double imp10 = (rendaLiquida * 0.10f);
                System.out.println("O imposto é R$" + imp10);
            }

            else {
                double imp15 = (rendaLiquida * 0.15f);
                System.out.println("O imposto é R$" + imp15);
            }
            scan.close();
        }
        public static void main(String[] args) {
            new Ex17UN4();
        }
}
