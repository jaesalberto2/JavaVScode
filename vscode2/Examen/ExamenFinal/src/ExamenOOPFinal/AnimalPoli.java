package ExamenOOPFinal;

import java.io.Serializable;

public class AnimalPoli implements Serializable{
    String nombre;
    double peso;
    int edad;
    public AnimalPoli(String nombre, double peso, int edad) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
