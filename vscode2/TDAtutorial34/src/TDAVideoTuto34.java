import javax.swing.JOptionPane;
public class TDAVideoTuto34 {

    public static void main(String[] args) {
        int opcion = 0, elemento;
        String nombre;
        ArbolBinario arbolito = new ArbolBinario();


        do{
            try{
               opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                       "1. Agregar un nodo\n"
                       + "2. Recorrer el arbol inOrden\n"
                       + "3. Recorrer el arbol preOrden\n"
                       + "4. Recorrer el arbol postOrden\n"
                       + "5. buscar un nodo\n"
                       + "6. Eliminar un nodo\n"
                       + "7. Salir\n"
                       + "Elige una opcion...", "Arboles Binarios",
                       JOptionPane.QUESTION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el numero del nodo", "Agregando Nodo",
                                JOptionPane.QUESTION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null,
                                "Ingresa el nombre del nodo", "Agregando Nodo",
                                JOptionPane.QUESTION_MESSAGE);
                        arbolito.agregarNodo(elemento, nombre);
                        break;
                    case 2:
                        if(!arbolito.estaVacio()){
                            arbolito.inOrden(arbolito.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio",
                                    "Vacio", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(!arbolito.estaVacio()){
                            arbolito.preOrden(arbolito.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio",
                                    "Vacio", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!arbolito.estaVacio()){
                            arbolito.postOrden(arbolito.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio",
                                    "Vacio", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if(!arbolito.estaVacio()){
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el numero del nodo a buscar", "Buscando Nodo",
                                    JOptionPane.QUESTION_MESSAGE));
                            if(arbolito.buscarNodo(elemento) == null){
                                JOptionPane.showMessageDialog(null, "Nodo no encontrado",
                                        "Nodo no encontrado", JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                JOptionPane.showMessageDialog(null, "Nodo encontrado",
                                        "Nodo encontrado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio",
                                    "Vacio", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        if(!arbolito.estaVacio()){
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el numero del nodo a eliminar", "Eliminando Nodo",
                                    JOptionPane.QUESTION_MESSAGE));
                            if(arbolito.eliminar(elemento) == false){
                                JOptionPane.showMessageDialog(null, "Nodo no encontrado",
                                        "Nodo no encontrado", JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                JOptionPane.showMessageDialog(null, "Nodo eliminado",
                                        "Nodo eliminado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio",
                                    "Vacio", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;


                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta",
                                "Error", JOptionPane.INFORMATION_MESSAGE);
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }
        }while(opcion != 7);
    }
}
