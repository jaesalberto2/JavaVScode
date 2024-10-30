package seleccionFutbol;

import java.io.Serializable;

public class SeleccionFutbol implements Serializable{
    int id;
    String nombre, apellido;
    double peso;
    int edad;
    public SeleccionFutbol(int id, String nombre, String apellido, double peso, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.edad = edad;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    
}
