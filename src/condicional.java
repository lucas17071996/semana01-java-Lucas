public class condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1986;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String flatType = "plus";
        if (anoDeLancamento >= 2024) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retro que vale apena assistir!");
        }
        if (incluidoNoPlano == true && flatType.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Deve pagar a locação!");
        }
    }
}
