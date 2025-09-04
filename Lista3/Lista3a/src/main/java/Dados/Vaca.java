/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
public class Vaca extends Animal{
    public Vaca(String nome){
       super(nome);
    }
    
    public String emitirSom(){
        String vaca = "";
        
        vaca += this.nome;
        vaca += ": Muuu";
        
        return vaca;
    }
}
