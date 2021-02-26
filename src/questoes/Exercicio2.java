/*
 */
package questoes;

import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class Exercicio2 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int matriz[][] = new int[a][b];
        int matrizAux[][] = new int[b][a];
        inserirMatriz(matriz);
        System.out.println("");
        inserirMatriz2(matrizAux, matriz);
        lerAmbasMatrizes(matrizAux, matriz);

    }

    public static void inserirMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public static void inserirMatriz2(int matrizAux[][], int matriz[][]) {
        for (int i = 0; i < matrizAux.length; i++) {
            for (int j = 0; j < matrizAux[0].length; j++) {
                matrizAux[i][j] = matriz[j][i];
            }
        }
    }

    public static void lerAmbasMatrizes(int matrizAux[][], int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("");
        for (int i = 0; i < matrizAux.length; i++) {
            for (int j = 0; j < matrizAux[0].length; j++) {
                System.out.print(matrizAux[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
