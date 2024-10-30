package ExamenOOPFinal;

public class Canino extends Mamifero{

    String habitat;

    public Canino(String name, float peso, int edad, String alimento, String habitat) {
        super(name, peso, edad, alimento);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Canino [getAlimento()=" + getAlimento() + ", getHabitat()=" + getHabitat() + ", getName()=" + getName()
                + ", getPeso()=" + getPeso() + ", getEdad()=" + getEdad() + "]";
    }


    

    
    
}
