package seleccionFutbol;

import java.io.Serializable;

public class Entrenador extends SeleccionFutbol implements Serializable{
String idFederacion, campeonatos;
int equipos;
public Entrenador(int id, String nombre, String apellido, double peso, int edad, String idFederacion,
        String campeonatos, int equipos) {
    super(id, nombre, apellido, peso, edad);
    this.idFederacion = idFederacion;
    this.campeonatos = campeonatos;
    this.equipos = equipos;
}
public String getIdFederacion() {
    return idFederacion;
}
public void setIdFederacion(String idFederacion) {
    this.idFederacion = idFederacion;
}
public String getCampeonatos() {
    return campeonatos;
}
public void setCampeonatos(String campeonatos) {
    this.campeonatos = campeonatos;
}
public int getEquipos() {
    return equipos;
}
public void setEquipos(int equipos) {
    this.equipos = equipos;
}



}
