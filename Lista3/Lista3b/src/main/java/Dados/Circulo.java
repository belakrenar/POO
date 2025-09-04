/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
public class Circulo extends FormaGeometrica{
    private int raio;
    private int diametro;

    /**
     * @param raio the raio to set
     */
    public void setRaio(int raio) {
        this.medida1 = raio;
    }

    /**
     * @param diametro the diametro to set
     */
    public void setDiametro(int raio) {
        this.medida2 = 2*raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(medida1, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * medida1;
    }
    
    public String toString() {
        String circulo = "";
        
        circulo += "\nRaio: "+ this.medida1;
        circulo += "\nDiametro: " + this.medida2;
        circulo += "\nArea: "+ calcularArea();
        circulo += "\nPerimetro: " + calcularPerimetro();
        
        return circulo;
    }
    
}
