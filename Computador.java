public class Computador extends Equipamento{
    private String voltagem; // Referente a criação da classe computador e os atributos da 5 questão do BM
    private String usuario;
    private int numId;

    public String getVoltagem(){
        return voltagem;
    }
    public void setVoltagem(String voltagem){ //Qst 6 do BM, cria os métodos de acesso e modificação dos atributos
        this.voltagem= voltagem;
    }
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario= usuario;
    }
    public int getNumId(){
        return numId;
    }
    public void setNumId(int numId){
        this.numId= numId;
    }

    Computador(String marca, String tipo, String voltagem,String usuario,int numId ){
        super(marca,tipo);
        this.voltagem= voltagem;
        this.usuario= usuario;
        this.numId= numId;
    }

    public void imprimir(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Voltagem: " + getVoltagem());
        System.out.println("Usuario: " + getUsuario());
        System.out.println("Id: " + getNumId());
    }
}
