




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import Dados.*;

/**
 *
 * @author bela
 */
public class Principal {

    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        grafo.adicionarVertice();
        grafo.adicionarVertice();
        grafo.adicionarVertice();

        grafo.adicionarAresta(0, 1);
        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(0, 2);

        System.out.println("Grafo:");
        System.out.println(grafo);
    }
}
