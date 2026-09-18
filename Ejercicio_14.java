package ejercicio_14;
import java.util.Scanner;
public class Ejercicio_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero;
        double cuadrado, cubo;

        System.out.print("Ingrese un numero: ");
        numero = scanner.nextDouble();

        cuadrado = Calculos.calcular_cuadrado(numero);

        cubo = Calculos.calcular_cubo(numero);

        System.out.println("El cuadrado del numero es: " + cuadrado);
        System.out.println("El cubo del numero es: " + cubo);

        scanner.close();              
        
    }
    
}
