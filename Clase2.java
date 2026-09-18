package clase2;

import java.util.Scanner;
class edades {
    
    public static double calcular_edalber(double edjuan){
        return 2* edjuan/3;
    } 
    
    public static double calcular_edana(double edjuan){
        return 4* edjuan/3;
    }
    
    public static double calcular_edmama(double edjuan, double edalber, double edana){
        return edalber+edjuan+edana;
    } 
  
}
 
public class Clase2 {

    public static void main(String[] args) {
        double edjuan, edalber, edana, edmama;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("how old is Juan");
        edjuan =scanner.nextInt();
        
        
        
        //edjuan=9;
        edalber= edades.calcular_edalber(edjuan);
        edana= edades.calcular_edana(edjuan);
        edmama= edades.calcular_edmama(edjuan,edalber,edana);
        System.out.println("la edad de la mama es:"+ edmama);
        System.out.println("la edad de juan es:"+ edjuan);
        System.out.println("la edad de alber es:"+ edalber);
        System.out.println("la edad de ana es:"+ edana);
 
    }
    
}
