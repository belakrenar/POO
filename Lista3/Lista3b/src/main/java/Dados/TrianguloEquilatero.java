/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
public class TrianguloEquilatero extends FormaGeometrica{
    private int lado;
    
    public void setLado(int lado) {
        this.medida1 = lado;
    }

    public double calcularArea() {
        return (Math.sqrt(3) / 4) * medida1 * medida1;
    }

    public double calcularPerimetro() {
        return medida1*3;
    }
    
    public String toString() {
        String triangulo = "";
        
        triangulo += "\nLado: "+this.medida1;
        triangulo += "\nArea: "+ calcularArea();
        triangulo += "\nPerimetro: " + calcularPerimetro();
        
        return triangulo;
    }

    /**
     * @param lado the lado to set
     */
}
