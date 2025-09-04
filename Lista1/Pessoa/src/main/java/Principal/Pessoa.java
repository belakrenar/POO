/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Principal;

/**
 *
 * @author bela
 */
public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
           
    
    public String toString() {
        String pessoa = " ";
        
        pessoa += "\nNome: " + this.nome;
        pessoa += "\nIdade: " + this.idade;
        
        return pessoa;
    }
}


