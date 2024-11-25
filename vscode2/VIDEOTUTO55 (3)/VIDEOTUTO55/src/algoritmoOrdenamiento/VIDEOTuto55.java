package algoritmoOrdenamiento;
public class VIDEOTuto55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlgoritmosDeOrdenamiento ordenar=new AlgoritmosDeOrdenamiento();
		int vector1[]= {5,6,3,44,22,1};
		int vector2[]= {55,4,43,44,2,10,4567,638,3,0,-5,-9};
		int vector3[]= {5,2,1,8,3,9,7};
		//System.out.println("Arreglo original");
		//ordenar.mostrarArreglo(vector3);
		//System.out.println("Arreglo ordenado con QUICK");
		//ordenar.Quick(vector3, 0, vector3.length-1);
		//System.out.println("Arreglo Original");
		//ordenar.mostrarArreglo(vector3);
		//ordenar.shell(vector3);
		//System.out.println("Arreglo Original");
		//ordenar.mostrarArreglo(vector2);
		//ordenar.radix(vector2);
		//System.out.println("Arreglo vector1 Original");
		//ordenar.mostrarArreglo(vector1);
		//System.out.println("Arreglo vector2 Original");
		//ordenar.mostrarArreglo(vector2);
		//ordenar.burbuja1(vector1);
		//ordenar.burbuja1(vector2);
		//ordenar.intercalacion(vector1, vector2);
		//System.out.println("Arreglo vector2 Original");
		//ordenar.mostrarArreglo(vector2);
		//System.out.println("Arreglo vector2 Ordenado por Mezcla Directa");
		//vector2=ordenar.mezclaDirecta(vector2);
		//ordenar.mostrarArreglo(vector2);
		System.out.println("Arreglo vector2 Original");
		ordenar.mostrarArreglo(vector2);
		System.out.println("Arreglo vector2 Ordenado por Mezcla Natural");
		ordenar.mezclaNatural(vector2);
		ordenar.mostrarArreglo(vector2);

		


	}

	
	
	
	
	
	
}
