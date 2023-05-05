public class ContaBancaria {
    private String nomeTitular;
    private int numConta;
    private boolean especial;
    protected int saldo;


    ContaBancaria(String nome, int numero, int valor, boolean especial){
        this.nomeTitular= nome;
        this.numConta= numero;
        this.saldo= valor;
        this.especial = especial;
    }

    public String getNomeTitular(){
        return this.nomeTitular;
    }
    public void setNomeTitular(String nome){
        this.nomeTitular= nome;
    }

    public boolean getEspecial(){
        return this.especial;
    }
    public void setEspecial(boolean especial){
        this.especial = especial;
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
        System.out.println("-- Extrato --");
        System.out.println("Titular: " + getNomeTitular());
        System.out.println("Conta: " + getNumConta());
        System.out.println("Saldo: " + getSaldo());
        }
}
