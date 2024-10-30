package ExamenOOPFinal;

import java.io.Serializable;

public class Vehiculo implements Serializable{
    Chofer chofer;
    Empresa empresa;
    String matricula;
    String modelo;
    public Vehiculo(Chofer chofer, Empresa empresa, String matricula, String modelo) {
        this.chofer = chofer;
        this.empresa = empresa;
        this.matricula = matricula;
        this.modelo = modelo;
    }
    public Chofer getChofer() {
        return chofer;
    }
    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }
    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}