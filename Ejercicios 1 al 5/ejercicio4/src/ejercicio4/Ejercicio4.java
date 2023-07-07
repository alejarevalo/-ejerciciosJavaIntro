
package ejercicio4;
import java.util.Scanner;
/**
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de grados C°:");
        double gradosC = sc.nextDouble();
        double gradosF = 32 + ((9*gradosC)/5);
        System.out.println("Eso equivale a " + gradosF + " Fahrenheit");
     
                
    }// fin main
    
}// fin clase
