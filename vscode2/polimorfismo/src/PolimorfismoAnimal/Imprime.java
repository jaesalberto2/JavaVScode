package PolimorfismoAnimal;

public class Imprime {
    public String imprime(Canino c){
        
  
        return c.getAlimento() + "\t" + c.getNombre() + "\t" + c.getRaza()
                + "\t" + c.getPeso() + "\t" + c.getEdad() + "\t" + c.getHabitat() + "\n";
   
    }
    
}
