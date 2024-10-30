public class Alfabeto {
    public static void main(String[] args) {

        System.out.println("Alfabeto escrito de manera iterativa: ");
        escribeAlfabetoInter();
        System.out.println();
        System.out.println("Alfabeto escrito de manera recursiva:");
        escribeAlfabetoRec('Z');
        
        
    }

    private static void escribeAlfabetoRec(char c) {
        if (c>'A') metodoB(c);
        System.out.print(c+" ");
    }

    private static void metodoB(char c) {
        escribeAlfabetoRec(--c);
    }



    private static void escribeAlfabetoInter() {
       for (char c='A';c<='Z';c++)
       System.out.print(c+" ");
    }

}
