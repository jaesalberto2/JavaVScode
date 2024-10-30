package ExamenOOPFinal;



public class OviparoPoli extends AnimalPoli {
    String tamano;
    String especie;
    public OviparoPoli(String nombre, double peso, int edad, String tamano, String especie) {
        super(nombre, peso, edad);
        this.tamano = tamano;
        this.especie = especie;
    }
    public String getTamano() {
        return tamano;
    }
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    

    
}
