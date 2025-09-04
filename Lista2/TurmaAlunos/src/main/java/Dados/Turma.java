/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author bela
 */
public class Turma {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        getAlunos().add(aluno);
    }

    public void ordenarAlunosPorMedia() {
        Collections.sort(getAlunos(), Comparator.comparing(Aluno::getMedia));
    }

    public List<Equipe<Aluno>> separarEmEquipes() {
        ordenarAlunosPorMedia();
        List<Equipe<Aluno>> equipess = new ArrayList<>();

        for (int i = 0; i < getAlunos().size(); i += 3) {
            Equipe equipe = new Equipe();
            for (int j = 0; j < 3 && (i + j) < getAlunos().size(); j++) {
                equipes.adicionarAluno(getAlunos().get(i + j));
            }
            equipess.add(equipe);
        }

        return equipes;
    }

    /**
     * @return the alunos
     */
    public List<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
