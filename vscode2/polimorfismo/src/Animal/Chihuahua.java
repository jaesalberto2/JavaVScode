package Animal;

public class Chihuahua extends Perro{
    String agresivo, inteligencia;

    public Chihuahua(String habitat, String comida, String edad, String color, String raza, String size, String pelaje,
            String dueño, String agresivo, String inteligencia) {
        super(habitat, comida, edad, color, raza, size, pelaje, dueño);
        this.agresivo = agresivo;
        this.inteligencia = inteligencia;
    }

    public String getAgresivo() {
        return agresivo;
    }

    public void setAgresivo(String agresivo) {
        this.agresivo = agresivo;
    }

    public String getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(String inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public String toString() {
        return "Chihuahua [getHabitat()=" + getHabitat() + ", getRaza()=" + getRaza() + ", getAgresivo()="
                + getAgresivo() + ", getComida()=" + getComida() + ", getSize()=" + getSize() + ", getInteligencia()="
                + getInteligencia() + ", getEdad()=" + getEdad() + ", getPelaje()=" + getPelaje() + ", getColor()="
                + getColor() + ", getDueño()=" + getDueño() + "]";
    }

    

}
