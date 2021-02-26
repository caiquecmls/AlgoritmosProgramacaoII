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
public class Exercicio5 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int matriz[][] = new int[a][b];
        inserirMatriz(matriz);
        System.out.println(verificarSimetriaMatriz(matriz));
    }

    public static void inserirMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public static boolean verificarSimetriaMatriz(int matriz[][]) {
        boolean teste = true;
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                try {
                    if (matriz[i][j] != matriz[j][i]) {
                    } else {
                        teste = true;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    teste = false;
                }
            }
        }
        return teste;
    }
}
