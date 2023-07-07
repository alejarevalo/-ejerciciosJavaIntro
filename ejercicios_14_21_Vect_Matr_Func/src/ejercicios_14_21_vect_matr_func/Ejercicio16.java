 
package ejercicios_14_21_vect_matr_func;
import java.util.Scanner;
/**
Realizar un algoritmo que rellene un vector de tamaño N con valores
 * aleatorios y le pida al usuario un numero a buscar en el vector. El programa
 * mostrará donde se encuentra el numero y si se encuentra repetido
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []vector = new int[5];
        for (int i = 0; i < 5; i++) {
           vector[i] = (int)(Math.random()*10)+1; //ASIGNA DE 1 A 9                     
        }
        
//        for (int i = 0; i < 5; i++) {
//            System.out.println("[" + vector[i] + "]");                     
//        }
               
        
        System.out.println("¿Qué número quieres buscar?");
        int num = sc.nextInt();
        int times = 0;
        sc.nextLine();
        String position = "";
       
        for (int i = 0; i < 5; i++) {
            if (vector[i] == num) {
                times += 1;  
                if (times > 1){
                position +=  i + ", ";
                }else{
                position += i;
                }          

            }// if end                   
        }// for end        
        
        switch (times) {
            case 0:
                System.out.println("No se encontró tu número en ninguna posición");
                break;
            case 1:
                System.out.println("Tu número " + num + " se encontró en la posición: " + position);
                break;
            default:
                System.out.println("Tu número " + num + " se encontró " + times + " veces en las posiciones " + position);
        }
    }// main end  
   
}// class end
