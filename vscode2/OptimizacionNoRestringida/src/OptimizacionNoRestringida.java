import java.util.Scanner;
import java.util.function.Function;

public class OptimizacionNoRestringida {

    // Método de Newton para encontrar el mínimo
    public static double newtonMethod(Function<Double, Double> f, Function<Double, Double> df, Function<Double, Double> ddf, double x0, double tol, int maxIter) {
        double x = x0;
        for (int i = 0; i < maxIter; i++) {
            double grad = df.apply(x);
            double hess = ddf.apply(x);
            if (Math.abs(grad) < tol) {
                System.out.println("Iteración " + (i+1) + ": x = " + x + ", f(x) = " + f.apply(x) + ", f'(x) = " + grad + ", f''(x) = " + hess);

                break;
            }
            System.out.println("Iteración " + (i+1) + ": x = " + x + ", f(x) = " + f.apply(x) + ", f'(x) = " + grad + ", f''(x) = " + hess);
            x = x - grad / hess;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir las funciones
        // Function<Double, Double> f = (x) -> x * x - 4 * x + 4; // Función objetivo
        // Function<Double, Double> df = (x) -> 2 * x - 4; // Derivada de la función
        // Function<Double, Double> ddf = (x) -> 2.0; // Segunda derivada de la función

        Function<Double, Double> f = (x) -> x * x * x - 4 * x + 4; // Función objetivo
        Function<Double, Double> df = (x) -> 3 * x * x - 4; // Derivada de la función
        Function<Double, Double> ddf = (x) -> 6 * x; // Segunda derivada de la función

        // Solicitar al usuario que ingrese el punto inicial, tolerancia y número máximo de iteraciones
        System.out.print("Ingrese el punto inicial (x0): ");
        double x0 = scanner.nextDouble();

        System.out.print("Ingrese la tolerancia (tol): ");
        double tol = scanner.nextDouble();

        System.out.print("Ingrese el número máximo de iteraciones (maxIter): ");
        int maxIter = scanner.nextInt();

        // Encontrar el mínimo usando el método de Newton
        double minimo = newtonMethod(f, df, ddf, x0, tol, maxIter);
        System.out.println("El mínimo de la función es: " + f.apply(minimo) + " en x = " + minimo);
    }
}
