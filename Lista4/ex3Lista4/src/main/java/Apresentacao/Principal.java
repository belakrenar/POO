/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Apresentacao;
import Dados.*;
import Negocio.*;
/**
 *
 * @author bela
 */
public class Principal {

    public static void main(String[] args) {
        SistemaArquivos sistema = new SistemaArquivos();

        try {
            sistema.criarDocumento("Downloads", "ListaDeCompras", "Texto do documento");
            sistema.criarMusica("Downloads", "ImagineDragonsRadioactive", 276);
            sistema.criarVideo("Downloads", "HIMYMS01E01", Video.Qualidade.P1080);
            sistema.criarDocumento("AreaDeTrabalho", "ResumoPOO2024", "Texto do resumo");
            sistema.criarDocumento("AreaDeTrabalho", "NotasPOO2024", "Texto das notas");

            System.out.println(sistema);
        } catch (NomeInvalidoException e) {
            System.err.println(e.getMessage());
        }
    }
}
