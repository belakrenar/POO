/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author bela
 */
public class CalculadoraEstatistica implements ISequencia{
    private static CalculadoraEstatistica instance = null;
    private List<Integer> sequencia = new LinkedList<>();

    private CalculadoraEstatistica() {}

    public static CalculadoraEstatistica getInstance() {
        if (instance == null) {
            instance = new CalculadoraEstatistica();
        }
        return instance;
    }

    public void adicionarValor(int valor) {
        sequencia.add(valor);
    }

    public void limpar() {
        sequencia.clear();
    }
}
