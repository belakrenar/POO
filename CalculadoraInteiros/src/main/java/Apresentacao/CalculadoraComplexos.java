/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Apresentacao;

/**
 *
 * @author bela
 */
public class CalculadoraComplexos implements IOperacoesBasicas<Complexo>{
    @Override
    public Complexo soma(Complexo operador1, Complexo operador2) {
        return new Complexo(operador1.getReal() + operador2.getReal(),
                operador1.getImaginaria() + operador2.getImaginaria());
    }

    @Override
    public Complexo subtracao(Complexo operador1, Complexo operador2) {
        return new Complexo(operador1.getReal() - operador2.getReal(),
                operador1.getImaginaria() - operador2.getImaginaria());
    }
    
}
