import java.util.Scanner;

public class ex06 {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        Scanner digite = new Scanner(System.in);
        String nome = teclado.next();
        int dataNascimento = 1996;

        String nome1 = digite.next();
        int dataDe_Nascimento = 2000;
        System.out.println("nome " +nome);
        System.out.println("data de nascimento " + dataNascimento);
        System.out.println("nome sicrano " + nome1);
        System.out.println("data de nascimento " + dataDe_Nascimento);
    }
}