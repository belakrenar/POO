/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Apresentacao;

/**
 *
 * @author bela
 */
public class CalculadoraInteiros implements IOperacoesBasicas<Integer>{
    @Override
    public Integer soma(Integer operador1, Integer operador2){
        return operador1 + operador2;
    }
    
    @Override
    public Integer subtracao(Integer operador1, Integer operador2){
        return operador1 - operador2;
    }
}
