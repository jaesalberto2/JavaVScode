package ExamenOOPFinal;



public class AguilaPoli extends OviparoPoli {
    String garras;
    String vista;
    public AguilaPoli(String nombre, double peso, int edad, String tamano, String especie, String garras,
            String vista) {
        super(nombre, peso, edad, tamano, especie);
        this.garras = garras;
        this.vista = vista;
    }
    public String getGarras() {
        return garras;
    }
    public void setGarras(String garras) {
        this.garras = garras;
    }
    public String getVista() {
        return vista;
    }
    public void setVista(String vista) {
        this.vista = vista;
    }
}
