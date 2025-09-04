/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;


import persistencia.ContatoDao;
import dados.Contato;
import exceptions.ContatoJaCadastradoException;
import exceptions.ContatoNaoCadastradoException;
import exceptions.ErroNaLeituraException;
import exceptions.ErroNaGravacaoException;
import java.util.List;

/**
 *
 * @author bela
 */
public class ListaTelefonica {
    private final ContatoDao contatoDao = new ContatoDao();

    public ListaTelefonica() throws ErroNaLeituraException {
        contatoDao.getAll();
    }

    public void adicionarContato(Contato contato) 
            throws ContatoJaCadastradoException, ErroNaLeituraException, ErroNaGravacaoException {
        contatoDao.insert(contato);
    }

    public void removerContato(Contato contato) 
            throws ContatoNaoCadastradoException, ErroNaLeituraException, ErroNaGravacaoException {
        contatoDao.delete(contato);
    }

    public List<Contato> listarContatos() throws ErroNaLeituraException {
        return contatoDao.getAll().values().stream().flatMap(List::stream).toList();
    }
    
}