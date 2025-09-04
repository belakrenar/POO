/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
import java.util.ArrayList;
import java.util.List;

public class EspacoGeometrico {
    private List<Reta> retas;
    private List<Ponto2D> pontos;

    public EspacoGeometrico() {
        this.retas = new ArrayList<>();
        this.pontos = new ArrayList<>();
    }

    public void adicionarReta(Reta novaReta) throws ObjetoSobrepostoException {
        for (Reta reta : retas) {
            if (!reta.intercepta(novaReta)) {
                throw new ObjetoSobrepostoException();
            }
        }
        retas.add(novaReta);
    }

    public void adicionarPonto(Ponto2D ponto) throws ObjetoSobrepostoException {
        for (Reta reta : retas) {
            if (reta.estaNaReta(ponto)) {
                throw new ObjetoSobrepostoException();
            }
        }
        pontos.add(ponto);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Retas no espaço:\n");
        for (Reta reta : retas) {
            sb.append(reta).append("\n");
        }
        sb.append("\nPontos no espaço:\n");
        for (Ponto2D ponto : pontos) {
            sb.append(ponto).append("\n");
        }
        return sb.toString();
    }
}

