/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author bela
 */
public class Sorteador {
    private ArrayList<Pessoa> pessoas;

    public Sorteador(ArrayList<Pessoa> pessoas) {
        this.pessoas = new ArrayList<>(pessoas);
    }

    public Pessoa sortearProximo() {
        if (pessoas.isEmpty()) {
            return null;
        }
        Random random = new Random();
        int index = random.nextInt(pessoas.size());
        return pessoas.remove(index);
    }

    public boolean temPessoas() {
        return !pessoas.isEmpty();
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Isabela");
        pessoa1.setIdade(22);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Joao");
        pessoa2.setIdade(28);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Pedro");
        pessoa3.setIdade(35);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        Sorteador sorteador = new Sorteador(listaDePessoas);

        while (sorteador.temPessoas()) {
            Pessoa sorteada = sorteador.sortearProximo();
            System.out.println("Pessoa sorteada: " + sorteada.toString());
            System.out.println("-----------------------------");
        }

        System.out.println("Não ha mais pessoas para sortear.");
    }
}
