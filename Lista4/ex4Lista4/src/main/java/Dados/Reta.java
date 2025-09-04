/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
public class Reta {
    private double a;
    private double b;

    public Reta(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public boolean intercepta(Reta outra) {
        return this.a != outra.a;
    }

    public boolean estaNaReta(Ponto2D ponto) {
        return ponto.getY() == (a * ponto.getX() + b);
    }

    public String toString() {
        return "y = " + a + " * x + " + b;
    }
}

