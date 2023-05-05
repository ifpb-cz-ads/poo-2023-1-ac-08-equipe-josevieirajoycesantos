public class ContaPoupança extends ContaBancaria{
ContaPoupança(String nomeTitular, int numConta, int saldo, boolean epecial) {
   super(nomeTitular, numConta, saldo, epecial);
}
     public void reajustar(int percentual){
        int saldoAtual= this.getSaldo();
        int reajuste= saldoAtual*percentual;
        this.depositar(reajuste);
     }
}
