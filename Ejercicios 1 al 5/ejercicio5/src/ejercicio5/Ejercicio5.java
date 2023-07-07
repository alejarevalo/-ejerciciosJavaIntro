
package ejercicio5;
import java.util.Scanner;
/**
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número entero");
        int num = sc.nextInt();
        float raizQ = (float) Math.sqrt(num);
        System.out.println("doble: " + num*2 + " triple: " + num*3 + " raíz: " + raizQ);
    }
    
}
