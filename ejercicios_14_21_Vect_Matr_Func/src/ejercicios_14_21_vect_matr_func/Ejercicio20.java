
package ejercicios_14_21_vect_matr_func;
import java.util.Scanner;

public class Ejercicio20 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam;
        boolean esMagica;

        System.out.print("Ingresa el tamaño de la matriz (de 1 a 9): ");
        tam = sc.nextInt();
        validarRango(tam);

        int[][] matriz = new int[tam][tam];
        llenadoMatriz(matriz, tam);
        imprimeMatriz(matriz, tam);

        esMagica = validarCajaMagica(matriz, tam);
        
        if (esMagica == true) {
            System.out.println("La matriz es mágica.");
        } else {
            System.out.println("La matriz NO es mágica.");
        }
    }

    public static void validarRango(int tam) {
        Scanner sc = new Scanner(System.in);
        while (tam < 1 || tam > 9) {
            System.out.print("Número no válido. Ingresa el tamaño de la matriz (de 1 a 9): ");
            tam = sc.nextInt();
        }
    }

    public static void llenadoMatriz(int[][] matriz, int tam) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print("Ingresa el valor del espacio [" + i + "," + j + "] de 1 a 9: ");
                matriz[i][j] = sc.nextInt();
                while (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    System.out.print("Valor no válido. Ingresa un valor de 1 a 9: ");
                    matriz[i][j] = sc.nextInt();
                }
            }
        }
    }

    public static boolean validarCajaMagica(int[][] matriz, int tam) {
        int sumafilaInicial = 0;
        int sumacolumnas;
        int sumadiagonales = 0;
        int sumadiagonales2 = 0;
        int nuevaSumaFilas;
        boolean esMagica = true;

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                sumafilaInicial += matriz[i][j];
            }
            break;
        }

        System.out.println("La suma de la primera fila es: " + sumafilaInicial);

        for (int i = 0; i < tam; i++) {
            nuevaSumaFilas = 0;
            for (int j = 0; j < tam; j++) {
                nuevaSumaFilas += matriz[i][j];
            }
            if (sumafilaInicial != nuevaSumaFilas) {
                esMagica = false;
                break;
            }
        }

        for (int j = 0; j < tam; j++) {
            sumacolumnas = 0;
            for (int i = 0; i < tam; i++) {
                sumacolumnas += matriz[i][j];
            }
            if (sumafilaInicial != sumacolumnas) {
                esMagica = false;
                break;
            }
        }

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                  if (i == j) {
                    sumadiagonales += matriz[i][j];
                  }
            }
        }
        
        if (sumafilaInicial != sumadiagonales) {
            esMagica = false;
        }
         for (int i = 0; i < tam; i++) {
            sumadiagonales2 += matriz[i][tam - 1 - i];
        }
        
        if (sumafilaInicial != sumadiagonales2) {
            esMagica = false;
        }
        
        return esMagica;
    }//funcion es magica
    
    private static void imprimeMatriz(int[][] matriz, int tam) {
        System.out.println("Esta es la matriz:");
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }
    
}//class
        
