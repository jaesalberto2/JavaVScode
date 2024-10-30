package seleccionFutbol;

import java.io.Serializable;

public class Masajista extends SeleccionFutbol implements Serializable{
String especialidad, email;
float salario;
public Masajista(int id, String nombre, String apellido, double peso, int edad, String especialidad, String email,
        float salario) {
    super(id, nombre, apellido, peso, edad);
    this.especialidad = especialidad;
    this.email = email;
    this.salario = salario;
}
public String getEspecialidad() {
    return especialidad;
}
public void setEspecialidad(String especialidad) {
    this.especialidad = especialidad;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public float getSalario() {
    return salario;
}
public void setSalario(float salario) {
    this.salario = salario;
}


}
