public class Main{
  public static void main(String[] args){
    Produto produto = new Produto();

    produto.nome = "Arroz";
    produto.preco = 12.50;
    produto.quantidadeEmEstoque = 10;

    produto.alterarPreco(15.20);
    produto.alterarQuantidade(6);

    produto.exibirInformacoes();
  }
}
