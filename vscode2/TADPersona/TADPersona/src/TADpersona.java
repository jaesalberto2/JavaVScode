public class TADpersona {
    private String nombre;
    private int edad;
    private int nacimiento;
    public TADpersona(String nombre, int edad, int nacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacimiento = nacimiento;
    }
    @Override
    public String toString() {
        return "[nombre=" + nombre + ", edad=" + edad + ", nacimiento=" + nacimiento + "]";
    }

    public int getedad(){
        return this.edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getNacimiento() {
        return nacimiento;
    }
    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    
    
}
