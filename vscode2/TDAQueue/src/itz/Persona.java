package itz;

public class Persona implements Comparable<Persona> {
    private int edad;
    private String nombre;
    private int id;

    public Persona(int i, String string, int j) {
        //TODO Auto-generated constructor stub
        this.id=i;
        this.nombre=string;
        this.edad=j;

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persona [edad=" + edad + ", nombre=" + nombre + ", id=" + id + "]";
    }
    
    @Override
    public int compareTo(Persona o) {
        // TODO Auto-generated method stub
        return this.edad-o.edad;
    }

    

}
