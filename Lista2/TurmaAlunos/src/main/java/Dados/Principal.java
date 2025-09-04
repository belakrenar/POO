/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Dados;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author bela
 */
public class Principal {

    public static void main(String[] args) {
        Turma turma = new Turma();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu\n1. Adicionar um aluno\n2. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite os dados do aluno:");
                    System.out.print("\nNome: ");
                    String nome = scanner.nextLine();
                    System.out.print("\nIdade: ");
                    int idade = scanner.nextInt();
                    double[] notas = new double[5];
                    System.out.print("\n");
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Nota " + (i + 1) + ": ");
                        notas[i] = scanner.nextDouble();
                    }
                    scanner.nextLine();
                    Aluno aluno = new Aluno();
                    aluno.setIdade(idade);
                    aluno.setNome(nome);
                    aluno.setNotas(notas);
                    turma.adicionarAluno(aluno);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }

        } while (opcao != 2);

        List<Equipe> equipes = turma.separarEmEquipes();
        System.out.println("Equipes formadas:");
        for (Equipe equipe : equipes) {
            System.out.println(equipe);
        }

        scanner.close();
    }
    }

