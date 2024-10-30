package ExamenOOPFinal;

import java.io.Serializable;

public class Animal implements Serializable{
    String name;
    float peso;
    int edad;
    public Animal(String name, float peso, int edad) {
        this.name = name;
        this.peso = peso;
        this.edad = edad;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    



    
}
