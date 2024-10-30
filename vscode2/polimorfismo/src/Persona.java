public class Persona {
    String name,nacionalidad,sexo;
    int edad;
    public Persona(String name, String nacionalidad, String sexo, int edad) {
        this.name = name;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
        this.edad = edad;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
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
    @Override
    public String toString() {
        return "Nombre : " + getName() + "\nNacionalidad : " + getNacionalidad()
                + "\nSexo :  " + getSexo() + "\nEdad : " + getEdad() ;
    }
  
    
    
}
