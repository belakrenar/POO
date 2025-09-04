/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
public class Multiplicacao extends Soma{
    public int executar(int valor1, int valor2){
        int result = 0;
        
        for(int i = 0;i < valor2;i++){
            result = super.executar(result, valor1);
        }
        
        return result;
    }
}
