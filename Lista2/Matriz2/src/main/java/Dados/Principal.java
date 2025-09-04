/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Dados;

import java.util.Scanner;

/**
 *
 * @author bela
 */
public class Principal {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz ou digite -1 para sair\n");
        
        // Leitura da matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int elemento = scanner.nextInt();
                if (elemento == -1) {
                    scanner.close();
                    return;
                }
                matriz[i][j] = elemento;
            }
        }

        int menorElemento = menor(matriz);
        System.out.println("\nO menor elemento da matriz é: " + menorElemento);
        
        scanner.close();
    }

    private static int menor(int[][] matriz) {
        int menor = Integer.MAX_VALUE;

        for (int[] linha : matriz) {
            for (int elemento : linha) {
                if (elemento < menor) {
                    menor = elemento;
                }
            }
        }
        return menor;
    }
    }
