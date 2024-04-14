import java.util.Scanner;

public class Ex08UN4 {
    public Ex08UN4() {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a letra: ");
        char letra = scan.next().toLowerCase().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("É vogal");
        } else {
            System.out.println("NÃO é vogal");
        }
        scan.close();
    }
    public static void main(String[] args) {
        new Ex08UN4();
    }
    
}