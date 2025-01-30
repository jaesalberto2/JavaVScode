import javax.swing.*;
import java.awt.Color;
import helper_classes.*;

public class WindowBuilder {
  public static void main(String[] args) {

     JFrame frame = new JFrame("My Awesome Window");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(651, 352);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#1e1e1e"));

     JButton b1 = new JButton("1");
     b1.setBounds(52, 44, 106, 28);
     b1.setBackground(Color.decode("#2e2e2e"));
     b1.setForeground(Color.decode("#D9D9D9"));
     b1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     b1.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     b1.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(b1, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(b1);

     JButton b2 = new JButton("2");
     b2.setBounds(167, 44, 106, 28);
     b2.setBackground(Color.decode("#2e2e2e"));
     b2.setForeground(Color.decode("#D9D9D9"));
     b2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     b2.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     b2.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(b2, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(b2);

     JButton b3 = new JButton("3");
     b3.setBounds(282, 44, 106, 28);
     b3.setBackground(Color.decode("#2e2e2e"));
     b3.setForeground(Color.decode("#D9D9D9"));
     b3.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     b3.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     b3.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(b3, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(b3);

     JButton suma = new JButton("+");
     suma.setBounds(397, 44, 106, 28);
     suma.setBackground(Color.decode("#2e2e2e"));
     suma.setForeground(Color.decode("#D9D9D9"));
     suma.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     suma.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     suma.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(suma, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(suma);

     JButton b4 = new JButton("4");
     b4.setBounds(52, 86, 106, 28);
     b4.setBackground(Color.decode("#2e2e2e"));
     b4.setForeground(Color.decode("#D9D9D9"));
     b4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     b4.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     b4.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(b4, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(b4);

     JButton b5 = new JButton("5");
     b5.setBounds(167, 86, 106, 28);
     b5.setBackground(Color.decode("#2e2e2e"));
     b5.setForeground(Color.decode("#D9D9D9"));
     b5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     b5.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     b5.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(b5, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(b5);

     JButton b6 = new JButton("6");
     b6.setBounds(282, 86, 106, 28);
     b6.setBackground(Color.decode("#2e2e2e"));
     b6.setForeground(Color.decode("#D9D9D9"));
     b6.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     b6.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     b6.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(b6, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(b6);

     JButton resta = new JButton("-");
     resta.setBounds(397, 86, 106, 28);
     resta.setBackground(Color.decode("#2e2e2e"));
     resta.setForeground(Color.decode("#D9D9D9"));
     resta.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     resta.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     resta.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(resta, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(resta);

     JButton b9 = new JButton("9");
     b9.setBounds(282, 128, 106, 28);
     b9.setBackground(Color.decode("#2e2e2e"));
     b9.setForeground(Color.decode("#D9D9D9"));
     b9.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     b9.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     b9.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(b9, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(b9);

     JButton multiplicacion = new JButton("x");
     multiplicacion.setBounds(397, 128, 106, 28);
     multiplicacion.setBackground(Color.decode("#2e2e2e"));
     multiplicacion.setForeground(Color.decode("#D9D9D9"));
     multiplicacion.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     multiplicacion.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     multiplicacion.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(multiplicacion, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(multiplicacion);

     JTextField element11 = new JTextField("");
     element11.setBounds(52, 170, 106, 21);
     element11.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element11.setBackground(Color.decode("#B2B2B2"));
     element11.setForeground(Color.decode("#656565"));
     element11.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
     OnFocusEventHelper.setOnFocusText(element11, "Your Input!", Color.decode("#353535"),   Color.decode("#656565"));
     panel.add(element11);

     JLabel element12 = new JLabel("Your Text");
     element12.setBounds(52, 204, 106, 17);
     element12.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element12.setForeground(Color.decode("#D9D9D9"));
     panel.add(element12);

     JButton b8 = new JButton("8");
     b8.setBounds(167, 128, 106, 28);
     b8.setBackground(Color.decode("#2e2e2e"));
     b8.setForeground(Color.decode("#D9D9D9"));
     b8.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     b8.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     b8.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(b8, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(b8);

     JButton b7 = new JButton("7");
     b7.setBounds(52, 128, 106, 28);
     b7.setBackground(Color.decode("#2e2e2e"));
     b7.setForeground(Color.decode("#D9D9D9"));
     b7.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     b7.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     b7.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(b7, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(b7);

     JButton division = new JButton("/");
     division.setBounds(282, 170, 106, 28);
     division.setBackground(Color.decode("#2e2e2e"));
     division.setForeground(Color.decode("#D9D9D9"));
     division.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     division.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     division.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(division, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(division);

     JButton igual = new JButton("=");
     igual.setBounds(397, 170, 106, 28);
     igual.setBackground(Color.decode("#2e2e2e"));
     igual.setForeground(Color.decode("#D9D9D9"));
     igual.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     igual.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     igual.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(igual, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(igual);

     JButton b0 = new JButton("0");
     b0.setBounds(167, 170, 106, 28);
     b0.setBackground(Color.decode("#2e2e2e"));
     b0.setForeground(Color.decode("#D9D9D9"));
     b0.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     b0.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     b0.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(b0, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(b0);

     frame.add(panel);
     frame.setVisible(true);

  }
}