/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;


import java.util.LinkedList;
import java.util.List;
import dados.Contato;
import exceptions.ErroNaLeituraException;
import exceptions.ErroNaGravacaoException;

/**
 *
 * @author bela
 */
public class ArquivoContatoDAO {
    private final EditorTexto arquivo = new EditorTexto();
    private final String caminho = "files/contatos.csv";

    private String toCSV(Contato contato) {
        return contato.getNome() + "," + contato.getTelefone();
    }

    private Contato fromCSV(String linha) {
        String[] atributos = linha.split(",");
        Contato contato = new Contato();
        contato.setNome(atributos[0]);
        contato.setTelefone(Integer.parseInt(atributos[1]));
        return contato;
    }

    public List<Contato> lerContatos() throws ErroNaLeituraException {
        List<String> linhas = arquivo.leTexto(caminho);
        List<Contato> contatos = new LinkedList<>();
        for (String linha : linhas) {
            contatos.add(fromCSV(linha));
        }
        return contatos;
    }

    public void salvarContatos(List<Contato> contatos) throws ErroNaGravacaoException {
        List<String> linhas = new LinkedList<>();
        for (Contato contato : contatos) {
            linhas.add(toCSV(contato));
        }
        arquivo.gravaTexto(caminho, linhas);
    }
}
