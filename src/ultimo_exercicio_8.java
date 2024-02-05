import java.util.Scanner;

public class ultimo_exercicio_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = teclado.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.print("* ");
        }
        System.out.println("Bem ao Comex");
    }
}