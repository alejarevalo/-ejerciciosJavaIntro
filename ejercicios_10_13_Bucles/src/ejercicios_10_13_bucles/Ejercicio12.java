
package ejercicios_10_13_bucles;
import java.util.Scanner;
/**
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        boolean salir = false;
        int correct = 0;
        int incorrect = 0;
        do {
            System.out.println("ingresa la cadena FDE:");
            cadena = sc.nextLine();
            int longitud = cadena.length();
            if (longitud == 5 && cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("O")){
                    correct += 1;
            } else if(cadena.equals("&&&&&")){
                    salir = true;
            } else{
                    incorrect += 1;
            }     
        } while (!salir);
        
        System.out.println("Lecturas correctas: " + correct);
        System.out.println("Lecturas incorrectas: " + incorrect);
                   
    }// main end

}// class end
