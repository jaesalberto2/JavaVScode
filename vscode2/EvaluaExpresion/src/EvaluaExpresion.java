//El programa lee una expresion como cadena, la convierte a postfija y la evalua
//Hace uso de pilas
import java.util.*;
public class EvaluaExpresion {
	public static void main(String[] args) {
		ArrayList<String> entrada=new ArrayList<String>();
		Scanner leer=new Scanner(System.in);
		String expresion;
		System.out.print("Teclea la expresion de entrada:");
		expresion=leer.nextLine();
		//Eliminar espacios en blanco y tabulaciones
		expresion=expresion.replaceAll("\\s","");
		System.out.println("Infija:"+expresion);
		if (verificaParentesis(expresion)){
			StringTokenizer analiza=new StringTokenizer(expresion,"()^*/+-",true);
			while (analiza.hasMoreElements()){
				entrada.add(analiza.nextToken());
			}
			ArrayList<String> salida=postfija(entrada); //cadena en postfija
			System.out.println("En postfija:");
			for (String elemento:salida)
				System.out.print(elemento+",");
			System.out.println();
			//El primer parametro es la cadena en postfija y el segundo parametro es el valor de x
			//Si la expresion esta en funcion de x se le manda un valor en este caso 10
			System.out.println("El resultado es:"+evaluar(salida,10)); 
		} else System.out.println("Faltan parentesis en Expresion");
	}
	//Evalua la expresion y obtiene un resultado
	public static double evaluar(ArrayList<String> postfija,double x){
		double resultado=0.0;String operadores="()^*/+-";
		Stack<Double> pilaOperandos = new Stack<Double>(); 
		double op1,op2,r;
		for (String elemento:postfija){
			if (operadores.contains(elemento)) { //Se trata de un operador
				//Realiza la operacion con los operandos del tope
				op2=pilaOperandos.pop();
				op1=pilaOperandos.pop();r=0.0;
				switch (elemento){
				case "^":r=Math.pow(op1,op2);break;
				case "*":r=op1*op2;break;
				case "/":r=op1/op2;break;
				case "+":r=op1+op2;break;
				case "-":r=op1-op2;break;
				}
				pilaOperandos.push(r);
			} else if (elemento.equalsIgnoreCase("X")) pilaOperandos.push(x);
					  else pilaOperandos.push(Double.parseDouble(elemento));
		}
		if (!pilaOperandos.isEmpty()) resultado=pilaOperandos.pop();
		return resultado;
	}
	//Verifica que los parentesis esten equilibrados
	public static boolean verificaParentesis(String cadena)  {
		Stack<String> pila = new Stack<String>(); //Crea una instancia de la clase pila generica
		int i = 0;
		while (i<cadena.length()) {  // Recorremos la expresión carácter a carácter
			// Si el paréntesis es de apertura apilamos siempre
			if(cadena.charAt(i)=='(') {pila.push("(");}
			// Si el paréntesis es de cierre actuamos según el caso
			else if  (cadena.charAt(i)==')') {  
				if (!pila.empty()){ pila.pop(); } // Si la pila no está vacía desapilamos
				// La pila no puede empezar con un cierre, apilamos y salimos
				else { pila.push(")"); break; } 
			}
			i++;
		}		if(pila.empty()){ return true; } else { return false; }
	}
	//Convierte la expresion en cadena a postfija
	public static ArrayList<String> postfija(ArrayList<String> entrada){
		boolean esoperador=false;
		ArrayList<String> salida=new ArrayList<String>();
		String operadores="()^*/+-";
		Stack<String> pilaOperadores=new Stack<String>();
		for (String elemento:entrada){
			if (operadores.contains(elemento)) { //Se trata de un operador
				switch (elemento) {
				case "(": pilaOperadores.push(elemento);esoperador=false;break;
				case ")":String operador; 
				while (!pilaOperadores.isEmpty()&&!(operador=pilaOperadores.pop()).equals("(")){
					salida.add(operador);
				}
				esoperador=false;
				break;	        		
				default: //Es un operador: ^*/+-
					if (!esoperador){
						while (!pilaOperadores.isEmpty()&&prioridad(pilaOperadores.peek())>=prioridad(elemento)){
							operador=pilaOperadores.pop();
							salida.add(operador);
						}
						pilaOperadores.push(elemento);esoperador=true;
					} else {System.out.println("Error en expresion");System.exit(1);}
					break;
				}
			} else {salida.add(elemento); esoperador=false;};//Se trata de un Operando
		}
		//Saca el resto de operadores de la pila
		while (!pilaOperadores.isEmpty())
			salida.add(pilaOperadores.pop());
		return salida;
	}
	public static int prioridad(String operador){
		int p=0;
		switch (operador){
		case "^":p=100;break;
		case "*":p=50;break;
		case "/":p=50;break;
		case "+":p=10;break;
		case "-":p=10;break;
		case "(":p=5;break;
		}
		return p;
	}
}

