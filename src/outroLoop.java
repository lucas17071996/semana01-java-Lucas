import java.util.Scanner;

public class outroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avliação para o filme ou -1 para parar");
            nota = leitura.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalNotas++;
            }
        }
        System.out.println("A média de avaliações é: " + mediaAvaliacao / totalNotas);
    }
}