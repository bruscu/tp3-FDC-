public class Main {
  public static void main(String[] args) {
    Conta conta = new Conta();

    conta.titular = "Rafael";
    conta.numero = 2105;
    conta.agencia = "Bradesco";
    conta.saldo = 50000.00;
    conta.dataAbertura = "08/05/2018";

    System.out.println("Saldo atual: " + conta.saldo);
    conta.saca(1000);
    System.out.println("Saldo atual (após o saque): " + conta.saldo);
    conta.deposita(500);
    System.out.println("Saldo atual (após o depósito): " + conta.saldo);
    System.out.println("Rendimento: "+conta.calculaRendimento());
  }
}
