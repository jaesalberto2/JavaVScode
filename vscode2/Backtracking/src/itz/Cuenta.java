package itz;

public class Cuenta {

    public static void main(String[] args) {

        String cadena = "Hola amigo que tal";
        int indice = 0;

        System.out.println("Hay " + cuentaCaracteresRec(cadena, indice) + " caracteres");

    }

    public static int cuentaCaracteresRec(String cadena, int indice) {
        try {
            cadena.charAt(indice);
            return 1 + cuentaCaracteresRec(cadena, indice + 1);
        } catch (IndexOutOfBoundsException ex) {
            return 0;
        }
    }

}