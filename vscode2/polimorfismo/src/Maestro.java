public class Maestro extends Persona{
    String grado;
    double salario;
    String direccion;
    int telefono;
    public Maestro(String name, String nacionalidad, String sexo, int edad, String grado, double salario,
            String direccion, int telefono) {
        super(name, nacionalidad, sexo, edad);
        this.grado = grado;
        this.salario = salario;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public String getGrado() {
        return grado;
    }
    public void setGrado(String grado) {
        this.grado = grado;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    @Override
    public String toString() {
        return "Maestro [getName()=" + getName() + ", getNacionalidad()=" + getNacionalidad() + ", getGrado()="
                + getGrado() + ", getSexo()=" + getSexo() + ", getSalario()=" + getSalario() + ", getEdad()="
                + getEdad() + ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono() + "]";
    }

    
    
    
}
