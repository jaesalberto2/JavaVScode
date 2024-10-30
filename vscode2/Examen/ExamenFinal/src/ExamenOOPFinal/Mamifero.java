package ExamenOOPFinal;

public class Mamifero extends Animal{

    String alimento;

    public Mamifero(String name, float peso, int edad, String alimento) {
        super(name, peso, edad);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    
}
