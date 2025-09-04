/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
public class Losango extends FormaGeometrica{
    private int diagonal1;
    private int diagonal2;

    /**
     * @param diagonal1 the diagonal1 to set
     */
    public void setDiagonal1(int diagonal1) {
        this.medida1 = diagonal1;
    }

    /**
     * @param diagonal2 the diagonal2 to set
     */
    public void setDiagonal2(int diagonal2) {
        this.medida2 = diagonal2;
    }

    public double calcularArea() {
        return (medida1 * medida2) / 2;
    }

    public double calcularPerimetro() {
        double lado = Math.sqrt((medida1 / 2) * (medida1 / 2) + (medida2 / 2) * (medida2 / 2));
        return 4 * lado;
    }
    
    public String toString() {
        String losango = "";
        
        losango += "\nDiagonais: "+this.medida1 + this.medida2;
        losango += "\nArea: "+ calcularArea();
        losango += "\nPerimetro: " + calcularPerimetro();
        
        return losango;
    }
    
    
}
