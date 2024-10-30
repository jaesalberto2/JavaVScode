package seleccionFutbol;

import java.io.Serializable;

public class Futbolista extends SeleccionFutbol implements Serializable{
    String posicion;
    int numero;
    float salario;
    public Futbolista(int id, String nombre, String apellido, double peso, int edad, String posicion, int numero,
            float salario) {
        super(id, nombre, apellido, peso, edad);
        this.posicion = posicion;
        this.numero = numero;
        this.salario = salario;
    }
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    
    
}
