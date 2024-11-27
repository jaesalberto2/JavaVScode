package itz;

public class Mascota {
    private String nombre;
    private String tipo;
    private int edad;
    // Constructor
    public Mascota(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método toString
    @Override
    public String toString() {
        return "Mascota [nombre=" + nombre + ", tipo=" + tipo + ", edad=" + edad + "]";
    }
    
    

}
