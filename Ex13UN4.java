import java.util.Scanner;

public class Ex13UN4 {
    public Ex13UN4() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as 3 cartas do seu jogo: ");
        int carta1 =  scan.nextInt();
        int carta2 =  scan.nextInt();
        int carta3 =  scan.nextInt();

        int qtCartasBoas = 0;

        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            qtCartasBoas += 1;
        }

        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            qtCartasBoas = qtCartasBoas + 1;
        }

        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            qtCartasBoas ++;
        }

        if (qtCartasBoas == 1) {
            System.out.println("TRUCO");
        } 
            else if (qtCartasBoas == 2) {
                System.out.println("SEIS");
        } 
            else if (qtCartasBoas == 3) {
                System.out.println("NOVE");
        }

        
        scan.close();
    }
    public static void main(String[] args) {
        new Ex13UN4();
    }
}
