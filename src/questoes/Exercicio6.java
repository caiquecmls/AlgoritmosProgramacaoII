/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questoes;

import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class Exercicio6 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int matrizA[][] = new int[a][b];
        int matrizB[][] = new int[a][b];
        int matrizC[][] = new int[a][b];

        inserirMatriz(matrizA);
        System.out.println("");
        inserirMatriz(matrizB);
        System.out.println("Matriz A");
        exibirMatriz(matrizA);
        System.out.println("");

        System.out.println("Matriz B");
        exibirMatriz(matrizB);

        System.out.println("");
        System.out.println("Matriz C");
        somarMatriz(matrizA, matrizB, matrizC);
        exibirMatriz(matrizC);
    }

    public static void inserirMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public static void exibirMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] somarMatriz(int matrizA[][], int matrizB[][], int matrizC[][]) {
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[0].length; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return matrizC;
    }
}
