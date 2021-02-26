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
public class TesteSala {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] matriz = new int[a][b];
        leMatriz(matriz);
        printMatriz(matriz);
    }

    public static void leMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public static void printMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");

        }
    }
}
