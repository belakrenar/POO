/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

/**
 *
 * @author bela
 */
public class Cidade {
    private String nome;
    private String estado;
    
    public String getNome(){
        return nome;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public String toString(){
        String cidade = "";
        
        cidade += this.nome;
        cidade += ", ";
        cidade += this.estado;
        cidade += ".";
        
        return cidade;
    }
    
    public boolean equals(Object o){
        Cidade c;
        if(o instanceof Cidade){
        c = (Cidade) o;
        if(nome.equals(c.getNome()) && estado.equals(c.getEstado())){
            return true;
        }
        else{
            return false;
                }
    }
        else{
            return false;
                }
    }
    
}
