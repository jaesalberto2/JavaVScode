package itz;

public class ArregloOrdenadoApp {
    public static void main(String[] args) {
        
        int tamMax =30;
        ArregloOrdenado arrOrd;
        arrOrd = new ArregloOrdenado(tamMax);
        //insertamos 10 valores

        arrOrd.insertar(77);

        arrOrd.insertar(99);

        arrOrd.insertar(44);

        arrOrd.insertar(55);

        arrOrd.insertar(22);

        arrOrd.insertar(89);

        arrOrd.insertar(11);

        arrOrd.insertar(0);

        arrOrd.insertar(66);

        arrOrd.insertar(34);

        arrOrd.mostrarArreglo();

        //busqueda binaria

        long buscar = 55;
        int posicion;
        posicion= arrOrd.busquedaBinaria(buscar);
        if(posicion!=-1){
            System.out.println("Se encontro elemento "+ buscar+" en la posicion "+posicion);
        }else{
            System.out.println("No se encontro ele elemento "+buscar);
        }

        //Borrar items del arreglo
        arrOrd.eliminar(0);
        arrOrd.eliminar(55);
        arrOrd.eliminar(99);
        arrOrd.mostrarArreglo();

        
    }

}
