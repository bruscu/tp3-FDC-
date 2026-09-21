import java.util.*;

public class Produto{
  public String nome;
  public double preco;
  public int quantidadeEmEstoque;
  
  String getNome(){
    return nome;
  }
  double getPreco(){
    return preco;
  }
  int getQuantidadeEmEstoque(){
    return quantidadeEmEstoque;
  }

  void setNome(String novoNome){
    nome = novoNome;
  }
  void setPreco(double novoPreco){
    preco = novoPreco;
  }
  void setQuantidadeEmEstoque(int novaQuantidade){
    quantidadeEmEstoque = novaQuantidade;
  }
}

public class Main {
  public static void main(String[] args) {
    Produto produto = new Produto();

    produto.setNome("Macarrão");
    produto.setPreco(15.21);
    produto.setQuantidadeEmEstoque(13);

    System.out.println("Estoque atual: " + produto.getQuantidadeEmEstoque());
    produto.setQuantidadeEmEstoque(10);

    System.out.println("Nome: " + produto.getNome());
    System.out.println("Preço: " + produto.getPreco());
    System.out.println("Quantidade em estoque: " + produto.getQuantidadeEmEstoque());
  }
}
