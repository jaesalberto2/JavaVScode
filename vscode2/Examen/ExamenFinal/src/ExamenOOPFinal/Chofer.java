package ExamenOOPFinal;

import java.io.Serializable;

public class Chofer implements Serializable{

    String name;
    String apellido;
    String email;
    int edad;
    public Chofer(String name, String apellido, String email, int edad) {
        this.name = name;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}