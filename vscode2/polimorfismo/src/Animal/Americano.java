package Animal;

public class Americano extends Lobo{
    String sizemanada, razgosocial;

    public Americano(String habitat, String comida, String edad, String color, String tamaño, String olfato,
            String manada, String sizemanada, String razgosocial) {
        super(habitat, comida, edad, color, tamaño, olfato, manada);
        this.sizemanada = sizemanada;
        this.razgosocial = razgosocial;
    }

    public String getSizemanada() {
        return sizemanada;
    }

    public void setSizemanada(String sizemanada) {
        this.sizemanada = sizemanada;
    }

    public String getRazgosocial() {
        return razgosocial;
    }

    public void setRazgosocial(String razgosocial) {
        this.razgosocial = razgosocial;
    }

    @Override
    public String toString() {
        return "Americano [getHabitat()=" + getHabitat() + ", getTamaño()=" + getTamaño() + ", getSizemanada()="
                + getSizemanada() + ", getComida()=" + getComida() + ", getOlfato()=" + getOlfato() + ", getEdad()="
                + getEdad() + ", getRazgosocial()=" + getRazgosocial() + ", getManada()=" + getManada()
                + ", getColor()=" + getColor() + "]";
    }

    
    
}
