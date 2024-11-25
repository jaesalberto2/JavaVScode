package algoritmoOrdenamiento;

public class AlgoritmosDeOrdenamiento {
	//Metodo Quick
	public void Quick(int [] arreglo, int primero, int ultimo) {
		int i,j,pivote,auxiliar;
		i=primero;
		j=ultimo;
		pivote=arreglo[(primero+ultimo)/2];
		System.out.println("El pivote es " + pivote);
		do {
			while(arreglo[i]<pivote) {
				i++;
			}
			while(arreglo[j]>pivote) {
				j--;
			}
			//Aqui hacemos el intercambio
			if(i<=j) {
				auxiliar=arreglo[i];
				arreglo[i]=arreglo[j];
				arreglo[j]=auxiliar;
				i++;
				j--;
			}
		}while(i<=j);
		if(primero<j) {
			Quick(arreglo, primero, j);
		}
		if(i<ultimo) {
			Quick(arreglo, i, ultimo);
		}
		mostrarArreglo(arreglo);
	}
	//Metodo burbuja version1
		public void burbuja1(int [] arreglo) {
		int pasadas = 0;
			for(int i = 0; i<arreglo.length; i++){
				for(int j = i+1;j<arreglo.length; j++) {
					if(arreglo[i]>arreglo[j]) {
						int temporal = arreglo[i];
						arreglo[i]=arreglo[j];
						arreglo[j]=temporal;
					}
					pasadas++;
				}
			}
			System.out.println("Termino en "+pasadas+" Pasadas");
		}
		//Metodo
	//Metodo Shell
	public void shell(int [] arreglo) {
		int salto, i,j,k, auxiliar;
		salto=arreglo.length/2;
		while(salto>0) {
			for(i=salto; i<arreglo.length; i++) {
				j=i-salto;
				while(j>=0) {
					k=j+salto;
					if(arreglo[j]<=arreglo[k]) {
						j=-1;
					}else {
						auxiliar=arreglo[j];
						arreglo[j]=arreglo[k];
						arreglo[k]=auxiliar;
						j-=salto;  //j=j-salto
					}
				}
			}
			salto=salto/2;
		}
		System.out.println("Arreglo ordenado con SHELL");
		mostrarArreglo(arreglo);
	}
	//Metodo Radix
	public void radix(int[] arreglo) {
		int x,i,j;
		for(x=Integer.SIZE-1; x>=0; x--) {
			int auxiliar[]=new int[arreglo.length];
			j=0;
			for(i=0; i<arreglo.length; i++) {
				boolean mover=arreglo[i]<<x>=0;
				if(x==0 ? !mover:mover) {
					auxiliar[j]=arreglo[i];
					j++;
				}else {
					arreglo[i-j]=arreglo[i];
				}
			}
			for(i=j; i<auxiliar.length; i++){
				auxiliar[i]=arreglo[i-j];
			}
			arreglo=auxiliar;
		}
		System.out.println("El arreglo ordenado con RADIX es:");
		mostrarArreglo(arreglo);
	}
	//Metodo Intercalacion
	public void intercalacion(int[] arregloA, int []arregloB) {
		int i,j,k;
		int arregloC[] = new int[arregloA.length + arregloB.length];
		//Repetir mientras los arreglos A y B tengan elementos que comparar
		for(i=j=k=0; i<arregloA.length && j<arregloB.length; k++) {
			if(arregloA[i]<arregloB[j]) {
				arregloC[k]=arregloA[i];
				i++;
			}else {
				arregloC[k]=arregloB[j];
				j++;
			}
		}
		//Para añadir a arreglo C los elementos del arregloA sobrantes en caso de haberlo
		for(;i<arregloA.length; i++, k++) {
			arregloC[k]=arregloA[i];
		}
		//Para añadir a arreglo C los elementos del arregloB sobrantes en caso de haberlo
		for(;j<arregloB.length; j++, k++) {
			arregloC[k]=arregloB[j];
	}
		System.out.println("Arreglos ordenados por INTERCALACION");
		mostrarArreglo(arregloC);
	}
	//Metodo mezclaDirecta
	public int[] mezclaDirecta(int [] arreglo) {
		int i,j,k;
		if(arreglo.length>1) {
			int nElementosIzq=arreglo.length/2;
			int nElementosDer=arreglo.length-nElementosIzq;
			int arregloIzq[]=new int [nElementosIzq];
			int arregloDer[]=new int [nElementosDer];
			//Copiando los elementos de parte primera al arregloIzq
			for(i=0; i<nElementosIzq; i++) {
				arregloIzq[i]=arreglo[i];
			}
			//Copiando los elementos de parte segunda al arregloDer
			for(i=nElementosIzq; i<nElementosIzq+nElementosDer; i++) {
				arregloDer[i-nElementosIzq]=arreglo[i];
			}
			//Recursividad
			arregloIzq=mezclaDirecta(arregloIzq);
			arregloDer=mezclaDirecta(arregloDer);
			i=0;
			j=0;
			k=0;
			while(arregloIzq.length!=j && arregloDer.length !=k) {
				if(arregloIzq[j]<arregloDer[k]) {
					arreglo[i]=arregloIzq[j];
					i++;
					j++;
				}else {
					arreglo[i]=arregloDer[k];
					i++;
					k++;
				}
			}
			//Arreglo Fiinal
			while(arregloIzq.length!=j) {
				arreglo[i]=arregloIzq[j];
				i++;
				j++;
			}
			while(arregloDer.length!=k) {
				arreglo[i]=arregloDer[k];
				i++;
				k++;
			}
		}//FIn del if
		return arreglo;
	}
	//Metodo mezcla Natural
	public void mezclaNatural(int arreglo[]) {
		int izquierda=0, izq=0, derecha=arreglo.length-1, der=derecha;
		boolean ordenado=false;
		do {
			ordenado=true;
			izquierda=0;
			while(izquierda<derecha) {
				izq=izquierda;
				while(izq<derecha && arreglo[izq]<=arreglo[izq+1]) {
					izq++;
				}
				der=izq+1;
				while(der==derecha-1 || der<derecha && arreglo[der]<=arreglo[der+1]) {
					der++;
				}
				if(der<=derecha) {
					mezclaDirecta2(arreglo);
					ordenado=false;
				}
				izquierda=izq;
			}
		}while(!ordenado);
	}
	//Metodo mezcla Directa 2
		public void mezclaDirecta2(int [] arreglo) {
			int i,j,k;
			if(arreglo.length>1) {
				int nElementosIzq=arreglo.length/2;
				int nElementosDer=arreglo.length-nElementosIzq;
				int arregloIzq[]=new int [nElementosIzq];
				int arregloDer[]=new int [nElementosDer];
				//Copiando los elementos de parte primera al arregloIzq
				for(i=0; i<nElementosIzq; i++) {
					arregloIzq[i]=arreglo[i];
				}
				//Copiando los elementos de parte segunda al arregloDer
				for(i=nElementosIzq; i<nElementosIzq+nElementosDer; i++) {
					arregloDer[i-nElementosIzq]=arreglo[i];
				}
				//Recursividad
				arregloIzq=mezclaDirecta(arregloIzq);
				arregloDer=mezclaDirecta(arregloDer);
				i=0;
				j=0;
				k=0;
				while(arregloIzq.length!=j && arregloDer.length !=k) {
					if(arregloIzq[j]<arregloDer[k]) {
						arreglo[i]=arregloIzq[j];
						i++;
						j++;
					}else {
						arreglo[i]=arregloDer[k];
						i++;
						k++;
					}
				}
				//Arreglo Fiinal
				while(arregloIzq.length!=j) {
					arreglo[i]=arregloIzq[j];
					i++;
					j++;
				}
				while(arregloDer.length!=k) {
					arreglo[i]=arregloDer[k];
					i++;
					k++;
				}
			}//FIn del if
		}
	//Mostrar los datos del vector
		public void mostrarArreglo(int [] arreglo) {
			int k;
			for(k=0; k<arreglo.length; k++) {
				System.out.print("["+arreglo[k]+"]");
			}
			System.out.println();
		}
	}

