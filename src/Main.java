// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto(); // iniciando a classe

        produto.nome = "caneta";
        produto.descricao = "caneta ";
        produto.precoUnitario = 2.50;
        produto.quantidade = 50;
        System.out.println(produto.nome);
        System.out.println(produto.descricao);
        System.out.println(produto.precoUnitario);
        System.out.println(produto.quantidade);
        produto.imprimir();
    }
}