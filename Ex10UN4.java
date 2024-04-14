import java.util.Scanner;

public class Ex10UN4 {
    public Ex10UN4() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a idade de Marquinho: ");
        int idadeM = scan.nextInt();
        System.out.println("Digite a idade de Zezinho: ");
        int idadeZ = scan.nextInt();
        System.out.println("Digite a idade de Luluzinha: ");
        int idadeL = scan.nextInt();

        if (idadeM < idadeZ && idadeM < idadeL) {
            System.out.println("O filho caçula é o Marquinhos");
        } else if (idadeZ < idadeM && idadeZ < idadeL) {
            System.out.println("O filho caçula é o Zezinho");
        } else {
            System.out.println("A caçula é a Luluzinha");
        }
        scan.close();
    }   
    public static void main(String[] args) {
        new Ex10UN4();
    } 
}