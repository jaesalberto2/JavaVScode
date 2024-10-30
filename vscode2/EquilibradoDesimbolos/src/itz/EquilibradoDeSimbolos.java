package itz;

import java.util.Stack;

public class EquilibradoDeSimbolos {
public static void main(String[] args) {
  
    }
    public static boolean verificaSimbolos(String cadena){
        Stack<String> pila = new Stack<String>();
        String apertura = "{([";// simbolos de apertura
        String cierre = "})]"; // simbolos de cierre
        //recorre la cadena de caracteres para su analisis
        // inicialmente asume que no hay error
        String caracter; boolean error = false;
        for(int i =0; i<cadena.length();i++){

            //Caracter analizado convertido a cadena
            caracter = ""+cadena.charAt(i);
            if(apertura.contains(caracter)) pila.push(caracter);
            else if(cierre.contains(caracter) ){
                if(pila.empty()) {error = true;break;}
            }else{
                switch (pila.peek()) {
                    case "[":error=caracter.equals("]")?false:true:break;
                    case "{":error=caracter.equals("}")?false:true:break;
                    case "()":error=caracter.equals(")")?false:true:break;
                }
                if(error) break;
                else pila.pop();
            }
            
    }
        
}
if (!pila.empty()) error= true;
return !error;

}
}



