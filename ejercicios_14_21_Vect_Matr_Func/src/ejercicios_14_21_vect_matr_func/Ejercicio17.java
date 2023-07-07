
package ejercicios_14_21_vect_matr_func;
import java.util.Scanner;
/**
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
    de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] vector;
        int n;

        System.out.println("Ingrese el tamaño del vector:");
        n = sc.nextInt();

        vector = new int[n];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextInt();
        }

        int[] contador = new int[5];

        for (int i = 0; i < n; i++) {
            String numero = String.valueOf(vector[i]);
            int digitos = numero.length();
            if (digitos >= 1 && digitos <= 5) {
                contador[digitos - 1]++;
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Cantidad de números de " + (i + 1) + " dígito(s): " + contador[i]);
        }
    }
}
