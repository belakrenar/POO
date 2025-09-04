/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
public class MDC implements IOperacaoInteira{
    public int executar(int valor1, int valor2){
        int a = valor1;
        int b = valor2;
        while (b != 0) {
            int resto = a;
            while (resto >= b) {
                resto -= b;
            }
            a = b;
            b = resto;
        }
        return a;
        }
}
