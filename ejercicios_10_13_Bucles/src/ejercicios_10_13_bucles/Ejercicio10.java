
package ejercicios_10_13_bucles;
import java.util.Scanner;
/**
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limite;
        do {            
            System.out.println("Ingresa el número límite");
            limite = sc.nextInt();
        } while (limite<0);
        
        int suma = 0;
        while (suma != limite) {            
            System.out.println("Ingresa un número para tu suma: ");
            int num = sc.nextInt();
            suma += num;
        }//end while 
    }// main end
}// class end
