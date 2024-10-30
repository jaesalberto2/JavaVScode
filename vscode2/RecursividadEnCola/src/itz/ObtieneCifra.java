package itz;

import java.util.Scanner;

public class ObtieneCifra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Teclea el numero: ");
        long numero = leer.nextLong();
        System.out.println("Tecleala posicion del digito que deseas : ");
        int posicion = leer.nextInt()
        System.out.println("El digito es(recursiva) "+CifraDerRec(numero,posicion));
        System.out.println("El digito es(recursiva) "+CifraDerIter(numero,posicion));

    }


    private static int CifraDerRec(long numero, int posicion) {
        if (p==1)return (int)(/10);
        else return (CifraDerRec(n/10,p-1));
    }

    private static int CifraDerIter(long numero, int p) {
        int dig;
        for(int i=1;i<p;i++)
        n=n/10;
        dig (int) n%10;
        return dig;

    }

}
