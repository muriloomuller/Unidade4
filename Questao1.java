import java.util.Scanner;

public class Questao1 {
    public  Questao1() {

        Scanner scan = new Scanner (System.in);

        System.out.println("nome = ");  
        String nome = scan.nextLine();

        System.out.println("cidade = ");
        String cidade = scan.nextLine();
         
        if (nome != "" && cidade != "") {
        System.out.println("Nome: " + nome);
        System.out.println("Cidade: " + cidade);
        System.out.println("FIM");
        }
        else if(nome != "" && cidade == "") {
            System.out.println("Nome: " + nome);
            System.out.println("Cidade Vazio");
        }
        else {
            System.out.println("Não é possível informar os dados");
            System.out.println("Vazio");
            System.out.println("FIM");

        }
        scan.close();
    }
    public static void main(String[] args) {
        new Questao1();
    }
}
