/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import Dados.Animal;
import Dados.Cachorro;
import Dados.Ovelha;
import Dados.Vaca;

/**
 *
 * @author bela
 */
public class Principal {

    public static void main(String[] args) {
        Animal cachorro1 = new Cachorro("Rex");
        Animal cachorro2 = new Cachorro("Mel");

        Animal vaca1 = new Vaca("Gertrude");
        Animal vaca2 = new Vaca("Estrela");
        
        Animal ovelha1 = new Ovelha("Ester");
        Animal ovelha2 = new Ovelha("Fofucha");

        System.out.println(cachorro1.emitirSom());
        System.out.println(cachorro2.emitirSom());

        System.out.println(vaca1.emitirSom());
        System.out.println(vaca2.emitirSom());
        
        System.out.println(ovelha1.emitirSom());
        System.out.println(ovelha2.emitirSom());

    }
}
