
package ejercicios_14_21_vect_matr_func;
/**
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        int [][] matrizM = new int[10][10];
                
        matrizM [0][0] = 1;
        matrizM [0][1] = 26;
        matrizM [0][2] = 36;
        matrizM [0][3] = 47;
        matrizM [0][4] = 5;
        matrizM [0][5] = 6;
        matrizM [0][6] = 72;
        matrizM [0][7] = 81;
        matrizM [0][8] = 95;
        matrizM [0][9] = 10;
        matrizM [1][1] = 11;
        matrizM [1][2] = 12;
        matrizM [1][3] = 13;
        matrizM [1][4] = 54;
        matrizM [1][5] = 3;
        matrizM [1][6] = 54;
        matrizM [1][7] = 96;
        matrizM [1][8] = 54;
        matrizM [1][9] = 21;
        matrizM [2][1] = 17;
        matrizM [2][2] = 4;
        matrizM [2][3] = 9;
        matrizM [2][4] = 78;
        matrizM [2][5] = 31;
        matrizM [2][6] = 32;
        matrizM [2][7] = 14;
        matrizM [2][8] = 5;
        matrizM [2][9] = 8;
        matrizM [3][1] = 2;
        matrizM [3][2] = 36;
        matrizM [3][3] = 5;
        matrizM [3][4] = 67;
        matrizM [3][5] = 25;
        matrizM [3][6] = 60;
        matrizM [3][7] = 86;
        matrizM [3][8] = 26;
        matrizM [3][9] = 38;
        matrizM [3][1] = 47;
        matrizM [3][2] = 44;
        matrizM [3][3] = 53;
        matrizM [3][4] = 72;
        matrizM [3][5] = 65;
        matrizM [3][6] = 70;
        matrizM [3][7] = 2;
        matrizM [3][8] = 1;
        matrizM [3][9] = 5;
        matrizM [4][1] = 6;
        matrizM [4][2] = 89;
        matrizM [4][3] = 8;
        matrizM [4][4] = 36;
        matrizM [4][5] = 5;
        matrizM [4][6] = 67;
        matrizM [4][7] = 2;
        matrizM [4][8] = 25;
        matrizM [4][9] = 22;
        matrizM [5][1] = 36;
        matrizM [5][2] = 58;
        matrizM [5][3] = 9;
        matrizM [5][4] = 89;
        matrizM [5][5] = 90;
        matrizM [5][6] = 75;
        matrizM [5][7] = 4;
        matrizM [5][8] = 2;
        matrizM [5][9] = 1;
        matrizM [6][1] = 6;
        matrizM [6][2] = 77;
        matrizM [6][3] = 5;
        matrizM [6][4] = 14;
        matrizM [6][5] = 22;
        matrizM [6][6] = 26;
        matrizM [6][7] = 1;
        matrizM [6][8] = 2;
        matrizM [6][9] = 3;
        matrizM [7][1] = 4;
        matrizM [7][2] = 5;
        matrizM [7][3] = 6;
        matrizM [7][4] = 7;
        matrizM [7][5] = 8;
        matrizM [7][6] = 9; 
        matrizM [7][7] = 11; 
        matrizM [7][8] = 12;
        matrizM [7][9] = 13;
        matrizM [8][1] = 14;
        matrizM [8][2] = 15;
        matrizM [8][3] = 16;
        matrizM [8][4] = 17;
        matrizM [8][5] = 18;
        matrizM [8][6] = 19;
        matrizM [8][7] = 20;
        matrizM [8][8] = 21;
        matrizM [8][9] = 22;
        matrizM [9][1] = 23;
        matrizM [9][2] = 24;
        matrizM [9][3] = 24;
        matrizM [9][4] = 25;
        matrizM [9][5] = 1;
        matrizM [9][6] = 2;
        matrizM [9][7] = 3;
        matrizM [9][8] = 4;
        matrizM [9][9] = 5;
        
        //-------
        
        int[][] matrizP = {
            {36, 5, 67},
            {89, 90, 75},
            {14, 22, 26}
        };
        
        int filaInicio = -1; // Inicializar con valor -1 para indicar que no se ha encontrado coincidencia
        int columnaInicio = -1;
        
        for (int fila = 0; fila <= matrizM.length - matrizP.length; fila++) {
            for (int columna = 0; columna <= matrizM[0].length - matrizP[0].length; columna++) {//el [0] solo sirve si se asume que la matriz es cuadrada
                if (submatrizCoincide(matrizM, matrizP, fila, columna)) {
                    filaInicio = fila;
                    columnaInicio = columna;
                    break; // Se encontró coincidencia, salir del bucle interno
                }
            }
            if (filaInicio != -1) {
                break; // Se encontró coincidencia, salir del bucle externo
            }
        }
        
        if (filaInicio != -1) {
            System.out.println("La matriz P está contenida en la matriz M.");
            System.out.println("La submatriz P comienza en la fila " + filaInicio + " y columna " + columnaInicio);
        } else {
            System.out.println("La matriz P no está contenida en la matriz M.");
        }
        
    }//main
    
    private static boolean submatrizCoincide(int[][] matrizM, int[][] matrizP, int filaInicio, int columnaInicio) {
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP[0].length; j++) {
                if (matrizM[filaInicio + i][columnaInicio + j] != matrizP[i][j]) {
                    return false; // No coincide, salir y retornar false
                }
            }
        }
        return true; // Todas las comparaciones coinciden, retornar true 
    }//función
   
}//class
    
