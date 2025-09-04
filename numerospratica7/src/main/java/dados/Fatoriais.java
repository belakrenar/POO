/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

/**
 *
 * @author bela
 */
public class Fatoriais extends Gerador{
    public void gerar(int n) {

        sequencia.add(1);

        for (int i = 1; i <= n; i++) {
            sequencia.add(sequencia.get(i - 1) * (i + 1));
        }

    }
}
