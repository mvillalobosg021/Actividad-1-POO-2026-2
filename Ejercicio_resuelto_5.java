
package ejercicio_resuelto_5;
import java.util.Scanner;
public class Ejercicio_resuelto_5 {

   
    public static void main(String[] args) {
        
       double suma, x, y; // se definieron las variables
       Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el valor de x: ");
        x=scanner.nextDouble();
        
        System.out.println("ingrese el valor de suma: ");
        suma=scanner.nextDouble();
        suma= Operaciones.operacion1(suma,x);
        
        
       System.out.println("ingrese el valor de y: ");
       y=scanner.nextDouble() ;
      // double y =40;
       x= Operaciones.operacion2(x, y);
       suma= Operaciones.operacion3(suma, x, y);
       System.out.println("El valor de la suma es : "+ suma);
    }
    
}
