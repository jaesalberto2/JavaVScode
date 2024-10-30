package itz;

import java.util.Scanner;

public class PilaComida {

    Scanner teclado = new Scanner(System.in);
    int tamano;
    int tope = -1;
    private String pilaComida[];

    public PilaComida(int tamano) {
        this.tamano = tamano;
        pilaComida = new String[tamano];
     
    }
   

    //metodo para ingresar a la pila

        public void push(){
        
            if(tope == pilaComida.length-1){
                System.out.println("La pila esta llena");
            }else{
                tope++;
                System.out.println("Ingrese el Alimento a la pila");
                pilaComida[tope] = teclado.nextLine();
                System.out.println("Alimento ingresado");
            }
        }
        
        public void pop(){
            if(tope == -1){
                System.out.println("La pila esta vacia");
            }else{
                System.out.println("Alimento eliminado: "+pilaComida[tope]);
                pilaComida[tope] = "";
                tope--;
            }
        }
        public void mostrarPila(){
   
            for (int i = 0; i < pilaComida.length; i++) {
                System.out.println("Alimento: "+pilaComida[i]);
            }
        }

    

}
