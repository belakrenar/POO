/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
public class Video extends Arquivo {
    public enum Qualidade {
        P240, P360, P720, P1080
    }

    private Qualidade qualidade;

    public Video(String nome, Qualidade qualidade) throws NomeInvalidoException {
        super(nome);
        this.extensao = ".mp4";
        this.qualidade = qualidade;
    }

    public String toString() {
        String qualidadeFormatada = qualidade.name().substring(1) + "p";
        return nome + extensao + "\nQualidade: " + qualidadeFormatada+"\n";
    }
}
