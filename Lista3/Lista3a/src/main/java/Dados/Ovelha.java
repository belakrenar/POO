/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
public class Ovelha extends Animal{
    public Ovelha(String nome){
       super(nome);
    }
    
    public String emitirSom(){
        String ovelha = "";
        
        ovelha += this.nome;
        ovelha += ": Beee";
        
        return ovelha;
    }
}

