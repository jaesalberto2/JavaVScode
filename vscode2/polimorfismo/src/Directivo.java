public class Directivo extends Persona{
    
    String puesto, departamento,sexo;
    int edad;
    public Directivo(String name, String nacionalidad, String sexo, int edad, String puesto, String departamento,
            String sexo2, int edad2) {
        super(name, nacionalidad, sexo, edad);
        this.puesto = puesto;
        this.departamento = departamento;
        sexo = sexo2;
        edad = edad2;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    
}
