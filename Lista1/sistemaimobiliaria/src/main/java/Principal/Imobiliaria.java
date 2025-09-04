/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author bela
 */
public class Imobiliaria {
    private static String nome;
    private static ArrayList<Imovel> imoveis = new ArrayList<>();

    public static void main(String[] args) {
        Imobiliaria imobiliaria = new Imobiliaria("Imobiliária");

        Imovel imovel1 = new Imovel();
        imovel1.setLargura(100);
        imovel1.setComprimento(200);
        imovel1.setPreco(1000000);

        Imovel imovel2 = new Imovel();
        imovel2.setLargura(50);
        imovel2.setComprimento(80);
        imovel2.setPreco(500000);

        Imovel imovel3 = new Imovel();
        imovel3.setLargura(120);
        imovel3.setComprimento(150);
        imovel3.setPreco(1200000);

        imobiliaria.adicionarImovel(imovel1);
        imobiliaria.adicionarImovel(imovel2);
        imobiliaria.adicionarImovel(imovel3);
        
        System.out.println(imobiliaria.toString());

        System.out.println("\nImoveis ordenados por preco: \n");
        for (Imovel imovel : imobiliaria.filtrarPorArea(5000)) {
            System.out.println(imovel.toString());
        }
        
    }
    
    public Imobiliaria(String nome) {
        this.nome = nome;
        this.imoveis = new ArrayList<>();
    }
    
    public void adicionarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }
    
    public String toString(){
        StringBuilder imobiliaria = new StringBuilder();
    
        imobiliaria.append("\nImobiliaria: ");
        imobiliaria.append("\nImaveis Disponiveis: \n");

        for (Imovel imovel : imoveis) {
            imobiliaria.append(imovel.toString());
            imobiliaria.append("\n-----------------------------\n");
    }
    
    return imobiliaria.toString();
    }
    
    public ArrayList<Imovel> filtrarPorArea(int areaMinima) {
        ArrayList<Imovel> imoveisFiltrados = new ArrayList<>();
        
        for (Imovel imovel : imoveis) {
            if (imovel.calculoarea(imovel.getComprimento(), imovel.getLargura()) >= areaMinima) {
                imoveisFiltrados.add(imovel);
            }
        }
        
        Collections.sort(imoveisFiltrados, new Comparator<Imovel>() {
            public int compare(Imovel im1, Imovel im2) {
                return Integer.compare(im1.getPreco(), im2.getPreco());
            }
        });
        
        return imoveisFiltrados;
    }
}
