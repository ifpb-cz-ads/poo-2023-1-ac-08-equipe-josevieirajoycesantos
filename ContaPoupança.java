public class ContaPoupança extends ContaBancaria{
ContaPoupança(String nomeTitular, int numConta, int saldo){
        super(nomeTitular, numConta, saldo);
    }
     public void reajustar(int percentual){
        int saldoAtual= this.getSaldo();
        int reajuste= saldoAtual*percentual;
        this.depositar(reajuste);
     }
}
