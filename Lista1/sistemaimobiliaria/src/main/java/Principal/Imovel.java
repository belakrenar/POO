/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author bela
 */
public class Imovel {
    private int largura;
    private int comprimento;
    private int preco;
    
    public int getLargura(){
        return largura;
    }
    
    public int getComprimento(){
        return comprimento;
    }
    
    public int getPreco(){
        return preco;
    }
    
    public void setLargura(int largura){
        this.largura = largura;
    }
    
    public void setComprimento(int comprimento){
        this.comprimento = comprimento;
    }
    
    public void setPreco(int preco){
        this.preco = preco;
    }
    
    public int calculoarea(int comprimento, int largura){
        int area = comprimento*largura;
        
        return area;
    }
    
    public String toString(){
        String imovel = " ";
        
        imovel += "\nArea " + calculoarea(this.comprimento, this.largura) + "m2";
        imovel += "\nLargura: " + this.largura;
        imovel += "\nComprimento: " + this.comprimento;
        imovel += "\nPreco: " + this.preco;
        
        return imovel;
    }
}
