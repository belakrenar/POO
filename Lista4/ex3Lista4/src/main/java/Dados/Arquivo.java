/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
public abstract class Arquivo{
    protected String nome;
    protected String extensao;
    
    public Arquivo(String nome) throws NomeInvalidoException{
        if(nomeValido(nome)){
        this.nome = nome;
        }
    }
    
    private boolean nomeValido(String nome) throws NomeInvalidoException {
    if (nome.contains("\n") || nome.contains("[") || nome.contains("]") ||
        nome.contains("(") || nome.contains(")") || nome.contains("'") || nome.contains("\"")) {
        throw new NomeInvalidoException();
    }
    if (nome.length() < 10 || nome.length() > 256) {
        throw new NomeInvalidoException();
    }
    return true;
}
    public abstract String toString();

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the extensao
     */
    public String getExtensao() {
        return extensao;
    }

    /**
     * @param extensao the extensao to set
     */
    public void setExtensao(String extensao) {
        this.extensao = extensao;
    }

}
