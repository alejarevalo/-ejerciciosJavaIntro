
package ejercicios_14_21_vect_matr_func;
/**
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        int[] vector = new int[100];
        for (int i = 1; i <= 100; i++) {
           vector[i-1] = i;//pongo la posición en 0 pero se empieza a asignar desde el 1                     
        }// 1st for end
        
        for (int i = 99; i >= 0; i--) {
            System.out.println("[" + vector[i] + "]" );
        }// 2nd for end
        System.out.println("");

        }//main end
       
    }// class end

