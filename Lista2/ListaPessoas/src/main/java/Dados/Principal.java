/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Dados;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author bela
 */
public class Principal {
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) {
        String arquivo = "/home/bela/NetBeansProjects/MinhasAtividadesPOO/Lista2/ListaPessoas/arquivolista2.txt";
        lerArquivo(arquivo);
        mostraPessoas();
    }
    
    public static void lerArquivo(String arquivo){
        Scanner sc;
        try {
            sc = new Scanner(new File(arquivo));
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                if (linha.equals("-1")) {
                    break;
                }
                String[] dados = linha.split(",");
                Pessoa pessoa = new Pessoa();
                pessoa.setNome(dados[0].trim());
                pessoa.setIdade(Integer.parseInt(dados[1].trim()));
                pessoa.setCpf(Long.parseLong(dados[2].trim()));
                pessoa.setCidade(dados[3].trim());
                pessoas.add(pessoa);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado");
        }
    }
    
    public static void mostraPessoas() {
        Collections.sort(pessoas, Comparator.comparing(Pessoa::getIdade));
        
        for (Pessoa pessoa : pessoas) {
            String faixaEtaria;
            if (pessoa.getIdade() <= 12) {
                faixaEtaria = "Criancas";
            } else if (pessoa.getIdade() <= 18) {
                faixaEtaria = "Adolescentes";
            } else if (pessoa.getIdade() <= 25) {
                faixaEtaria = "Jovens";
            } else if (pessoa.getIdade() <= 59) {
                faixaEtaria = "Adultos";
            } else {
                faixaEtaria = "Idosos";
            }
            //System.out.println(faixaEtaria + ": ");
            //System.out.println(pessoa + "\n");
            pessoa.setFaixaet(faixaEtaria);
        }
        
        for(Pessoa p : pessoas){
            
            if(p.getFaixaet()=="Criancas"){
                System.out.print(p);
            }
        }
    }
}
