/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
public class Mod implements IOperacaoInteira{
    public int executar(int valor1, int valor2){
        int resto = valor1;
        while(resto >= valor2){
            resto -= valor2;
        }
        return resto;
    }
}
