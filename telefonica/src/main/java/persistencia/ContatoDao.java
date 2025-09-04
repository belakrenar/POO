/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import dados.Contato;
import exceptions.ContatoJaCadastradoException;
import exceptions.ContatoNaoCadastradoException;
import exceptions.ErroNaGravacaoException;
import exceptions.ErroNaLeituraException;

/**
 *
 * @author bela
 */
public class ContatoDao {
    private final ArquivoContatoDAO arquivoContatoDAO = new ArquivoContatoDAO();

    public void insert(Contato contato) throws ContatoJaCadastradoException, ErroNaLeituraException, ErroNaGravacaoException {
        List<Contato> contatos = arquivoContatoDAO.lerContatos();
        if (contatos.stream().noneMatch(c -> c.equals(contato))) {
            contatos.add(contato);
            arquivoContatoDAO.salvarContatos(contatos);
        } else {
            throw new ContatoJaCadastradoException();
        }
    }

    public void delete(Contato contato) throws ContatoNaoCadastradoException, ErroNaLeituraException, ErroNaGravacaoException {
        List<Contato> contatos = arquivoContatoDAO.lerContatos();
        if (contatos.removeIf(c -> c.equals(contato))) {
            arquivoContatoDAO.salvarContatos(contatos);
        } else {
            throw new ContatoNaoCadastradoException();
        }
    }

    public Map<Character, List<Contato>> getAll() throws ErroNaLeituraException {
        Map<Character, List<Contato>> contatosPorInicial = new HashMap<>();
        for (char i = 'A'; i <= 'Z'; i++) {
            contatosPorInicial.put(i, new LinkedList<>());
        }
        for (Contato contato : arquivoContatoDAO.lerContatos()) {
            char inicial = Character.toUpperCase(contato.getNome().charAt(0));
            contatosPorInicial.get(inicial).add(contato);
        }
        return contatosPorInicial;
    }
}
