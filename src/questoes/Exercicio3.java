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
public class Exercicio3 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("");
        int matriz[][] = new int[n][m];
        inserirMatriz(matriz);
        imprimirMatriz(matriz);
        System.out.println("");
        System.out.println("O maior número é: " + imprimirMaiorElemento(matriz));
    }

    public static void inserirMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) { // linha 
            for (int j = 0; j < matriz[0].length; j++) { // coluna
                matriz[i][j] = (int) (Math.random() * 100); //inserindo números aleatorio até 100
            }
        }
    }

    public static void imprimirMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) { // linha 
            for (int j = 0; j < matriz[0].length; j++) { // coluna
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }

    public static int imprimirMaiorElemento(int matriz[][]) {
        int maior = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > maior) { //verifica o número que é maior que maior
                    maior = matriz[i][j]; //maior recebe o número indicado como maior e vai trocando até restar somente o maior número
                }
            }
        }
        return maior;
    }
}
