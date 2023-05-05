public class Equipamento {
    private String marca; // Referente a criação da classe equipamento e os atributos da 4 questão do BM
    private String tipo;


    public String getMarca(){
        return marca;
    }
    public void setMarca( String marca){ // Qst 6 do BM, cria os métodos de acesso e modificação dos atributos
        this.marca= marca;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo( String tipo){
        this.tipo= tipo;
    }

    Equipamento(String marca,String tipo){
        this.marca= marca;
        this.tipo= tipo;
    }


    public void ligar(){
        System.out.println("O equipamento do tipo " + tipo + " está ligado");
    }

    public void desligar(){
        System.out.println("O equipamento do tipo " + tipo + " está desligado");
    }
}