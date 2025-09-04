/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import java.util.ArrayList;

/**
 *
 * @author bela
 */
public class Cliente {
    private String nome;
    private long cpf;
    private String telefone;
    private String localizacao;
    private int quantReservas;
    private ArrayList<Reserva> reservas = new ArrayList<>();
    
    public String getNome(){
        return nome;
    }
    
    public long getCpf(){
        return cpf;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public String getLocalizacao(){
        return localizacao;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCpf(long cpf){
        this.cpf = cpf;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }
    
    
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public int getQuantReservas(){
        return reservas.size();
    }
    
    public String toString(){
        String cliente = "";
        
        cliente += "\nNome: " +this.nome;
        cliente += "\nCPF: " + this.cpf;
        cliente += "\nTelefone: "+this.telefone;
        cliente += "\nLocalizacao: "+this.localizacao;
             
        return cliente;
        
    }
}
