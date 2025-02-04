package itz;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class MenuEjemplo {
    public static void main(String[] args) {
        //crear el marco en jframe
        JFrame frame = new JFrame("Ejemplo de menú");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        //crear la barra menu
        JMenuBar menuBar = new JMenuBar();

        //Crear los menus
        JMenu MenuArchivo  = new JMenu("Archivo");
        JMenu MenuEditar  = new JMenu("Editar");
        JMenu MenuAyuda  = new JMenu("Ayuda");

        //crear elementos de menu
        JMenuItem abrirItem = new JMenuItem("Abrir");
        JMenuItem guardarItem = new JMenuItem("Guardar");
        JMenuItem salirItem = new JMenuItem("Salir");

        JMenuItem copiarItem = new JMenuItem("Copiar");
        JMenuItem pegarItem = new JMenuItem("Pegar");
        JMenuItem acercaDeItem = new JMenuItem("Acerca de");

        //agregar funciones a los elementos de menu
        salirItem.addActionListener(e -> System.exit(0));
        acercaDeItem.addActionListener(e -> 
        JOptionPane.showMessageDialog(frame, "Bienvenido al menú de ejemplo","acerca de", JOptionPane.INFORMATION_MESSAGE));

        //agregar los elementos de menu a los menus
        MenuArchivo.add(abrirItem);
        MenuArchivo.add(guardarItem);

        MenuArchivo.addSeparator();//agregar separador

        MenuArchivo.add(salirItem);

        MenuEditar.add(copiarItem);
        MenuEditar.add(pegarItem);

        MenuAyuda.add(acercaDeItem);

        //agregar los menus a la barra de menu

        menuBar.add(MenuArchivo);
        menuBar.add(MenuEditar);
        menuBar.add(MenuAyuda);
        //agregar la barra de menu al marco
        frame.setJMenuBar(menuBar);

        //mostrar el marco
        frame.setVisible(true);
        
    }

}
