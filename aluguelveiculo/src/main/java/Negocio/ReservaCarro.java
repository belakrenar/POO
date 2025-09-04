/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Dados.Cliente;
import Dados.Carro;
import Dados.Reserva;
import Dados.Cliente;

/**
 *
 * @author bela
 */
public class ReservaCarro {
    
    
    public int valorGrupos(Carro carro){
        String grupoA = "A"; //hatch basico
        String grupoB = "B"; //hatch completo
        String grupoC = "C"; //sedan intermediario
        String grupoD = "D"; //suv top
        String grupoL = "L"; //carro de luxo
        
        if(carro.getGrupo().equalsIgnoreCase(grupoA)){
            return 100;
        }
        if(carro.getGrupo().equalsIgnoreCase(grupoB)){
            return 130;
        }
        if(carro.getGrupo().equalsIgnoreCase(grupoC)){
            return 175;
        }
        if(carro.getGrupo().equalsIgnoreCase(grupoD)){
            return 250;
        }
        if(carro.getGrupo().equalsIgnoreCase(grupoL)){
            return 400;
        }
        return 0;
    }
    
    public int calcularValor(Reserva reserva, Carro carro){
        int diaria = 100;
        int valortotal = 0;
        
        valortotal = diaria*reserva.getDias() + valorGrupos(carro);
        
        return valortotal;

    }
    
}
