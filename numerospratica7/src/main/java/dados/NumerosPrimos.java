/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

/**
 *
 * @author bela
 */
public class NumerosPrimos extends Gerador{
    public void gerar(int n) {

        for (int i = 2, cont = 0; cont != n; i++) {
            if (primo(i)) {
                sequencia.add(i);
                cont++;
            }
        }

    }

    public boolean primo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
