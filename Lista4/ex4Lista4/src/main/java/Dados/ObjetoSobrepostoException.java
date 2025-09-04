    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author bela
 */
public class ObjetoSobrepostoException extends Exception{
    public ObjetoSobrepostoException(){
        super("objeto sobreposto a outro ja existente");
    }
}
