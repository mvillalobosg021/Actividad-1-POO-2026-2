
package ejercicio_17;
import java.util.Scanner;
public class Ejercicio_17 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        double radio;
        double area, longitud;

        System.out.print("Ingrese el radio del circulo: ");
        radio = scanner.nextDouble();

        area = Calculos.calcular_area(radio);

        longitud = Calculos.calcular_circunferencia(radio);

        System.out.println("El area del circulo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitud);

        scanner.close();
    }
    
}
