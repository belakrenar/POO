/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import java.util.ArrayList;

/**
 *
 * @author bela
 */
public class Pilha<T>{
    private ArrayList<T> elementos;
    private int limite;
    
    public Pilha(int limite){
        this.limite = limite;
        this.elementos = new ArrayList<>();
    }
    
    public void inserir(T elemento) throws PilhaCheiaException {
        if (getElementos().size() < getLimite()) {
            getElementos().add(elemento);
        } else {
            throw new PilhaCheiaException();
        }
    }

    public T remover() throws PilhaVaziaException {
        if (getElementos().isEmpty()) {
            throw new PilhaVaziaException();
        }
        return getElementos().remove(getElementos().size() - 1);
    }

    public int getSize(){
        return getElementos().size();
    }

    /**
     * @return the elementos
     */
    public ArrayList<T> getElementos() {
        return elementos;
    }

    /**
     * @param elementos the elementos to set
     */
    public void setElementos(ArrayList<T> elementos) {
        this.elementos = elementos;
    }

    /**
     * @return the limite
     */
    public int getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(int limite) {
        this.limite = limite;
    }
    
}
