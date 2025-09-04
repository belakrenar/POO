/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Dados;
import java.util.Scanner;
/**
 *
 * @author bela
 */
public class Principal{

    public static void main(String[] args) {
        Matriz<Integer> matriz = new Matriz<>(4, 4);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz.set(i * 4 + j + 1, i, j);
            }
        }

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\nEscolha um quadrante:");
            System.out.println("1. Primeiro");
            System.out.println("2. Segundo");
            System.out.println("3. Terceiro");
            System.out.println("4. Quarto");
            System.out.println("5. Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Elementos do primeiro quadrante: " + matriz.getElementosQuadrante(Quadrante.PRIMEIRO));
                    break;
                case 2:
                    System.out.println("Elementos do segundo quadrante: " + matriz.getElementosQuadrante(Quadrante.SEGUNDO));
                    break;
                case 3:
                    System.out.println("Elementos do terceiro quadrante: " + matriz.getElementosQuadrante(Quadrante.TERCEIRO));
                    break;
                case 4:
                    System.out.println("Elementos do quarto quadrante: " + matriz.getElementosQuadrante(Quadrante.QUARTO));
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }
        
        scanner.close();
    }
        
    }
