package itz;
//para poder ordenar los objetos de una coleccion
//o lista es necesario implementar el metodo compareTo 
// de la interface comparable
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Articulos implements Comparable<Articulos> {

    //atributos
    private int codigo;
    private String descripcion;
    private double precio;
    //Constructor de codigo
    public Articulos(int codigo) {
        this.codigo = codigo;
    }
    //constructor vacio
    public Articulos() {
    }
    //metodo para pedir los datos con jdialog

    public void pedirDatos() throws Exception{
        try{
            JDialog datos = new JDialog();//creamos un dialogo
            datos.setTitle("Datos del articulo");//titulo
            datos.setModal(true);//para que no se pueda cerrar
            datos.setLayout(new FlowLayout());//para que se acomoden los elementos
            JLabel lblCodigo = new JLabel("Codigo:");//etiqueta
            JTextField txtCodigo = new JTextField(5);//campo de texto
            JLabel lblDes = new JLabel("Descripcion:");//etiqueta
            JTextField txtDes = new JTextField(50);//campo de texto
            JLabel lblPrecio = new JLabel("Precio:");//etiqueta
            JTextField txtPrecio = new JTextField(10);//campo de texto
            JButton btnAceptar = new JButton("Aceptar");//boton
            //Agregamos los elementos a la ventana
            datos.add(lblCodigo); datos.add(txtCodigo);
            datos.add(lblDes); datos.add(txtDes);
            datos.add(lblPrecio); datos.add(txtPrecio);
            //definir codigo al evento click del boton
            btnAceptar.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    //asignamos los valores a los atributos
                    codigo = Integer.parseInt(txtCodigo.getText());
                    descripcion = txtDes.getText();
                    precio = Double.parseDouble(txtPrecio.getText());
                    //cerramos la ventana
                    datos.dispose();
                }
            });
            datos.add(btnAceptar);//agregamos el boton
            datos.pack();//ajustamos el tamaño
            datos.setVisible(true);
        }catch(Exception e){
            throw new Exception("Error al pedir datos");

        }
    }
    //redefinir los metodos de la clase object
    //equals, toString, hashCode
    



    @Override
    public int compareTo(Articulos arg0) {
        // TODO Auto-generated method stub
        //el metodo regresa 0 si los objetos son iguales
        //regresa 1 si la primera es mayor que la segunda
        //regresa -1 si la primera es menor que la segunda
        if(this.codigo == arg0.codigo)
            return 0;
        else if(this.codigo > arg0.codigo)
            return 1;
        else
            return -1;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
        long temp;
        temp = Double.doubleToLongBits(precio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Articulos other = (Articulos) obj;
        if (codigo != other.codigo)
            return false;
        if (descripcion == null) {
            if (other.descripcion != null)
                return false;
        } else if (!descripcion.equals(other.descripcion))
            return false;
        if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Articulos [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + "]";
    }
   



    






}
