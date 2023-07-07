package ejercicios_14_21_vect_matr_func;
import java.util.Scanner;
/**
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
public class Ejercicio14 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros");
        int euros = sc.nextInt();
        sc.nextLine();
        System.out.println("Escriba la moneda de conversión (dolar, yen, libra):");
        String moneda = sc.nextLine().toLowerCase(); 
        conversion(euros, moneda);//llamo al procedimiento 
      
    }//main end
    
    public static void conversion(int euros, String moneda){
        switch (moneda) {
            case "dolar":
                System.out.println(euros + " euros son " + (euros*1.28611) + " dólares");
                break;
            case "yen":
                System.out.println(euros + " euros son " + (euros*129.852) + " yenes");
                break;
            case "libra":
                System.out.println(euros + " euros son " + (euros*0.86) + " libras");
                break;
            default:
                System.out.println("Opción no válida");    
        }//swith end
    }//fonction end
}//class end
