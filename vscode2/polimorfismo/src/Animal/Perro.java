package Animal;

public class Perro extends Mascota{
    String raza, size, pelaje, dueño;

    public Perro(String habitat, String comida, String edad, String color, String raza, String size, String pelaje,
            String dueño) {
        super(habitat, comida, edad, color);
        this.raza = raza;
        this.size = size;
        this.pelaje = pelaje;
        this.dueño = dueño;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

}
