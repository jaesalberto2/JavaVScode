package ExamenOOPFinal;

import javax.swing.JOptionPane;

public class IngresaComp {
    String namechofer;
    String apellido;
    String email;
    int edad;
    String nameEmpresa;
    String rfc;
    String www;
    String matricula;
    String modelo;
    FicheroComp f = new FicheroComp();
    public void ingresaVehiculo()
    {
        namechofer=JOptionPane.showInputDialog(null, "Ingresa Nombre : ", "Nombre del Chofer",
         JOptionPane.INFORMATION_MESSAGE);
        apellido=JOptionPane.showInputDialog(null, "Ingresa Apellido : ", "Apellido del Chofer",
         JOptionPane.INFORMATION_MESSAGE);
        edad=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Edad : ", "Edad del Chofer",
         JOptionPane.INFORMATION_MESSAGE));
        email=JOptionPane.showInputDialog(null, "Ingresa Email : ", "Email del Chofer",
         JOptionPane.INFORMATION_MESSAGE);
        matricula=JOptionPane.showInputDialog(null, "Ingresa Matricula : ", "Matricula del Vehiculo",
         JOptionPane.INFORMATION_MESSAGE);
        modelo=JOptionPane.showInputDialog(null, "Ingresa Modelo : ", "Modelo del Vehiculo",
         JOptionPane.INFORMATION_MESSAGE);
        nameEmpresa=JOptionPane.showInputDialog(null, "Ingresa Nombre : ", "Nombre de la Empresa",
         JOptionPane.INFORMATION_MESSAGE);
        rfc=JOptionPane.showInputDialog(null, "Ingresa Rfc : ", "Rfc de la Empresa",
         JOptionPane.INFORMATION_MESSAGE);
        www=JOptionPane.showInputDialog(null, "Ingresa WWW : ", "Www de la Empresa",
         JOptionPane.INFORMATION_MESSAGE);
        Chofer c = new Chofer(namechofer, apellido, email, edad);
        Empresa e = new Empresa(nameEmpresa, rfc, www);
        Vehiculo v = new Vehiculo(c, e, matricula, modelo);
        f.guarda(v);
    }

}