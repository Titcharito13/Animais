package animais;

public class Animal {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    protected String nome;
    protected String raca;
    
    public void caminha(){
      System.out.println("Estou caminhando!!");
    }
    
}
