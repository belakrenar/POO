/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import dados.Contato;
import java.util.Scanner;
import java.util.List;
import exceptions.*;
import java.util.stream.Collectors;
import negocio.ListaTelefonica;

/**
 *
 * @author bela
 */
public class Principal {
    private static final ListaTelefonica listaTelefonica;

    static {
        try {
            listaTelefonica = new ListaTelefonica();
        } catch (ErroNaLeituraException e) {
            throw new RuntimeException("Erro ao inicializar a lista telefônica.", e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Remover Contato");
            System.out.println("3 - Listar Contatos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> adicionarContato(scanner);
                case 2 -> removerContato(scanner);
                case 3 -> listarContatos();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void adicionarContato(Scanner scanner) {
        try {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Telefone: ");
            int telefone = scanner.nextInt();

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setTelefone(telefone);

            listaTelefonica.adicionarContato(contato);
            System.out.println("Contato adicionado com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    private static void removerContato(Scanner scanner) {
        try {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Telefone: ");
            int telefone = scanner.nextInt();

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setTelefone(telefone);

            listaTelefonica.removerContato(contato);
            System.out.println("Contato removido com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    private static void listarContatos() {
        try {
            List<Contato> contatos = listaTelefonica.listarContatos();
            if (contatos.isEmpty()) {
                System.out.println("Nenhum contato encontrado.");
            } else {
                String contatosStr = contatos.stream()
                        .map(c -> "Nome: " + c.getNome() + ", Telefone: " + c.getTelefone())
                        .collect(Collectors.joining("\n"));
                System.out.println(contatosStr);
            }
        } catch (ErroNaLeituraException e) {
            System.err.println("Erro ao listar contatos: " + e.getMessage());
        }
    }
    
}
