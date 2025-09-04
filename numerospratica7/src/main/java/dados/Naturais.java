/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

/**
 *
 * @author bela
 */
public class Naturais extends Gerador{
    public void gerar(int n) {
        for (int i = 1; i <= n; i++) {
            sequencia.add(i);
        }
    }
}
