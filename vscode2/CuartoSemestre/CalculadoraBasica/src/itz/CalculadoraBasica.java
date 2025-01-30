package itz;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;
import javax.swing.JTextField;



public class CalculadoraBasica extends JFrame implements ActionListener {

    private int num1;
    private int num2;
    private int res;

    //constructor
    public CalculadoraBasica() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setTitle("Calculadora Basica");
        frame.setLayout(new GridLayout(4, 4));
        frame.setVisible(true);
        this.setLayout(new FlowLayout());
        JTextField txtValor1 = new JTextField(20); 
        JTextField txtValor2 = new JTextField(20);
        JTextField txtResultado = new JTextField(20);
        JLabel lblValor1 = new JLabel("Valor 1: ");
        JLabel lblValor2 = new JLabel("Valor 2: ");
        JLabel lblResultado = new JLabel("Resultado: ");
                //pantalla


        JTextField pantalla = new JTextField(20);
        pantalla.setEditable(false);
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setFont(new Font("Arial", Font.BOLD, 20));
        pantalla.setBackground(Color.WHITE);
        pantalla.setForeground(Color.BLACK);

        

        //botones
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");
        JButton bSuma = new JButton("+");
        JButton bResta = new JButton("-");
        JButton bMultiplicacion = new JButton("*");
        JButton bDivision = new JButton("/");
        JButton bIgual = new JButton("=");
        JButton bBorrar = new JButton("C");

        //añadir botones
        
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(bSuma);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(bResta);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(bMultiplicacion);
        frame.add(b0);
        frame.add(bIgual);
        frame.add(bBorrar);
        frame.add(bDivision);

        frame.add(lblValor1);
        frame.add(txtValor1);
        frame.add(lblValor2);

        frame.add(txtValor2);
        frame.add(lblResultado);
        frame.add(txtResultado);
        frame.add(pantalla);
   




        //añadir action listener
    
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bSuma.addActionListener(this);
        bResta.addActionListener(this);
        bMultiplicacion.addActionListener(this);
        bDivision.addActionListener(this);
        bIgual.addActionListener(this);
        bBorrar.addActionListener(this);



        //mostrar frame
        frame.setVisible(true);

        //recibir datos
        num1 = Integer.parseInt(valor1);
        num2 = Integer.parseInt(valor2);
        res = Integer.parseInt(resultado);
        //convertir a entero
        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int res = Integer.parseInt(resultado);

        //operaciones
        bSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                res = num1 + num2;
                txtResultado.setText(String.valueOf(res));
            }
        });

                
        
    }


    //action performed
@Override
public void actionPerformed(ActionEvent e) {
    
}

    public static void main(String[] args) {
        new CalculadoraBasica();
    }



}

