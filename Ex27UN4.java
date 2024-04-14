import java.util.Scanner;

public class Ex27UN4 {
    public Ex27UN4() {

                Scanner scanner = new Scanner(System.in);
                
                System.out.println("Informe o horário de chegada (horas em minutos):");
                int horaChegada = scanner.nextInt();
                int minutoChegada = scanner.nextInt();
                
                System.out.println("Informe o horário de partida (horas em minutos):");
                int horaPartida = scanner.nextInt();
                int minutoPartida = scanner.nextInt();
                
                int horasEstacionado = calcularHorasEstacionado(horaChegada, minutoChegada, horaPartida, minutoPartida);
                
                double preco = calcularPreco(horasEstacionado);
                
                System.out.println("Tempo estacionado: " + horasEstacionado + " hora(s)");
                System.out.println("Preço a ser cobrado: R$ " + preco);
                
                scanner.close();
            }
            
            public static int calcularHorasEstacionado(int horaChegada, int minutoChegada, int horaPartida, int minutoPartida) {
                int horasEstacionado;
                if (horaPartida < horaChegada || (horaPartida == horaChegada && minutoPartida < minutoChegada)) {
                    horasEstacionado = horaPartida + 24 - horaChegada;
                } else {
                    horasEstacionado = horaPartida - horaChegada;
                }
                if (minutoPartida > minutoChegada + 29) {
                    horasEstacionado++;
                }
                return horasEstacionado;
            }
            
            public static double calcularPreco(int horasEstacionado) {
                double preco;
                switch (horasEstacionado) {
                    case 1:
                    case 2:
                        preco = 5.0 * horasEstacionado;
                    case 3:
                    case 4:
                        preco = 7.5 * horasEstacionado;
                    default:
                        preco = 10.0 * horasEstacionado;
                }
                return preco;
}
    public static void main(String[] args) {
        new Ex27UN4();
    }
}
