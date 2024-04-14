import java.util.Scanner;

public class Ex19UN4 {
    public Ex19UN4() {

        Scanner scan = new Scanner(System.in);

        System.out.println("x = ");
        double x = scan.nextDouble();
        
        System.out.println("y = ");
        double y = scan.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Quadrante 0");
        } 

        else if (x > 0 && y > 0) {
            System.out.println("Quadrante 1");
        }

        else if (x > 0 && y < 0) {
            System.out.println("Quadrante 2");
        }

        else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");
        }

        else {
            System.out.println("Quadrante 4");
        }
        scan.close();
    }
    public static void main(String[] args) {
        new Ex19UN4();
    }
}
