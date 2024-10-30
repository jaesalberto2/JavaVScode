import javax.swing.JOptionPane;

public class aplicacion {
    public static void main(String[] args) throws Exception {
        TADpersona persona = new TADpersona("Facundo", 20, 1999);
        JOptionPane.showMessageDialog(null, persona.toString(), "Persona", JOptionPane.INFORMATION_MESSAGE); 
        JOptionPane.showMessageDialog(null, persona.getedad(), "Edad", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, persona.getNombre(), "Nombre", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, persona.getNacimiento(), "Nacimiento", JOptionPane.INFORMATION_MESSAGE);


        persona.setEdad(30);
        persona.setNombre("Alberto");
        persona.setNacimiento(1993);

        JOptionPane.showMessageDialog(null, persona.toString(), "Persona modificada", JOptionPane.INFORMATION_MESSAGE); 
        JOptionPane.showMessageDialog(null, persona.getedad(), "Edad modificada", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, persona.getNombre(), "Nombre modificada", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, persona.getNacimiento(), "Nacimiento modificada", JOptionPane.INFORMATION_MESSAGE);

    
    }   
}
