
package ejercicios_14_21_vect_matr_func;
import java.util.Scanner;
/**
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.print("Ingresa el número de filas y columnas: ");
        n = leerEntero();
        m = leerEntero();
        int[][] matriz = new int[n][m];
        int[][] traspuesta = new int[m][n];

        llenadoMatrices(matriz, traspuesta, n, m);
        imprimeMatriz(matriz, n, m);
        imprimeTrasp(traspuesta, n, m);
    }

    public static void llenadoMatrices(int[][] matriz, int[][] traspuesta, int n, int m) {
      
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int)(Math.random()*10)+1;
                traspuesta[j][i] = matriz[i][j];
            }
        }
    }

    public static void imprimeMatriz(int[][] matriz, int n, int m) {
        System.out.println("Esta es la matriz original:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    public static void imprimeTrasp(int[][] traspuesta, int n, int m) {
        System.out.println("Esta es la matriz traspuesta:");
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(traspuesta[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    public static int leerEntero() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
  
    }//fin clase
    
    

