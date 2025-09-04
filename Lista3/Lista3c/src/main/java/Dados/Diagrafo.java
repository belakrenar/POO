/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author bela
 */
public abstract class Diagrafo {
    protected List<List<Integer>> matrizAdjacencia1;
    protected Map<Integer, List<Integer>> matrizAdjacencia2;

    public Diagrafo() {
        matrizAdjacencia1 = new ArrayList<>();
        matrizAdjacencia2 = new HashMap<>();
    }

    public void adicionarVertice() {
        matrizAdjacencia1.add(new ArrayList<>());
        for (List<Integer> linha : matrizAdjacencia1) {
            while (linha.size() < matrizAdjacencia1.size()) {
                linha.add(0);
            }
        }
        matrizAdjacencia2.put(matrizAdjacencia2.size(), new ArrayList<>());
    }

    public abstract void adicionarAresta(int origem, int destino);

    public String toString() {
        StringBuilder resultado = new StringBuilder("\nMatriz de Adjacencia1:\n");
        for (List<Integer> linha : matrizAdjacencia1) {
            resultado.append(linha).append("\n");
        }

        resultado.append("\nMatriz de Adjacencia2:\n");
        for (Map.Entry<Integer, List<Integer>> entrada : matrizAdjacencia2.entrySet()) {
            resultado.append(entrada.getKey()).append(" -> ").append(entrada.getValue()).append("\n");
        }

        return resultado.toString();
    }
}
