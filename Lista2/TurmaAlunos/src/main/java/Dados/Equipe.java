/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author bela
 */
public class Equipe<T>{
    private List<T> alunos = new ArrayList<>();

    public void adicionarAluno(T objeto) {
        alunos.add(objeto);
    }

    public List<T> getAlunos() {
        return alunos;
    }

    public String toString() {
        return "Equipe: " + alunos.toString();
    }
}
