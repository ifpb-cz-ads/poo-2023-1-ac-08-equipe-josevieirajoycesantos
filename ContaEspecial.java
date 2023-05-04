public class ContaEspecial extends ContaBancaria {

    ContaEspecial(String nomeTitular, int numConta, int saldo) {
        super(nomeTitular, numConta, saldo);
    }

    @Override
    public void sacar(int valor) {
        setSaldo(this.saldo - valor);
        System.out.println(" ");
        System.out.println("Realização de saque no valor de  " + valor);
    }

    @Override
    public void extrato() {
        System.out.println(" ");
        System.out.println("Titular:" + getNomeTitular());
        System.out.println("Conta: " + getNumConta());
        if (getSaldo() < 0) {
            System.out.println("Atenção Saldo NEGATIVO!");
        }
        System.out.println("Saldo: " + getSaldo());

    }

}
