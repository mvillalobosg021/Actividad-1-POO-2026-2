
package ejercicio_17;

public class Calculos {
    public static double calcular_area(double radio) {
        double area = Math.PI * Math.pow(radio,2);
        return area;
    }

    public static double calcular_circunferencia(double radio) {
        double longitud = 2 * Math.PI * radio;
        return longitud;
    }
    
}
