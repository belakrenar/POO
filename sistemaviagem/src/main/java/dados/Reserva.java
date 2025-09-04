/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

/**
 *
 * @author bela
 */
public class Reserva {

    public Reserva() {
    }
    private int numReserva;
    private String dataVoo;
    private String horaVoo;
    private float preco;
    private String classeVoo;
    private boolean idaEvolta;
    private int poltrona;
    private Reserva volta = null;
    private Cidade origem;
    private Cidade destino;
    
    public int getNumReserva(){
    return numReserva;
}

    public String getDataVoo(){
        return dataVoo;
    }
    
    public String getHoraVoo(){
        return horaVoo;
    }
    
    public float getPreco(){
        return preco;
    }
    
    public String getClasseVoo(){
        return classeVoo;
    }
    
    public boolean getIdaEvolta(){
        return idaEvolta;
    }
    
    public int getPoltrona(){
        return poltrona;
    }
    
    public Reserva getVolta(){
        return volta;
    }
    
    public void setNumReserva(int numReserva){
        this.numReserva = numReserva;
    }
    
    public void setDataVoo(String dataVoo){
        this.dataVoo = dataVoo;
    }
    
    public void setHoraVoo(String horaVoo){
        this.horaVoo = horaVoo;
    }
    
    public void setPreco(float preco){
        this.preco = preco;
    }
    
    public void setClasseVoo(String classeVoo){
        this.classeVoo = classeVoo;
    }
    
    public void setIdaEvolta(boolean idaEvolta){
        this.idaEvolta = idaEvolta;
    }
    
    public void setPoltrona(int poltrona){
        this.poltrona = poltrona;
    }
    
    public void setVolta(Reserva volta){
        this.volta = volta;
        this.idaEvolta = true;
    }
    
    public Cidade getOrigem(){
        return origem;
    }
    
    public void setOrigem(Cidade origem){
        this.origem = origem;
    }
    
    public Cidade getDestino(){
        return destino;
    }
    
    public void setDestino(Cidade destino){
        this.destino = destino;
        
    }
    
    public String toString(){
        String idavolta;
        idavolta = idaEvolta ? "Sim" : "Não";
        String reserva = "";
        
        reserva += "\nNúmero da Reserva: " + this.numReserva;
        reserva += "\nData: "+ this.dataVoo;
        reserva += "\nHorario: "+this.horaVoo;
        reserva += "\nClasse: " +this.classeVoo;
        reserva += "\nPoltrona: "+this.poltrona;
        reserva += "\nIda e volta?(Sim/Nao): " + idavolta;
        reserva += "\nPreco total: " +this.preco;
         
        return reserva;
    }
    
    public boolean equals(Object o){
        Reserva r;
        if(o instanceof Reserva){
            r = (Reserva) o;
            if(numReserva == r.getNumReserva()){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    
    
    
   
}
