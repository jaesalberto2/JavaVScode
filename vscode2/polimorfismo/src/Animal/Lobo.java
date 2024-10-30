package Animal;

public class Lobo extends Mascota {
    String tamaño, olfato, manada;

    public Lobo(String habitat, String comida, String edad, String color, String tamaño, String olfato, String manada) {
        super(habitat, comida, edad, color);
        this.tamaño = tamaño;
        this.olfato = olfato;
        this.manada = manada;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getOlfato() {
        return olfato;
    }

    public void setOlfato(String olfato) {
        this.olfato = olfato;
    }

    public String getManada() {
        return manada;
    }

    public void setManada(String manada) {
        this.manada = manada;
    }
    

}
