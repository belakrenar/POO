/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;
import dados.Abundantes;
import dados.Fatoriais;
import dados.Fibonacci;
import dados.Gerador;
import dados.Naturais;
import dados.NumerosPrimos;
import dados.Perfeitos;
import dados.Quadrados;
/**
 *
 * @author bela
 */
public class Principal {

    public static void main(String[] args) {
        relatorio(new Abundantes());
        relatorio(new Fatoriais());
        relatorio(new Fibonacci());
        relatorio(new Naturais());
        relatorio(new NumerosPrimos());
        relatorio(new Perfeitos());
        relatorio(new Quadrados());
    }
    
    public static void relatorio(Gerador g) {
        g.gerar(4);
        for (int x : g.getSequencia()) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("Sortear: " + g.sortear());
        System.out.println("Somatorio: " + g.somatorio());
        System.out.println("Media aritmetica: " + g.mediaAritmetica());
        System.out.println("Media geometrica: " + g.mediaGeometrica());
        System.out.println("Variancia: " + g.variancia());
        System.out.println("Desvio padrão: " + g.desvioPadrao());
        System.out.println("Amplitude:" + g.amplitude());
        System.out.println();
    }
}
