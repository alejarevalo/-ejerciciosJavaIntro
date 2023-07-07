
package ejercicios_14_21_vect_matr_func;

import java.util.Scanner;

/**
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        boolean esAntisimetrica;
        System.out.print("Ingresa el número de filas y columnas: ");
        n = leerEntero();
        m = leerEntero();
        int[][] matriz = new int[n][m];
        int[][] traspuesta = new int[m][n];

        llenadoMatrices(matriz, traspuesta, n, m);
        imprimeMatriz(matriz, n, m);
        imprimeTrasp(traspuesta, n, m);
        antisimetrica(matriz, traspuesta, n, m);
        
        System.out.println(antisimetrica(matriz, traspuesta, n, m));      
        
        
    }

    public static void llenadoMatrices(int[][] matriz, int[][] traspuesta, int n, int m) {
      Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Matriz ["+i+"]["+j+"}: ");
                matriz[i][j] = leerEntero();
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
    
    public static boolean antisimetrica(int[][] matriz, int[][] traspuesta, int n, int m) {
        boolean esAntisimetrica = true;
//        int u = 0;
//        while (isAntisimetrica == true || u == 1) {            
            for (int i = 0 ; i < n; i++) {
                 for (int j = 0; j < m; j++) {
                    if (matriz[i][j] == (traspuesta[i][j])*-1) {
                        esAntisimetrica = true;                 
                    }else {
                        esAntisimetrica = false;  
                        break;
                    }//if
                 }//2nd for
            }//1st for         
//        }//while        
        return esAntisimetrica;
    }
}
