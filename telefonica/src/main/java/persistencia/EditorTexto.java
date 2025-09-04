/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import exceptions.ErroNaGravacaoException;
import exceptions.ErroNaLeituraException;


/**
 *
 * @author bela
 */
public class EditorTexto {
    public List<String> leTexto(String caminho) throws ErroNaLeituraException {
        List<String> dados = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                dados.add(linha);
            }
        } catch (IOException e) {
            throw new ErroNaLeituraException("Erro ao ler o arquivo: " + caminho, e);
        }
        return dados;
    }

    public void gravaTexto(String caminho, List<String> dados) throws ErroNaGravacaoException {
        try (FileWriter arquivo = new FileWriter(caminho)) {
            for (String linha : dados) {
                arquivo.write(linha + "\n");
            }
        } catch (IOException e) {
            throw new ErroNaGravacaoException("Erro ao gravar no arquivo: " + caminho, e);
        }
    }
}