package itz;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  while (true) {
	            
	            String opcion = JOptionPane.showInputDialog(null, "Seleccione una operación:\n"
	                    + "1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Simplificar\n6. Salir");

	            if (opcion.equals("6")) {
	                break;
	            }

	            Fraccion f1 = obtenerFraccion("Ingrese el numerador de la primera fracción:");
	            Fraccion f2 = obtenerFraccion("Ingrese el numerador de la segunda fracción:");

	            Fraccion resultado = null;
	            switch (opcion) {
	                case "1":
	                    resultado = f1.sumar(f2);
	                    break;
	                case "2":
	                    resultado = f1.restar(f2);
	                    break;
	                case "3":
	                    resultado = f1.multiplicar(f2);
	                    break;
	                case "4":
	                    try {
	                        resultado = f1.dividir(f2);
	                    } catch (ArithmeticException e) {
	                        JOptionPane.showMessageDialog(null, "Error: División por cero");
	                    }
	                    break;
	                case "5":
	                    // Simplificar
	                    Fraccion fraccionASimplificar = obtenerFraccion("Ingrese la fracción a simplificar:");
	                    fraccionASimplificar.simplificar();
	                    resultado = fraccionASimplificar;
	                    break;
	            }

	            if (resultado != null) {
	                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
	            }
	        }
	    }

	    private static Fraccion obtenerFraccion(String mensaje) {
	        try {
	            int numerador = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
	            int denominador = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el denominador:"));
	            if (denominador == 0) {
	                throw new ArithmeticException("Denominador no puede ser cero");
	            }
	            return new Fraccion(numerador, denominador);
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(null, "Error!!! Ingrese un número entero válido");
	            return obtenerFraccion(mensaje);
	        }

    }
}

