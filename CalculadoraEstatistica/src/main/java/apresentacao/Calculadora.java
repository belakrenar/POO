/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author bela
 */
public class Calculadora extends JFrame{
    private JTextField caixaTexto;
    private TabelaResultados tabelaResultados;

    public Calculadora() {
        setTitle("Calculadora Estatística");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 300);
        
        JPanel painel = new JPanel();
        setContentPane(painel);
        painel.setLayout(null);

        JLabel infoCaixaTexto = new JLabel("Digite um valor:");
        infoCaixaTexto.setBounds(30, 30, 200, 15);
        painel.add(infoCaixaTexto);

        caixaTexto = new JTextField();
        caixaTexto.setBounds(30, 50, 200, 20);
        painel.add(caixaTexto);

        JButton botaoAdicionar = new JButton("Adicionar");
        botaoAdicionar.setBounds(77, 94, 117, 25);
        botaoAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int valor = Integer.parseInt(caixaTexto.getText());
                CalculadoraEstatistica.getInstance().adicionarValor(valor);
                tabelaResultados.atualizar();
                caixaTexto.setText("");
            }
        });
        painel.add(botaoAdicionar);

        JButton botaoLimpar = new JButton("Limpar");
        botaoLimpar.setBounds(77, 136, 117, 25);
        botaoLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculadoraEstatistica.getInstance().limpar();
                tabelaResultados.atualizar();
            }
        });
        painel.add(botaoLimpar);
        
        JScrollPane painelScroll = new JScrollPane();
        painelScroll.setBounds(10, 10, 880, 50);
        painel.add(painelScroll);
        
        tabelaResultados = new TabelaResultados();
        JTable tabela = new JTable(tabelaResultados);
        painelScroll.setViewportView(tabela);
    }

    public static void main(String[] args) {
        Calculadora frame = new Calculadora();
        frame.setVisible(true);
    }
}
