import javax.swing.JOptionPane;

public class Ingresa {
    String name,nacionalidad,sexo;
    int edad;
    String escuela;
    double promedio;
    String correo;
    String grado;
    double salario;
    String direccion;
    int telefono;
    String puesto, departamento;
  
    public void ingresaEstudiante(){

        name = JOptionPane.showInputDialog(null,""
		+ "Ingresa Nombre","Nombre del estudiante",JOptionPane.INFORMATION_MESSAGE);
        nacionalidad = JOptionPane.showInputDialog(null,""
		+ "Ingresa Nacionalidad","Nacionalidad del estudiante",JOptionPane.INFORMATION_MESSAGE);
        sexo = JOptionPane.showInputDialog(null,""
		+ "Ingresa Sexo","Sexo del estudiante",JOptionPane.INFORMATION_MESSAGE);
        edad = Integer.parseInt(JOptionPane.showInputDialog(null,""
		+ "Ingresa Edad","Edad del estudiante",JOptionPane.INFORMATION_MESSAGE));

        escuela=JOptionPane.showInputDialog(null,""
		+ "Ingresa Escuela","Escuela del estudiante",JOptionPane.INFORMATION_MESSAGE);
        promedio =Double.parseDouble(		JOptionPane.showInputDialog(null,""
		+ "Ingresa Promedio","Promedio del Estudiante",JOptionPane.INFORMATION_MESSAGE));
        correo = JOptionPane.showInputDialog(null,""
		+ "Ingresa Correo","Correo del estudiante",JOptionPane.INFORMATION_MESSAGE);
        Persona e = new Estudiante(name,nacionalidad,sexo,  edad, escuela,promedio,
         correo);
   JOptionPane.showMessageDialog(null, e.toString(), "Informacion del Estudiante", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
