package itz;

public class Produccion {
    public static void main(String[] args) {
        
    
    double[][][] total;
    total= new double[5][12][4];
    generarAleatorios(total);


    System.out.println("total mensual de cada departamento"+
    "Durante el segundo año: ");
    totalMensual(total,1);
    System.out.printf("El total de produccion durante el pprimer año: %10.2f\n",totalProduccion(total,0));
    System.out.printf("El total de produccion del departamento 3"+
    "a lo largo del ultimo año : %10.2f\n",totalProduccion(total,2,3));
    

}

    private static void totalMensual(double[][][] total, int i) {
        double suma=0.0;
        for(int d=0;d<total.length;d++){
            suma=0.0;
            for(int m=0;m<total[d].length;m++)
                suma= suma+total[d][m][i];
                System.out.printf("El total del departamento %3d = %10.2f \n",d,suma);
        }
    }

    private static Object totalProduccion(double[][][] total, int dpto, int ayo) {
        double suma = 0.0;
        for(int m=0;m<total[dpto].length;m++)
            suma= suma+total[dpto][m][ayo];
        return suma;
    }

    private static Object totalProduccion(double[][][] total, int ayo) {
        double suma = 0.0;
        for(int d=0;d<total.length;d++)
            for(int m=0;m<total[d].length;m++)
            suma= suma+total[d][m][ayo];
        return suma;
    }
    public static void generarAleatorios(double[][][] total){
        for(int d=0;d<total.length;d++)
            for(int m=0;m<total[d].length;m++)
                for(int a=0;a<total[d][m].length;a++)
                    total[d][m][a]=Math.random()*10000;
    }

    


   

}
