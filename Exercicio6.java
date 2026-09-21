import java.util.*;


public class Produto{
  public String nome;
  public double preco;
  public int quantidadeEmEstoque;


  public Produto(String nome, double preco, int quantidadeEmEstoque){
    this.nome = nome;
    this.preco = preco;
    this.quantidadeEmEstoque = quantidadeEmEstoque;
  }//Quando criado um objeto do Produto, automaticamente os atributos recebem seus parametros na hora da criação
 
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
    Produto produto = new Produto("Feijão",8.40,20);


    System.out.println("Nome: " + produto.getNome());
    System.out.println("Preço: " + produto.getPreco());
    System.out.println("Quantidade em estoque: " + produto.getQuantidadeEmEstoque());
  }
}

//Sem o construtor, temos que fazer várias chamadas para atribuir valores nos atributos, com o construtor já fazemos isso tudo de uma vez.
//Isso deixa a criação do objeto mais simples, organizada e garantida com os valores já definidos.
