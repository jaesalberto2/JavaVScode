package itz;
import static javax.swing.JOptionPane.*;

public class UsaLista {
    public static void main(String[] args) {

        // crear una lista generica de tipo articulos
        ListaOrdenada<Articulos> articulo = new ListaOrdenada<Articulos>(100);
        String menu = "1.- Insertar\n2.- Eliminar\n3.- Buscar\n4.- Listar\n5.- Salir";
        int op=0;
        do{
            try{
            op = Integer.parseInt(showInputDialog(menu));
            int codigo; Articulos articulox;
            switch(op){
                case 1:
                    articulox = new Articulos();
                    articulox.pedirDatos();
                    articulo.insertar(articulox);
                    break;
                case 2:
                    codigo = Integer.parseInt(showInputDialog("Codigo a eliminar"));
                    articulox = new Articulos(codigo);
                    articulo.eliminar(articulox);
                    break;
                case 3:
                    codigo = Integer.parseInt(showInputDialog("Codigo a buscar"));
                    articulox = new Articulos(codigo);
                    int pos = articulo.busquedaSecuencial(articulox);
                    if(pos != -1){
                        showMessageDialog(null, "Articulo encontrado en la posicion: " + pos);
                    }else{
                        showMessageDialog(null, "Articulo no encontrado");
                    }
                    break;
                case 4:
                showMessageDialog(null, articulo.listar());   
                break;
                case 5: break;
                default: showMessageDialog(null, "Opcion no valida");
                
            }
        }catch(Exception e){
            showMessageDialog(null, "Error: " + e.getMessage());
        }
        }while (op != 5); {
            
        }
        
    }

}
