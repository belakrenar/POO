/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Apresentacao;
import Dados.*;

import java.util.Scanner;

/**
 *
 * @author bela
 */
public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite dois valores");
        int valor1 =  leitor.nextInt();
        int valor2 = leitor.nextInt();
        
        Soma soma = new Soma();
        MDC mdc = new MDC();
        Mod mod = new Mod();
        Multiplicacao multi = new Multiplicacao();
        
        System.out.println("\nSoma: " + soma.executar(valor1, valor2));
        System.out.println("\nMDC: " + mdc.executar(valor1, valor2));
        System.out.println("\nMod: " + mod.executar(valor1, valor2));
        System.out.println("\nMultiplicacao: " + multi.executar(valor1, valor2));
        
    }
}
