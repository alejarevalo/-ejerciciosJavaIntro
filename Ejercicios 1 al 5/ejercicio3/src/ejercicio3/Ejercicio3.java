
package ejercicio3;
import java.util.Scanner;
/**
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
public class Ejercicio3 {


    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
               
    }// fin método
    
}//fin clase