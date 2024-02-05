import java.util.Scanner;

public class ex07 {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        Scanner digite = new Scanner(System.in);
        System.out.println("DIGITE NOME:");
        String nome = teclado.next();
        int dataNascimento = 1996;
        System.out.println("Digite a idade");
        int idade = teclado.nextInt();
        String nome1 = digite.next();
        int dataDe_Nascimento = 2000;
        System.out.println("nome " +nome);
        System.out.println("data de nascimento " + dataNascimento);
        System.out.println("nome sicrano " + nome1);
        System.out.println("data de nascimento " + dataDe_Nascimento);
        if (idade <= 17) {
            System.out.println("Adolescente!");
            System.out.println(digite.nextInt());
        }
        if (idade >= 18 && idade <= 29) {
            System.out.println("Jovem!");
            System.out.println(digite.nextInt());
        }
        if (idade >= 30 && idade<= 59) {
            System.out.println("Idoso");
            System.out.println(digite.nextInt());
        }
    }
}