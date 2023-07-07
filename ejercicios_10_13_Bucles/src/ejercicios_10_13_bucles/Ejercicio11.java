
package ejercicios_10_13_bucles;
import java.util.Scanner;
/**
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int option;
        boolean salir = false;
        // validación de números enteros positivos :
        do {
            System.out.println("Ingrese el primer numero");
            num1 = sc.nextInt();
            System.out.println("Ingrese el segundo numero");
            num2 = sc.nextInt();
            sc.nextLine();
        } while (num1 <= 0 || num2 <= 0);
        // Menú y switch
        do {            
            System.out.println("Menu:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija el número de la opción:");
            option = sc.nextInt();
            sc.nextLine();
                                
            switch(option){
                case 1:
                    System.out.println("La suma de " + num1 + "+" + num2 + " es: " + (num1+num2));
                break;
                case 2:
                    System.out.println("La resta de " + num1 + "-" + num2 + " es: " + (num1-num2));
                break;
                case 3:
                    System.out.println("La multiplicación de " + num1 + "*" + num2 + " es: " + (num1*num2));
                break;
                case 4:
                    try { // se crea un Try...Catch previendo un error por división por cero
                        System.out.println("La multiplicación de " + num1 + "/" + num2 + " es: " + (num1/num2));
                    } catch (Exception e) {
                        System.out.println("No se puede dividir por 0");
                    }
                break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String confirm = sc.nextLine();
                    if (confirm.equalsIgnoreCase("s")) {
                        salir = true;
                    }                    
                break;
                default:
                    System.out.println("Opción inválida");
            }//end switch
            
        } while (!salir); // do...while end
               
    
    }//main end
}//class end
