public class Produto {

    public String nome;
    public String descricao;
    public double precoUnitario;
    public int quantidade;
    public void imprimir(){
        System.out.println("Dados do produto ");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
    }
}
