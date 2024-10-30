package PolimorfismoAnimal;

public class Animal {
    String nombre;
    double peso;
    int edad;
    String Habitat;
    public Animal(String nombre, double peso, int edad, String habitat) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        Habitat = habitat;
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
    public String getHabitat() {
        return Habitat;
    }
    public void setHabitat(String habitat) {
        Habitat = habitat;
    }
    

    
    
}
