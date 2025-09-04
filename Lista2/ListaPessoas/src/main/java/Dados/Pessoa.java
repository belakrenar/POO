/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
public class Pessoa {
    private String nome;
    private int idade;
    private long cpf;
    private String cidade;
    private String faixaet;

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
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the cpf
     */
    public long getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String toString(){
        String pessoa = " ";
        
        pessoa += "\n" + this.nome + ", " + this.idade + ", " + this.cpf + ", " + this.cidade + ";";
        
        return pessoa;
    }

    /**
     * @return the faixaet
     */
    public String getFaixaet() {
        return faixaet;
    }

    /**
     * @param faixaet the faixaet to set
     */
    public void setFaixaet(String faixaet) {
        this.faixaet = faixaet;
    }
}
