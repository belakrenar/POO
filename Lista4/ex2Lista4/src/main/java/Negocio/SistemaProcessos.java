/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;
import Dados.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author bela
 */
public class SistemaProcessos {
    private List<Processo> processos;
    private List<Juiz> juizes;

    public SistemaProcessos() {
        this.processos = new ArrayList<>();
        this.juizes = new ArrayList<>();
    }

    public void adicionarJuiz(Juiz juiz) {
        juizes.add(juiz);
    }

    public void adicionarProcesso(Processo processo) {
        processos.add(processo);
    }

    public void distribuirProcessos() throws ProcessoSemJuizException {
        Random random = new Random();
        for (Processo processo : processos) {
            boolean distribuido = false;
            for (int i = 0; i < juizes.size(); i++) {
                Juiz juiz = juizes.get(random.nextInt(juizes.size()));
                try {
                    juiz.cadastrarProcesso(processo);
                    distribuido = true;
                    break;
                } catch (PilhaCheiaException e) {
                }
            }
            if (!distribuido) {
                throw new ProcessoSemJuizException();
            }
        }
    }
}
