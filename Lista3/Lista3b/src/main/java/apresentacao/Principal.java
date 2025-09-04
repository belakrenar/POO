/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;
import Dados.Circulo;
import Dados.Losango;
import Dados.TrianguloEquilatero;


/**
 *
 * @author bela
 */
public class Principal {

    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.setRaio(7);

        Circulo c2 = new Circulo();
        c2.setRaio(14);

        TrianguloEquilatero t1 = new TrianguloEquilatero();
        t1.setLado(5);

        TrianguloEquilatero t2 = new TrianguloEquilatero();
        t2.setLado(10);

        Losango l1 = new Losango();
        l1.setDiagonal1(8);
        l1.setDiagonal2(6);

        Losango l2 = new Losango();
        l2.setDiagonal1(10);
        l2.setDiagonal2(12);

        System.out.println("Circulo 1:");
        System.out.println(c1);

        System.out.println("\nCirculo 2:");
        System.out.println(c2);

        System.out.println("\nTriangulo 1:");
        System.out.println(t1);

        System.out.println("\nTriangulo 2:");
        System.out.println(t2);

        System.out.println("\nLosango 1:");
        System.out.println(l1);

        System.out.println("\nLosango 2:");
        System.out.println(l2);
    }

}
