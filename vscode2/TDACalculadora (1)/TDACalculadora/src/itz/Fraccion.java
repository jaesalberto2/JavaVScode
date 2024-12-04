package itz;

public class Fraccion {
	private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    public void simplificar() {
        int mcd = mcd(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
    }

    // máximo común divisor
    private int mcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
	}

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

	public Fraccion sumar(Fraccion f2) {
		 int nuevoNumerador = numerador * f2.denominador + f2.numerador * denominador;
	        int nuevoDenominador = denominador * f2.denominador;
	        return new Fraccion(nuevoNumerador, nuevoDenominador);

	}

	public Fraccion restar(Fraccion f2) {
		  int nuevoNumerador = numerador * f2.denominador - f2.numerador * denominador;
	        int nuevoDenominador = denominador * f2.denominador;
	        return new Fraccion(nuevoNumerador, nuevoDenominador);

	}

	public Fraccion multiplicar(Fraccion otra) {
		 int nuevoNumerador = numerador * otra.numerador;
	        int nuevoDenominador = denominador * otra.denominador;
	        return new Fraccion(nuevoNumerador, nuevoDenominador);

	}

	public Fraccion dividir(Fraccion otra) {
		 if (otra.numerador == 0) {
	            throw new ArithmeticException("No se puede dividir por cero");
	        }
	        int nuevoNumerador = numerador * otra.denominador;
	        int nuevoDenominador = denominador * otra.numerador;
	        return new Fraccion(nuevoNumerador, nuevoDenominador);

	}

	

}
