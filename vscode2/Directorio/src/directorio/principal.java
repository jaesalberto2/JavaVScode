package directorio;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Directorio directorio = new Directorio();
        Scanner sc = new Scanner(System.in);
        int opcion = 1;
        while (opcion > 0) {
            System.out.println("Bienvenido al directorio de contactos");
            
            System.out.println("1.- Agregar contacto");
            System.out.println("2.- Borrar contacto");
            System.out.println("3.- Buscar contacto");
            System.out.println("4.- Listar contactos");
            System.out.println("5.- Borrar todos los contactos");
            System.out.println("0.- Salir");
            System.out.println("Seleccione una opcion");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del contacto");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese el telefono del contacto");
                    String telefono = sc.nextLine();
                    int res = directorio.AgregarContacto(nombre, telefono);
                    if (res == 1) {
                        System.out.println("Contacto agregado");
                    } else {
                        System.out.println("El contacto ya existe");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del contacto a borrar");
                    nombre = sc.nextLine();
                    res = directorio.BorrarContacto(nombre);
                    if (res == 1) {
                        System.out.println("Contacto borrado");
                    } else {
                        System.out.println("El contacto no existe");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del contacto a buscar");
                    nombre = sc.nextLine();
                    String res2 = directorio.BuscarContacto(nombre);
                    if (res2.equals("")) {
                        System.out.println("El contacto no existe");
                    } else {
                        System.out.println("El telefono del contacto es: " + res2);
                    }
                    break;
                case 4:
                    directorio.ListarContactos();
                    break;
                case 5:
                    directorio.BorrarTodos();
                    System.out.println("Todos los contactos han sido borrados");
                    break;
                case 0:
                    System.out.println("Gracias por usar el directorio de contactos");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }

        
    }

}
