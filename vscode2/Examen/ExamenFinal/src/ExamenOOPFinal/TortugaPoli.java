package ExamenOOPFinal;



public class TortugaPoli extends OviparoPoli {
    int longevidad;

    public TortugaPoli(String nombre, double peso, int edad, String tamano, String especie, int longevidad) {
        super(nombre, peso, edad, tamano, especie);
        this.longevidad = longevidad;
    }

    public int getLongevidad() {
        return longevidad;
    }

    public void setLongevidad(int longevidad) {
        this.longevidad = longevidad;
    }
    
    
}
