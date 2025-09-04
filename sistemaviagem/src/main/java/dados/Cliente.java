/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

/**
 *
 * @author bela
 */
public class Cliente {
    private long cpf;
    private String nome;
    private String endereco;
    private int telefone;
    private int quantReservas = 0;
    private Reserva[] reservas = new Reserva[20];
    
    public long getCpf(){
        return cpf;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public int getTelefone(){
        return telefone;
    }
    
    public void setCpf(long cpf){
        this.cpf = cpf;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    
    public int getQuantReservas(){
        return quantReservas;
    }
    
    public Reserva[] getReservas(){
        return reservas;
    }
    
    public void reservarIda(Reserva reserva){
        if(this.quantReservas < 20){
            this.reservas[this.quantReservas] = reserva;
            this.quantReservas++;
        }
        
    }
    
    public void reservarVolta(Reserva ida, Reserva volta){
        if(quantReservas < 20){
            reservas[quantReservas] = volta;
            quantReservas++;
            ida.setVolta(volta);
        }
    }
    
    public String toString(){
        String cliente = "";
        
        cliente += "\nNome: " +this.nome;
        cliente += "\nCPF: " + this.cpf;
        cliente += "\nEndereco: "+this.endereco;
        cliente += "\nTelefone: "+this.telefone;
             
        return cliente;
        
    }
    
    
}
