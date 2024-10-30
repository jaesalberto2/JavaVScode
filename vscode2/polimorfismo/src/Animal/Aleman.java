package Animal;

public class Aleman extends Perro{
    String fidelidad, resistencia;

    public Aleman(String habitat, String comida, String edad, String color, String raza, String size, String pelaje,
            String dueño, String fidelidad, String resistencia) {
        super(habitat, comida, edad, color, raza, size, pelaje, dueño);
        this.fidelidad = fidelidad;
        this.resistencia = resistencia;
    }

    public String getFidelidad() {
        return fidelidad;
    }

    public void setFidelidad(String fidelidad) {
        this.fidelidad = fidelidad;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

   

}
