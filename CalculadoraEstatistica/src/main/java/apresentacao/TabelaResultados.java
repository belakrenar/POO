/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;
import javax.swing.table.AbstractTableModel;
import dados.CalculadoraEstatistica;

/**
 *
 * @author bela
 */
public class TabelaResultados extends AbstractTableModel{
    private CalculadoraEstatistica calculadora = CalculadoraEstatistica.getInstance();
    private String[] colunas = { "Sorteado", "Somatório", "Média Aritmética", "Média Geométrica", "Variância", "Desvio Padrão", "Amplitude" };

    public int getColumnCount() {
        return colunas.length;
    }

    public int getRowCount() {
        return 1;
    }

    public Object getValueAt(int linha, int coluna) {
        if (!calculadora.getValores().isEmpty()) {
            switch (coluna) {
                case 0: return calculadora.sorteio();
                case 1: return calculadora.somatorio();
                case 2: return calculadora.mediaAritmetica();
                case 3: return calculadora.mediaGeometrica();
                case 4: return calculadora.variancia();
                case 5: return calculadora.desvioPadrao();
                case 6: return calculadora.amplitude();
            }
        }
        return "-";
    }

    public String getColumnName(int coluna) {
        return colunas[coluna];
    }

    public void atualizar() {
        fireTableStructureChanged();
    }

}
