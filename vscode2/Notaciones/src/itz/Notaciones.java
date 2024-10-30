package itz;
import java.util.Stack;

public class Notaciones {



    
        // Método para verificar si un carácter es un operador
        private static boolean esOperador(char c) {
            return c == '+' || c == '-' || c == '*' || c == '/';
        }
    
        // Método para obtener la precedencia de un operador
        private static int precedencia(char c) {
            switch (c) {
                case '+':
                case '-':
                    return 1;
                case '*':
                case '/':
                    return 2;
                default:
                    return -1;
            }
        }
    
        // Método para convertir infija a postfija
        public static String infijaAPostfija(String expresion) {
            StringBuilder resultado = new StringBuilder();
            Stack<Character> pila = new Stack<>();
    
            for (int i = 0; i < expresion.length(); i++) {
                char c = expresion.charAt(i);
    
                // Si el carácter es un operando, añadirlo al resultado
                if (Character.isLetterOrDigit(c)) {
                    resultado.append(c);
                }
                // Si el carácter es '(', empujarlo a la pila
                else if (c == '(') {
                    pila.push(c);
                }
                // Si el carácter es ')', desapilar hasta encontrar '('
                else if (c == ')') {
                    while (!pila.isEmpty() && pila.peek() != '(') {
                        resultado.append(pila.pop());
                    }
                    pila.pop();
                }
                // Si el carácter es un operador
                else if (esOperador(c)) {
                    while (!pila.isEmpty() && precedencia(c) <= precedencia(pila.peek())) {
                        resultado.append(pila.pop());
                    }
                    pila.push(c);
                }
            }
    
            // Desapilar todos los operadores restantes
            while (!pila.isEmpty()) {
                resultado.append(pila.pop());
            }
    
            return resultado.toString();
        }
    
        public static void main(String[] args) {
            String expresionInfija = "A+B*(C-D)";
            System.out.println("Expresión Infija: " + expresionInfija);
            System.out.println("Expresión Postfija: " + infijaAPostfija(expresionInfija));
        }
    }
    