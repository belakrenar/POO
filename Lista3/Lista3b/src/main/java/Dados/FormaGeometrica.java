/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
public abstract class FormaGeometrica {
    protected int medida1;
    protected int medida2;

    /**
     * @return the medida1
     */
    public int getMedida1() {
        return medida1;
    }

    /**
     * @param medida1 the medida1 to set
     */
    public void setMedida1(int medida1) {
        this.medida1 = medida1;
    }

    /**
     * @return the medida2
     */
    public int getMedida2() {
        return medida2;
    }

    /**
     * @param medida2 the medida2 to set
     */
    public void setMedida2(int medida2) {
        this.medida2 = medida2;
    }
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
