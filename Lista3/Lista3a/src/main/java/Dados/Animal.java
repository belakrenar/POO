/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
public abstract class Animal {
    protected String nome;
    
    public abstract String emitirSom();
    
    public Animal(String nome) {
        this.nome = nome;
    }

}
