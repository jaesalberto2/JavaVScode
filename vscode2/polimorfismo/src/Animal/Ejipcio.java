package Animal;

public class Ejipcio extends Lobo{

    double sizepata, sizecola;

    public Ejipcio(String habitat, String comida, String edad, String color, String tamaño, String olfato,
            String manada, double sizepata, double sizecola) {
        super(habitat, comida, edad, color, tamaño, olfato, manada);
        this.sizepata = sizepata;
        this.sizecola = sizecola;
    }

    public double getSizepata() {
        return sizepata;
    }

    public void setSizepata(double sizepata) {
        this.sizepata = sizepata;
    }

    public double getSizecola() {
        return sizecola;
    }

    public void setSizecola(double sizecola) {
        this.sizecola = sizecola;
    }

   





}
