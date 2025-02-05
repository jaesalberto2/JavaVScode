
package itz;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import javax.swing.JFrame;

public class Ventana extends JFrame {
    private JPanel contenedor;
    private JPanel lblNombre;
    private JTextField txtNombre;
    private DefaultListModel<String> listaNombres = new DefaultListModel<String>();
    private JList<String> lstNombres;
    private JButton btnAgregar;
    private JButton btnEliminar;
    private JButton btnLimpiar;
    private JScrollPane scroll;
    public Ventana() {
        iniciarComponentes();
        this.setTitle("Lista de Nombres");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        
        
    }
    private void iniciarComponentes() {
        contenedor = new JPanel();
        contenedor.setLayout(null);
        this.getContentPane().add(contenedor);

        
        lblNombre = new JPanel();
        lblNombre.setBounds(10, 10, 100, 30);
        lblNombre.setLayout(null);
        contenedor.add(lblNombre);
        
        txtNombre = new JTextField();
        txtNombre.setBounds(120, 10, 150, 30);
        contenedor.add(txtNombre);
        
        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(280, 10, 100, 30);
        contenedor.add(btnAgregar);
        
        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(280, 50, 100, 30);
        contenedor.add(btnEliminar);
        
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(280, 90, 100, 30);
        contenedor.add(btnLimpiar);
        
        lstNombres = new JList<String>(listaNombres);
        scroll = new JScrollPane(lstNombres);
        scroll.setBounds(10, 50, 250, 200);
        contenedor.add(scroll);


        //action listener
        btnAgregar.addActionListener(e -> {
            listaNombres.addElement(txtNombre.getText());
            txtNombre.setText("");
        });
        btnEliminar.addActionListener(e -> {
            listaNombres.removeElementAt(lstNombres.getSelectedIndex());
        });
        btnLimpiar.addActionListener(e -> {
            listaNombres.clear();
        });


       
    }


}
