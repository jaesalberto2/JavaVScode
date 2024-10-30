package tadVector;

import java.util.Arrays;

public class TADVector {
//Atributos
	private Integer[]valores;
	//Metodos
	public TADVector(int tamaño) {//Constructor
		valores=new Integer[tamaño];
	}
	public TADVector Asignar(TADVector v, int i, int elemento) {
		if (i<valores.length) v.valores[i]=elemento;
		return v;
	}
	public boolean Existe(TADVector v, int i) {
		if(v.valores[i]!=null) return true;
		return false;
	}
	public Integer Valor(TADVector v, int i) {
		return v.valores[i];
	}
	@Override
	public String toString() {
		return Arrays.toString(valores) + "\n";
	}
    


}
