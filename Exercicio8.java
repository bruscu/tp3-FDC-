public class Conta {
  public String titular;
  public int numero;
  public String agencia;
  public double saldo;
  public String dataAbertura;

  public void saca(double valor){
    saldo -= valor;
  }
  public void deposita(double valor){
    saldo += valor;
  }
  public double calculaRendimento(){
    return saldo * 0.1;
  }
}
