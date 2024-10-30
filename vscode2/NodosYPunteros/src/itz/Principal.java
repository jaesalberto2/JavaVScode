package itz;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0,el;
        Lista listita = new Lista();
        do{
            try{
                opcion = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null,
                        "1. Agregar al inicio\n"
                        + "2. Mostrar lista\n"
                        + "3. Agregar al fianl\n"
                        + "4. Eliminar del inicio\n"
                        + "5. Eliminar del final\n"
                        + "6. Eliminar por posicion\n"
                        + "7. Buscar\n"
                        + "8. Salir\n"
                        + "¿Que deseas hacer?", "Menu de opciones", 3));

                switch(opcion){
                    case 1:
                        try{
                            el = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null, "Ingresa el elemento", "Agregando al inicio", 3));

                            listita.agregarAlInicio(el);
                        }catch(NumberFormatException n){
                            javax.swing.JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                        }
                    break;
                    case 2:
                    try{
                        listita.mostrarLista();
                    }catch(Exception e){
                        javax.swing.JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
                    }

                    break;
                    case 3:
                    try{
                        el = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null, "Ingresa el elemento", "Agregando al final", 3));
                        listita.agregarAlFinal(el);

                    }catch(NumberFormatException n){
                        javax.swing.JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                    }
                        break;
                    case 4:
                        try{
                            el = listita.borrarDelInicio();
                            javax.swing.JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + el, "Eliminando nodo del inicio", 1);
                        }catch(Exception e){
                            javax.swing.JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
                        }
                        break;
                    case 5:
                        try{
                            el = listita.borrarDelFinal();
                            javax.swing.JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + el, "Eliminando nodo del final", 1);
                        }catch(Exception e){
                            javax.swing.JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
                        }
                        break;
                    case 6:
                        try{
                            el = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null, "Ingresa la posicion del nodo a eliminar", "Eliminando nodo por posicion", 3));
                            if(el <= 1){
                                listita.borrarDelInicio();
                            }else{
                                Nodo temporal = listita.inicio;
                                for(int i = 1; i < el-1; i++){
                                    temporal = temporal.siguiente;
                                }
                                int n = temporal.siguiente.dato;
                                temporal.siguiente = temporal.siguiente.siguiente;
                                javax.swing.JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + n, "Eliminando nodo por posicion", 1);
                            }
                        }catch(Exception e){
                            javax.swing.JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
                        }
                        break;
                    case 7:
                        try{
                            el = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null, "Ingresa el elemento a buscar", "Buscando nodo", 3));
                            if(listita.buscar(el)){
                                javax.swing.JOptionPane.showMessageDialog(null, "El elemento " + el + " si se encuentra en la lista", "Buscando nodo", 1);
                            }else{
                                javax.swing.JOptionPane.showMessageDialog(null, "El elemento " + el + " no se encuentra en la lista", "Buscando nodo", 0);
                            }
                        }catch(Exception e){
                            javax.swing.JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
                        }
                        break;

                    case 8:
                        javax.swing.JOptionPane.showMessageDialog(null, "Aplicacion finalizada", "Fin", 1);
                       System.exit(0);
                        break;
                    default:
                        javax.swing.JOptionPane.showMessageDialog(null, "Opcion incorrecta", "Error", 0);
                }
            } catch (Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            }
        }while(opcion != 8);
    }

}
