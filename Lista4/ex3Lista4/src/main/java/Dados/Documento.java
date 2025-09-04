/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
public class Documento extends Arquivo{
    private String texto;
    
    public Documento(String nome, String texto) throws NomeInvalidoException{
        super(nome);
        this.extensao = ".txt";
        this.texto = texto;
    }
    
    public String toString() {
        return nome + extensao +"\n";
    }
}
