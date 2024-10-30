package PolimorfismoAnimal;

public class Canino extends Mamifero{
    String size;

    public Canino(String nombre, double peso, int edad, String habitat, String alimento, String raza, String size) {
        super(nombre, peso, edad, habitat, alimento, raza);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    

   

   


    
    
}
