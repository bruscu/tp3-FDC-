import java.util.*;

public class Produto{
  public String nome;
  public double preco;
  public int quantidadeEmEstoque;

  public void alterarPreco(double novoPreco){
    preco = novoPreco;
  }

  public void alterarQuantidade(int novaQtd){
    quantidadeEmEstoque = novaQtd;
  }

  public void exibirInformacoes(){
    System.out.println("Nome: "+nome);
    System.out.println("Preço: "+preco);
    System.out.println("Quantidade em estoque: "+quantidadeEmEstoque);
  }
}
