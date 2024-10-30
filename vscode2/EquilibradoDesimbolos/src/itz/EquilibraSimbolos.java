package itz;
import java.util.Scanner;
import java.util.Stack;
public class EquilibraSimbolos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto: ");
        String cadentrada = leer.nextLine();
        if (verificaSimbolos(cadentrada)) {
            System.out.println("La cadena de texto tiene los simbolos balanceados");
        } else {
            System.out.println("La cadena de texto no tiene los simbolos balanceados");
            
        }
        
        
    }
    public static boolean verificaSimbolos(String cadena) {
        Stack<Character> pila = new Stack<Character>();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(' || cadena.charAt(i) == '[' || cadena.charAt(i) == '{') {
                pila.push(cadena.charAt(i));
            } else if (cadena.charAt(i) == ')' || cadena.charAt(i) == ']' || cadena.charAt(i) == '}') {
                if (pila.isEmpty()) {
                    return false;
                } else if (cadena.charAt(i) == ')' && pila.peek() == '(') {
                    pila.pop();
                } else if (cadena.charAt(i) == ']' && pila.peek() == '[') {
                    pila.pop();
                } else if (cadena.charAt(i) == '}' && pila.peek() == '{') {
                    pila.pop();
                } else {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }


}
