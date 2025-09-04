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
public class Matriz<T>{
    private int n;
    private int m;
    private T[][] matriz;

    public Matriz(int n, int m) {
        this.n = n;
        this.m = m;
        this.matriz = (T[][]) new Object[n][m];
    }

    public boolean set(T objeto, int i, int j) {
        if (i < 0 || i >= n || j < 0 || j >= m) {
            return false;
        }
        matriz[i][j] = objeto;
        return true;
    }

    public T get(int i, int j) {
        if (i < 0 || i >= n || j < 0 || j >= m) {
            return null;
        }
        return matriz[i][j];
    }

    public List<T> getLinha(int linha) {
        List<T> linhaLista = new ArrayList<>();
        if (linha >= 0 && linha < n) {
            for (int j = 0; j < m; j++) {
                linhaLista.add(matriz[linha][j]);
            }
        }
        return linhaLista;
    }

    public List<T> getColuna(int coluna) {
        List<T> colunaLista = new ArrayList<>();
        if (coluna >= 0 && coluna < m) {
            for (int i = 0; i < n; i++) {
                colunaLista.add(matriz[i][coluna]);
            }
        }
        return colunaLista;
    }

    public List<T> getElementosQuadrante(Quadrante quadrante) {
        List<T> elementos = new ArrayList<>();
        int meioN = n / 2;
        int meioM = m / 2;

        switch (quadrante) {
            case PRIMEIRO:
                for (int i = 0; i < meioN; i++) {
                    for (int j = 0; j < meioM; j++) {
                        elementos.add(matriz[i][j]);
                    }
                }
                break;
            case SEGUNDO:
                for (int i = 0; i < meioN; i++) {
                    for (int j = meioM; j < m; j++) {
                        elementos.add(matriz[i][j]);
                    }
                }
                break;
            case TERCEIRO:
                for (int i = meioN; i < n; i++) {
                    for (int j = 0; j < meioM; j++) {
                        elementos.add(matriz[i][j]);
                    }
                }
                break;
            case QUARTO:
                for (int i = meioN; i < n; i++) {
                    for (int j = meioM; j < m; j++) {
                        elementos.add(matriz[i][j]);
                    }
                }
                break;
        }
        return elementos;
    }
}
