/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
public class Musica extends Arquivo{
    private int duracao;
    
    public Musica(String nome, int duracao) throws NomeInvalidoException{
        super(nome);
        this.extensao = ".mp3";
        this.duracao = duracao;
    }

    /**
     * @return the duracao
     */
    public int getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    
    public String toString(){
        return nome + extensao +"\nDuracao: " + duracao+"\n";
    }
    
}
