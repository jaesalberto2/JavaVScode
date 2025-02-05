import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class color {
    public static void main(String[] args) {
        MarcoBotones marco = new MarcoBotones();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
        
        }
    }

     class MarcoBotones extends JFrame {
        public MarcoBotones() {
            setTitle("Botones y eventos");
            setBounds(700, 300, 500, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            LaminaBotones lamina = new LaminaBotones();
            add(lamina);
            setVisible(true);
        }



}

class LaminaBotones extends JPanel {
    JButton botonAzul = new JButton("Azul");
    public LaminaBotones() {
        
        add(botonAzul);
        botonAzul.addActionListener(new ColorFondo(Color.blue));
        JButton botonAmarillo = new JButton("Amarillo");
        add(botonAmarillo);
        botonAmarillo.addActionListener(new ColorFondo(Color.yellow));
        JButton botonRojo = new JButton("Rojo");
        add(botonRojo);
        botonRojo.addActionListener(new ColorFondo(Color.red));
        

    }

    private class ColorFondo implements ActionListener {
        public ColorFondo(Color c) {
            colorDeFondo = c;
        }

        public void actionPerformed(ActionEvent e) {
            setBackground(colorDeFondo);
        }

        private Color colorDeFondo;
    }
}
