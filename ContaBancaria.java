public class ContaBancaria {
    private String nomeTitular;
    private int numConta;
    protected int saldo;


    public String getNomeTitular(){
        return this.nomeTitular;
    }
    public void setNomeTitular(String nome){
        this.nomeTitular= nome;
    }
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int conta){
        this.numConta= conta;
    }
    public int getSaldo(){
        return this.saldo;
    }   
    public void setSaldo(int deposito){
        this.saldo= deposito;
    }

    ContaBancaria(String nome, int numero, int valor){
        this.nomeTitular= nome;
        this.numConta= numero;
        this.saldo= valor;
    }

    public void depositar(int valor){
        this.saldo=  getSaldo() + valor;

    }

    public void sacar(int valor){
        if(valor <= this.getSaldo()){
            this.saldo= getSaldo()- valor;
        }
        else{
            System.out.println("Tentativa de saque fracassada! Voçê não possui este saldo. Por favor realize uma operação válida.");
        }
    }
    public void extrato(){
        System.out.println(" ");
        System.out.println("Titular: " + getNomeTitular());
        System.out.println("Conta: " + getNumConta());
        System.out.println("Saldo: " + getSaldo());
        }
}
