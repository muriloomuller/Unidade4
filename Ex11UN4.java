import java.util.Scanner;

public class Ex11UN4 {
    public Ex11UN4() {

        Scanner scan = new Scanner(System.in);

         System.out.println("Digite a idade do primeiro irmão: ");
         int idade1 = scan.nextInt();

         
         System.out.println("Digite a idade do segundo irmão: ");
         int idade2 = scan.nextInt();

         
         System.out.println("Digite a idade do terceiro irmão: ");
         int idade3 = scan.nextInt();

         if (idade1 == idade2 && idade1 == idade3) {
            System.out.println("TRIGÊMEOS");
         } 
         
         else if (idade1 == idade2 && idade2 != idade3 || (idade1 == idade3 && idade3 != idade2) || (idade2 == idade3 && idade3 != idade1)) {
            System.out.println("SÃO GÊMEOS");
         }

         else {
            System.out.println("SÃO APENAS IRMÃOS");
         }
        scan.close();
    }
    public static void main(String[] args) {
        new Ex11UN4();
    }
}