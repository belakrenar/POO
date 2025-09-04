/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bela
 */
public class Grafo extends Diagrafo{
    public void adicionarAresta(int origem, int destino) {
        if (origem < matrizAdjacencia1.size() && destino < matrizAdjacencia1.size()) {
            matrizAdjacencia1.get(origem).set(destino, 1);
            matrizAdjacencia1.get(destino).set(origem, 1);
        }

        if (matrizAdjacencia2.containsKey(origem)) {
            matrizAdjacencia2.get(origem).add(destino);
        } else {
            matrizAdjacencia2.put(origem, new ArrayList<>(List.of(destino)));
        }

        if (matrizAdjacencia2.containsKey(destino)) {
            matrizAdjacencia2.get(destino).add(origem);
        } else {
            matrizAdjacencia2.put(destino, new ArrayList<>(List.of(origem)));
        }
    }
}
