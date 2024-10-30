package Animal;

import java.io.Serializable;

public class Mascota implements Serializable{
    String habitat, comida, edad, color;

    public Mascota(String habitat, String comida, String edad, String color) {
        this.habitat = habitat;
        this.comida = comida;
        this.edad = edad;
        this.color = color;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    

}
