/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Apresentacao;
import Dados.*;
/**
 *
 * @author bela
 */
public class Principal {

    public static void main(String[] args) {
        EspacoGeometrico espaco = new EspacoGeometrico();

        try {
            Reta reta1 = new Reta(1, 0);
            Reta reta2 = new Reta(-1, 2);
            Reta reta3 = new Reta(0, 1);

            espaco.adicionarReta(reta1);
            espaco.adicionarReta(reta2);
            espaco.adicionarReta(reta3);

            Ponto2D pontoA = new Ponto2D(0, 0);
            Ponto2D pontoB = new Ponto2D(1, 1);
            Ponto2D pontoC = new Ponto2D(2, -2);
            Ponto2D pontoD = new Ponto2D(3, 2);

            espaco.adicionarPonto(pontoA);
            espaco.adicionarPonto(pontoB);
            espaco.adicionarPonto(pontoC);
            espaco.adicionarPonto(pontoD);

            System.out.println(espaco);
        } catch (ObjetoSobrepostoException e) {
            System.err.println(e.getMessage());
        }
    }
}
