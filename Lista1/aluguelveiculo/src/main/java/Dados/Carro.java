/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
public class Carro {
    private String grupo;
    private String modelo;
    private int passageiros;
    private boolean arCondicionado;
    private boolean automatico;
    private int bagagem;
    
    public String getGrupo(){
        return grupo;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public int getPassageiros(){
        return passageiros;
    }
    
    public boolean getArcondicionado(){
        return arCondicionado;
    }
    
    public boolean getAutomatico(){
        return automatico;
    }
    
    public int getBagagem(){
        return bagagem;
    }
    
    public void setGrupo(String grupo){
        this.grupo = grupo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setPassageiros(int passageiros){
        this.passageiros = passageiros;
    }
    
    public void setArCondicionado(boolean arCondicionado){
        this.arCondicionado = arCondicionado;
    }
    
    public void setAutomatico(boolean automatico){
        this.automatico = automatico;
    }
    
    public void setBagagem(int bagagem){
        this.bagagem = bagagem;
    }
    
    public String toString(){
        String carro = "";
        
        carro += "\nModelo: " + this.modelo;
        carro += "\nNumero maximo de passageiros: "+this.passageiros;
        carro += "\nPossui ar condicionado?(sim/nao): " + (this.arCondicionado ? "sim" : "nao");
        carro += (this.automatico ? "\nAutomatico" : "\nManual");
        carro += "\nLimite de bagagem: " + this.bagagem;
             
        return carro;
        
    }
    
}
