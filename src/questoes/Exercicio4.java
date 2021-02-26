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
public class Exercicio4 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int tamanho = sc.nextInt();
        int matriz[][] = new int[tamanho][tamanho];
        inserirMatriz(matriz);
        lerMatriz(matriz);
        System.out.println("");
        int contador = 0;
        System.out.println("Números da diagonal: ");
        printDiagonalMatriz(matriz, contador);

    }

    public static void inserirMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public static void lerMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void printDiagonalMatriz(int matriz[][], int contador) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                soma += matriz[contador][contador];
                System.out.print(matriz[contador][contador] + " ");
                contador++;
            }
            System.out.println("");
            System.out.println("");
            System.out.println("A soma da diagonal principal é: " + soma);
            break;
        }
    }
}
