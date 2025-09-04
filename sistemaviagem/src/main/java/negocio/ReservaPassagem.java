/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;
import dados.Cidade;
import dados.Cliente;
import dados.Reserva;
/**
 *
 * @author bela
 */
public class ReservaPassagem {
    private Cidade listaDeCidades[] = new Cidade[20];
    private Cliente listaDeClientes[] = new Cliente[20];
    private int quantCidades = 0;
    private int quantClientes = 0;
    private int proximoNumReserva = 1;
    
    public int getQuantCidades(){
        return quantCidades;
    }
    
    public int getQuantClientes(){
        return quantClientes;
    }
    
    public void cadastrarCidade(Cidade cidade){
        if(quantCidades < listaDeCidades.length){
            listaDeCidades[quantCidades] = cidade;
            quantCidades++;
        }
    }
    
    public void cadastrarCliente(Cliente cliente){
        if(quantClientes < listaDeClientes.length){
            listaDeClientes[quantClientes] = cliente;
            quantClientes++;
        }
    }
    
    private boolean clienteCadastrado(Cliente cliente){
        for(int i = 0;i<quantClientes;i++){
            if(listaDeClientes[i].equals(cliente)){
                return true;
            }
        }
        return false;
    }
    
    public Reserva[] mostrarReservas(long cpf){
        for(int i = 0;i<quantClientes;i++){
            if(listaDeClientes[i].getCpf() == cpf){
                return listaDeClientes[i].getReservas();
            }
        }
        return null;
    }
    
    public void reservarIda(Cliente cliente, Reserva reserva){
        if(clienteCadastrado(cliente)){
            reserva.setNumReserva(proximoNumReserva++);
            cliente.reservarIda(reserva);
        }
        else{
            System.out.println("Cliente nao cadastrado.");
        }
    }
    
    public void reservarVolta(Cliente cliente, Reserva ida, Reserva volta){
        if(clienteCadastrado(cliente)){
            volta.setNumReserva(proximoNumReserva++);
            cliente.reservarVolta(ida, volta);
        }
        else{
            System.out.println("Cliente nao cadastrado.");
        }
    }
    
    public Cliente[] mostrarClientes(){
        return listaDeClientes;
    }
    
    public Cidade[] mostrarCidades(){
        return listaDeCidades;
    }    
    
}
