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
public class Exercicio7 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        int m = sc.nextInt();
        int n = sc.nextInt();
//        int x = sc.nextInt();
//        int p = sc.nextInt();
        int matrizA[][] = new int[n][n];
        int matrizB[][] = new int[n][n];

        inserirMatriz(matrizA);
        System.out.println("");
        inserirMatriz(matrizB);

        exibirMatriz(matrizA);
        System.out.println("");
        exibirMatriz(matrizB);
        System.out.println("");
        System.out.println("Matriz Multiplicada");
        System.out.println("");

        exibirMatriz(multiplicarMatrizCorreta(matrizA, matrizB));
    }

    public static void inserirMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
//                matriz[i][j] = (int) (Math.random() * 100);
                matriz[i][j] = sc.nextInt();
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

    public static int[][] multiplicarMatrizCorreta(int matrizA[][], int matrizB[][]) {
        int matrizC[][] = new int[matrizA.length][matrizB[0].length];
        int n = matrizA[0].length; //
        for (int i = 0; i < matrizA.length; i++) { //linhas           
            for (int j = 0; j < matrizB[0].length; j++) { //colunas
                for (int k = 0; k < n; k++) {
                    matrizC[i][j] = matrizC[i][j] + matrizA[i][k] * matrizB[k][j];
                }
            }
        }

//                matrizA[0][0] * matrizB[0][0] + matrizA[0][1] * matrizB[1][0];
//                matrizA[0][0] * matrizB[0][1] + matrizA[0][1] * matrizB[1][1];
//                matrizA[1][0] * matrizB[0][1] + matrizA[0][1] * matrizB[1][1];
//                matrizA[1][0] * matrizB[0][1] + matrizA[0][1] * matrizB[1][0];      
        return matrizC;
    }

//    public static void multiplicarMatriz(int matrizA[][], int matrizB[][], int matrizC[][]) {
//        for (int i = 0; i < matrizC.length; i++) {
//            for (int j = 0; j < matrizC[0].length; j++) {
//                matrizC[i][j] = matrizA[i][j] * matrizB[i][j];
//                System.out.print(matrizC[i][j] + " ");
//            }
//            System.out.println("");
//
//        }
}
