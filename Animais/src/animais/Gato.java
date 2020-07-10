package animais;

public class Gato extends Animal {
    public void mia(){
        System.out.println("MIAU MIAU MIAU");
    }
    
    @Override
    public void caminha(){
        System.out.println("Gato caminhando...");
    }
}
