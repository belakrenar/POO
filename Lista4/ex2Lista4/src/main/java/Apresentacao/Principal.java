/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Apresentacao;
import Dados.*;
import Negocio.*;
import java.util.Scanner;
/**
 *
 * @author bela
 */
public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        SistemaProcessos sistema = new SistemaProcessos();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite o nome do juiz " + i + ":");
            String nomeJuiz = leitor.next();
            Juiz juiz = new Juiz(nomeJuiz, 5);
            sistema.adicionarJuiz(juiz);
        }

        for (int i = 1; i <= 18; i++) {
            System.out.println("Digite o nome do processo " + i + ":");
            String nomeProcesso = leitor.next();
            Processo processo = new Processo(i, nomeProcesso);
            sistema.adicionarProcesso(processo);
        }

        try {
            sistema.distribuirProcessos();
            System.out.println("\nProcessos distribuidos");
        } catch (ProcessoSemJuizException e) {
            System.err.println("Erro ao distribuir processos: " + e.getMessage());
        }
    }
}
