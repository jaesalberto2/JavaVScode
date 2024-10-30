package itz;

import java.util.Scanner;

public class Pila {
    Scanner teclado = new Scanner(System.in);
    int pilaNumerica[] = new int[5];
    int tope = -1;

    //metodo para ingresar a la pila

        public void push(){
            if(tope == 4){
                System.out.println("La pila esta llena");
            }else{
                tope++;
                System.out.println("Ingrese el elemento a la pila");
                pilaNumerica[tope] = teclado.nextInt();
                System.out.println("Elemento ingresado");
            }
        }
        
        public void pop(){
            if(tope == -1){
                System.out.println("La pila esta vacia");
            }else{
                System.out.println("Elemento eliminado: "+pilaNumerica[tope]);
                pilaNumerica[tope] = 0;
                tope--;
            }
        }
        public void mostrarPila(){
   
            for (int tope = 4; tope >= 0; tope--) {
                System.out.println("Elemento: "+pilaNumerica[tope]);
            }
        }

    

}
