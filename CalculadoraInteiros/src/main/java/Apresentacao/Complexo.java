/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Apresentacao;
import java.util.Random;
/**
 *
 * @author bela
 */
public class Complexo {
    private int real;
    private int imaginaria;

    public Complexo(int real, int imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public Complexo() {
        Random r = new Random();
        real = r.nextInt(100);
        imaginaria = r.nextInt(100);
    }

    public int getReal() {
        return this.real;
    }
    
    public void setReal(int real){
        this.real = real;
    }

    public int getImaginaria() {
        return this.imaginaria;
    }
    
    public void setImaginaria(int imaginaria){
        this.imaginaria = imaginaria;
    }

    public String toString() {
        return "(" + real + " + " + imaginaria + "i" + ")";
    }
}
