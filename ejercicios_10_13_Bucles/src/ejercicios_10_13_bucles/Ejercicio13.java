
package ejercicios_10_13_bucles;
import java.util.Scanner;

/**
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
public class Ejercicio13 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la longitud del lado de tu cuadrado");
        int lado = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i==0 || j==0 || i==(lado-1) || j==(lado-1)){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }//if end
            }// second for end
            System.out.println("");
        }//first for end
        
    
    
    
    }//end main
}// class end
