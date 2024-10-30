package itz;

public class Escalera {

public static void main(String[] args) {
    
    Escalera objEsc = new Escalera();
    objEsc.bajarEscalera(20);
}

//creando un metodo para bajar una escalera de manera recursiva

public void bajarEscalera(int escalones){

    if(escalones==0){
        //caso base, respuesta explicita
        System.out.println("has terminado de bajar la escalera");

    }else{
        //Dominio, (divicion del problema original(problema - 1))
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Bajando escalon "+escalones);
        //haciendo uso de la recursividad
        bajarEscalera(escalones-1); 
    }
}

}
