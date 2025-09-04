/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
public class Reserva {
    private int numReserva;
    private int dias;
    private String dataRetirada;
    private String horarioRetirada;
    private String dataDevolucao;
    private String horarioDevolucao;
    private Carro carro;
    private int preco;
    
    public int getNumReserva(){
        return numReserva;
    }
    
    public int getDias(){
        return dias;
    }
    
    public String getDataRetirada(){
        return dataRetirada;
    }
    
    public String getHorarioRetirada(){
        return horarioRetirada;
    }
    
    public String getDataDevolucao(){
        return dataDevolucao;
    }
    
    public String getHorarioDevolucao(){
        return horarioDevolucao;
    }
    
    public int getPreco(){
        return preco;
    }
    
    public void setNumReserva(int numReserva){
        this.numReserva = numReserva;
    }
    
    public void setDias(int dias){
        this.dias = dias;
    }
    
    public void setDataRetirada(String dataRetirada){
        this.dataRetirada = dataRetirada;
    }
    
    public void setHorarioRetirada(String horarioRetirada){
        this.horarioRetirada = horarioRetirada;
    }
    
    public void setDataDevolucao(String dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }
    
    public void setHorarioDevolucao(String horarioDevolucao){
        this.horarioDevolucao = horarioDevolucao;
    }
    
    public void setCarro(Carro carro){
        this.carro = carro;
    }
    
    public void setPreco(int preco){
        this.preco = preco;
    }
    
    public String toString(){
        String reserva = " ";
        
        reserva += "\nRESERVA NUMERO " + this.numReserva;
        reserva += "\nRetirada \nData: " + this.dataRetirada;
        reserva += " Horario: " + this.horarioRetirada;
        reserva += "\nDevolucao \nData: " + this.dataDevolucao;
        reserva += " Horario: " + this.horarioDevolucao;
        
        if(this.carro != null){
            reserva += "\nCarro: " + carro.getModelo();
        }
        
        return reserva;
    }
    
    
}
