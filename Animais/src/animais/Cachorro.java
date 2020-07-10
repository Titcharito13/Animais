package animais;

public class Cachorro extends Animal {
    
    public void late(){
        System.out.println("AUAUAUAUAUAUAUAU");
    }
    
    @Override
    public void caminha(){
        System.out.println("Cachorro caminhando...");
    }
    
}
