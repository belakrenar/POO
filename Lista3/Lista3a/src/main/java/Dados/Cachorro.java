/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
public class Cachorro extends Animal{
    
    public Cachorro(String nome){
       super(nome);
    }
    
    public String emitirSom(){
        String cachorro = "";
        
        cachorro += this.nome;
        cachorro += ": Au-au";
        
        return cachorro;
    }
}
