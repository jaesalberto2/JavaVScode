package itz;

public class Paciente {
    private int nss;
    private String nombre;
    private String enfermedad;
    
    //constructores
    public Paciente(int nss) {
        this.nss = nss;
    }
    public Paciente(int nss, String nombre, String enfermedad) {
        this.nss = nss;
        this.nombre = nombre;
        this.enfermedad = enfermedad;
    }
    //getters y setters
    public int getNss() {
        return nss;
    }
    public void setNss(int nss) {
        this.nss = nss;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEnfermedad() {
        return enfermedad;
    }
    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }
    @Override
    public String toString() {
        return "Paciente [nss=" + nss + ", nombre=" + nombre + ", enfermedad=" + enfermedad + "]";
    }

    public boolean equals(Object objx) {
       if(objx instanceof Paciente){
        Paciente pacx = (Paciente) objx;
        if (this.nss == pacx.nss)
            return true; else return false;

        }else return false;
    
    }
    
    


}
