/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
public class Juiz {
    private String nome;
    private Pilha<Processo> pilhaProcessos;

    public Juiz(String nome, int limiteProcessos) {
        this.nome = nome;
        this.pilhaProcessos = new Pilha<>(limiteProcessos);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the pilhaProcessos
     */
    public Pilha<Processo> getPilhaProcessos() {
        return pilhaProcessos;
    }

    /**
     * @param pilhaProcessos the pilhaProcessos to set
     */
    public void setPilhaProcessos(Pilha<Processo> pilhaProcessos) {
        this.pilhaProcessos = pilhaProcessos;
    }
    
    public void cadastrarProcesso(Processo processo) throws PilhaCheiaException {
        pilhaProcessos.inserir(processo);
    }

    public boolean isPilhaCheia() {
        if((pilhaProcessos.getSize()) == (pilhaProcessos.getLimite())){
            return true;
        }else{
            return false;
        }
    }
}
