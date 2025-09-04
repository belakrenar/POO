/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;
import Dados.*;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
/**
 *
 * @author bela
 */
public class SistemaArquivos {
    private Map<String, List<Arquivo>> diretorios;

    public SistemaArquivos() {
        this.diretorios = new HashMap<>();
    }

    public void criarDocumento(String diretorio, String nome, String texto) throws NomeInvalidoException {
        adicionarArquivo(diretorio, new Documento(nome, texto));
    }

    public void criarMusica(String diretorio, String nome, int duracao) throws NomeInvalidoException {
        adicionarArquivo(diretorio, new Musica(nome, duracao));
    }

    public void criarVideo(String diretorio, String nome, Video.Qualidade qualidade) throws NomeInvalidoException {
        adicionarArquivo(diretorio, new Video(nome, qualidade));
    }

    private void adicionarArquivo(String diretorio, Arquivo arquivo) {
        diretorios.computeIfAbsent(diretorio, k -> new ArrayList<>()).add(arquivo);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<Arquivo>> entry : diretorios.entrySet()) {
            sb.append(entry.getKey()).append(":\n");
            for (Arquivo arquivo : entry.getValue()) {
                sb.append(arquivo).append("\n");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
