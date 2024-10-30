public class Estudiante extends Persona{
    String escuela;
    double promedio;
    String correo;

    public Estudiante(final String name, final String nacionalidad, final String sexo, final int edad, final String escuela, final double promedio,
            final String correo) {
        super(name, nacionalidad, sexo, edad);
        this.escuela = escuela;
        this.promedio = promedio;
        this.correo = correo;
    }
    public String getEscuela() {
        return escuela;
    }
    public void setEscuela(final String escuela) {
        this.escuela = escuela;
    }
    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(final double promedio) {
        this.promedio = promedio;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(final String correo) {
        this.correo = correo;
    }
    @Override
    public String toString() {
        return "Estudiante [getName()=" + getName() + ", getNacionalidad()=" + getNacionalidad() + ", getEscuela()="
                + getEscuela() + ", getSexo()=" + getSexo() + ", getPromedio()=" + getPromedio() + ", getEdad()="
                + getEdad() + ", getCorreo()=" + getCorreo() + "]";
    }

    
    
    
}
