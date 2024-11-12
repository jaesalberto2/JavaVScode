public class Nodo {
    //nodo para un grafo
    private int id; //identificador del nodo    
    private int x; //coordenada x
    private int y; //coordenada y
    private int peso; //peso del nodo
    private boolean visitado; //si el nodo ha sido visitado
    private int distancia; //distancia del nodo al origen
    private Nodo padre; //nodo padre en el recorrido
    private int grado; //grado del nodo
    private int color; //color del nodo
    private int componente; //componente a la que pertenece el nodo
    private int tiempo; //tiempo de descubrimiento del nodo
    private int tiempoFin; //tiempo de finalizacion del nodo
    private int distanciaMinima; //distancia minima al nodo
    private int distanciaMaxima; //distancia maxima al nodo
    private int distanciaPromedio; //distancia promedio al nodo
    private int distanciaTotal; //distancia total al nodo

    //constructor
    public Nodo(int id, int x, int y, int peso) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.peso = peso;
        this.visitado = false;
        this.distancia = Integer.MAX_VALUE;
        this.padre = null;
        this.grado = 0;
        this.color = 0;
        this.componente = 0;
        this.tiempo = 0;
        this.tiempoFin = 0;
        this.distanciaMinima = 0;
        this.distanciaMaxima = 0;
        this.distanciaPromedio = 0;
        this.distanciaTotal = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getComponente() {
        return componente;
    }

    public void setComponente(int componente) {
        this.componente = componente;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getTiempoFin() {
        return tiempoFin;
    }

    public void setTiempoFin(int tiempoFin) {
        this.tiempoFin = tiempoFin;
    }

    public int getDistanciaMinima() {
        return distanciaMinima;
    }

    public void setDistanciaMinima(int distanciaMinima) {
        this.distanciaMinima = distanciaMinima;
    }

    public int getDistanciaMaxima() {
        return distanciaMaxima;
    }

    public void setDistanciaMaxima(int distanciaMaxima) {
        this.distanciaMaxima = distanciaMaxima;
    }

    public int getDistanciaPromedio() {
        return distanciaPromedio;
    }

    public void setDistanciaPromedio(int distanciaPromedio) {
        this.distanciaPromedio = distanciaPromedio;
    }

    public int getDistanciaTotal() {
        return distanciaTotal;
    }

    public void setDistanciaTotal(int distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    @Override
    public String toString() {
        return "Nodo{" + "id=" + id + ", x=" + x + ", y=" + y + ", peso=" + peso + ", visitado=" + visitado + ", distancia=" + distancia + ", padre=" + padre + ", grado=" + grado + ", color=" + color + ", componente=" + componente + ", tiempo=" + tiempo + ", tiempoFin=" + tiempoFin + ", distanciaMinima=" + distanciaMinima + ", distanciaMaxima=" + distanciaMaxima + ", distanciaPromedio=" + distanciaPromedio + ", distanciaTotal=" + distanciaTotal + '}';
    }

    public void reiniciar() {
        this.visitado = false;
        this.distancia = Integer.MAX_VALUE;
        this.padre = null;
        this.grado = 0;
        this.color = 0;
        this.componente = 0;
        this.tiempo = 0;
        this.tiempoFin = 0;
        this.distanciaMinima = 0;
        this.distanciaMaxima = 0;
        this.distanciaPromedio = 0;
        this.distanciaTotal = 0;
    }

   
    


}
