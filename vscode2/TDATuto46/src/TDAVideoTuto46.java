public class TDAVideoTuto46 {

    public static void main(String[] args) {
        // TODO code application logic here
        ArbolAVL arbolitoAVL = new ArbolAVL();
        arbolitoAVL.insertar(10);
        arbolitoAVL.insertar(5);
        arbolitoAVL.insertar(13);
        arbolitoAVL.insertar(1);
        arbolitoAVL.insertar(6);
        arbolitoAVL.insertar(17);

        arbolitoAVL.insertar(16);

        arbolitoAVL.preorden(arbolitoAVL.obtenerRaiz());        
    }
}
