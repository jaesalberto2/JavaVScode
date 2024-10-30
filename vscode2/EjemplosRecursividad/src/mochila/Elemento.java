public class Elemento {

    private int peso;
    private int beneficio;
    public Elemento(int peso, int beneficio) {
        this.peso = peso;
        this.beneficio = beneficio;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getBeneficio() {
        return beneficio;
    }
    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + peso;
        result = prime * result + beneficio;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Elemento other = (Elemento) obj;
        if (peso != other.peso)
            return false;
        if (beneficio != other.beneficio)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Elemento [peso=" + peso + ", beneficio=" + beneficio + "]";
    }

    

    
 

}
