package colas;

import java.util.Scanner;

public class Paciente {
    //Atributos
    private String nombre;
    private String sintomas;
    private int nss;
    //Constructor
    public Paciente() {
 
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSintoma() {
        return sintomas;
    }
    public void setSintoma(String sintomas) {
        this.sintomas = sintomas;
    }
    public int getNss() {
        return nss;
    }
    public void setNss(int nss) {
        this.nss = nss;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + nss;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Paciente other = (Paciente) obj;
        if (nss != other.nss)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Paciente [nombre=" + nombre + ", sintoma=" + sintomas + ", nss=" + nss + "]";
    }

    //Pedir datos del paciente
public void pedirDatos() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el numero de seguro social del paciente: ");
    this.nss = sc.nextInt();
    sc.nextLine();
    
    System.out.println("Introduce el nombre del paciente: ");
    this.nombre = sc.nextLine();

    System.out.println("Introduce el sintoma del paciente: ");
    this.sintomas = sc.nextLine();
 
    sc.close();

    


}
}
