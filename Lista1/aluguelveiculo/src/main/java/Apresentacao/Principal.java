/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Apresentacao;

import java.util.ArrayList;
import Dados.Carro;
import Dados.Cliente;
import Dados.Reserva;
import Negocio.ReservaCarro;
import java.util.Scanner;


/**
 *
 * @author bela
 */
public class Principal {
    private static Scanner leitor = new Scanner(System.in);
    private static ArrayList<Carro> carros = new ArrayList<>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static Cliente clientelogado = null;

    public static void main(String[] args) {
        ListaDeCarros();
        menu();
    }
    
    public static void ListaDeCarros(){
        Carro carro1 = new Carro();
        carro1.setGrupo("A");
        carro1.setModelo("FIAT MOBI");
        carro1.setArCondicionado(false);
        carro1.setAutomatico(false);
        carro1.setPassageiros(5);
        carro1.setBagagem(1);
        
        Carro carro2 = new Carro();
        carro2.setGrupo("A");
        carro2.setModelo("RENAULT KWID");
        carro2.setArCondicionado(false);
        carro2.setAutomatico(false);
        carro2.setPassageiros(5);
        carro2.setBagagem(1);
        
        Carro carro3 = new Carro();
        carro3.setGrupo("B");
        carro3.setModelo("VOLKSWAGEN GOL");
        carro3.setArCondicionado(true);
        carro3.setAutomatico(true);
        carro3.setPassageiros(5);
        carro3.setBagagem(1);
        
        Carro carro4 = new Carro();
        carro4.setGrupo("B");
        carro4.setModelo("FIAT ARGO");
        carro4.setArCondicionado(true);
        carro4.setAutomatico(true);
        carro4.setPassageiros(5);
        carro4.setBagagem(1);
        
        Carro carro5 = new Carro();
        carro5.setGrupo("C");
        carro5.setModelo("FIAT CRONOS");
        carro5.setArCondicionado(true);
        carro5.setAutomatico(true);
        carro5.setPassageiros(5);
        carro5.setBagagem(2);
        
        Carro carro6 = new Carro();
        carro6.setGrupo("C");
        carro6.setModelo("HYUNDAI HB20s");
        carro6.setArCondicionado(true);
        carro6.setAutomatico(true);
        carro6.setPassageiros(5);
        carro6.setBagagem(2);
        
        Carro carro7 = new Carro();
        carro7.setGrupo("D");
        carro7.setModelo("JEEP RENEGADE");
        carro7.setArCondicionado(true);
        carro7.setAutomatico(true);
        carro7.setPassageiros(5);
        carro7.setBagagem(3);
        
        Carro carro8 = new Carro();
        carro8.setGrupo("D");
        carro8.setModelo("VOLKSWAGEN T-CROSS");
        carro8.setArCondicionado(true);
        carro8.setAutomatico(true);
        carro8.setPassageiros(5);
        carro8.setBagagem(3);
        
        Carro carro9 = new Carro();
        carro9.setGrupo("L");
        carro9.setModelo("AUDI A3");
        carro9.setArCondicionado(true);
        carro9.setAutomatico(true);
        carro9.setPassageiros(5);
        carro9.setBagagem(2);
        
        Carro carro0 = new Carro();
        carro0.setGrupo("L");
        carro0.setModelo("BMW M3");
        carro0.setArCondicionado(true);
        carro0.setAutomatico(true);
        carro0.setPassageiros(5);
        carro0.setBagagem(2);
        
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(carro4);
        carros.add(carro5);
        carros.add(carro6);
        carros.add(carro7);
        carros.add(carro8);
        carros.add(carro9);
        carros.add(carro0);
        
    }
    
    public static void ListarCarros() {
        
        for (Carro carro : carros) {
            System.out.println(carro.toString());
            System.out.println("-----------------------------\n");
        }
    }
    
    public static void RegistrarCliente(){
        System.out.println("\nDigite o nome: ");
        String nome = leitor.nextLine();

        System.out.print("\nDigite o CPF: \n");
        long cpf = leitor.nextLong();
        leitor.nextLine();

        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == cpf) {
                System.out.println("\nCliente ja cadastrado. Faca login.\n");
                return;
            }
        }

        Cliente novoCliente = new Cliente();
        novoCliente.setNome(nome);
        novoCliente.setCpf(cpf);

        System.out.print("\nDigite o telefone: \n");
        String telefone = leitor.nextLine();
        novoCliente.setTelefone(telefone);

        System.out.print("\nDigite a localizacao: \n");
        String localizacao = leitor.nextLine();
        novoCliente.setLocalizacao(localizacao);

        clientes.add(novoCliente);
        System.out.println("\nCliente registrado com sucesso!");
        
    }
    
    public static void login(){
        System.out.println("\nDigite o nome do usuario: ");
        String nome = leitor.nextLine();
        
        System.out.println("\nDigite o CPF: ");
        long cpf = leitor.nextLong();
        leitor.nextLine();
        
        for(Cliente cliente : clientes){
            if(cliente.getCpf() == cpf && nome.equals(cliente.getNome())){
                clientelogado = cliente;
                System.out.println("\nLogin realizado com sucesso.\n");
                return;
            }
        }
        
        System.out.println("\nUsuario incorreto ou CPF nao cadastrado. Registre-se\n");
    }
 
    public static void fazerReserva(){
        
        System.out.println("\nDigite o modelo do carro que voce deseja reservar: \n");
        String carronome = leitor.nextLine();

        Carro carroescolhido = null;

        for (Carro carro : carros) {
            if (carronome.equalsIgnoreCase(carro.getModelo())) { 
                carroescolhido = carro;
                break;
            }
        }

        if (carroescolhido == null) {
            System.out.println("\nCarro nao encontrado.\n");
  
        }
                
        Reserva novaReserva = new Reserva();
        
            novaReserva.setNumReserva(clientelogado.getQuantReservas() + 1);
        
        System.out.print("\nDigite a quantidade de dias da reserva: \n");
        int dias = leitor.nextInt();
        novaReserva.setDias(dias);

        leitor.nextLine();
        System.out.print("\nDigite a data de retirada: \n");
        String dataRetirada = leitor.nextLine();
        novaReserva.setDataRetirada(dataRetirada);

        System.out.print("\nDigite o horario de retirada: \n");
        String horarioRetirada = leitor.nextLine();
        novaReserva.setHorarioRetirada(horarioRetirada);

        System.out.print("\nDigite a data de devolucao: \n");
        String dataDevolucao = leitor.nextLine();
        novaReserva.setDataDevolucao(dataDevolucao);

        System.out.print("\nDigite o horario de devolucao: \n");
        String horarioDevolucao = leitor.nextLine();
        novaReserva.setHorarioDevolucao(horarioDevolucao);
        
        ReservaCarro reservaCarro = new ReservaCarro();
        int valortotal = reservaCarro.calcularValor(novaReserva, carroescolhido);

        System.out.println("\nValor total da reserva: R$" + valortotal);
        System.out.println("\nConfirmar reserva? (sim/nao)\n");
        String resposta = leitor.nextLine();
        
        if(resposta.equalsIgnoreCase("sim")){
        novaReserva.setPreco(valortotal);
        novaReserva.setCarro(carroescolhido);
        clientelogado.adicionarReserva(novaReserva);
        
        System.out.println("\nReserva realizada com sucesso.\n");
        }else{
            System.out.println("\nReserva cancelada.\n");
        }
    }
    
    public static void mostrapreco(Reserva reserva){
        System.out.println("Preco da reserva: R$" + reserva.getPreco() + "\n");
    }
    
    public static void MinhasReservas() {
        System.out.println("\nMinhas Reservas:\n");
        ArrayList<Reserva> reservas = clientelogado.getReservas(); 

    if (reservas.isEmpty()) {
        System.out.println("\nVoce nao possui reservas.\n");
    } else {
        for (Reserva reserva : reservas) {
            System.out.println(reserva.toString());
            mostrapreco(reserva);
            System.out.println("-----------------------------");
        }
    }
    }
    
    public static void MostrarClienteLogado(){
        if(clientelogado != null){
            System.out.println(clientelogado.toString());
        }
    }
    
    public static void menu(){
        int opcao = -1;
        
        while(opcao != 0){
            System.out.println("\nEscolha uma opcao:");
            System.out.println("\n0 - Encerrar");
            System.out.println("\n1 - Fazer registro");
            System.out.println("\n2 - Login");
            System.out.println("\n");
            
            opcao = leitor.nextInt();
            leitor.nextLine();
            
            switch(opcao){
                case 0:
                    break;
                case 1:
                    System.out.println("\nVoce escolheu a opcao fazer registro. \n");
                    RegistrarCliente();
                    break;
                case 2:
                    login();
                    if(clientelogado != null){
                        int opcaoo = -1;
                        while(opcaoo != 0){
                            System.out.println("\nEscolha uma opcao:");
                            System.out.println("\n0 - Retornar ao menu principal");
                            System.out.println("\n1 - Fazer reserva");
                            System.out.println("\n2 - Ver minhas reservas");
                            System.out.println("\n3 - Minha conta");
                            System.out.println("\n");
                            
                            opcaoo = leitor.nextInt();
                            leitor.nextLine();
                            
                            switch(opcaoo){
                                case 0:
                                    break;
                                case 1:
                                    System.out.println("\nVoce escolheu fazer uma reserva.\n");
                                    System.out.println("\nCARROS DISPONIVEIS: \n");
                                    ListarCarros();
                                    fazerReserva();
                                    break;
                                case 2:
                                    MinhasReservas();
                                    break;
                                case 3:
                                    System.out.println("\nSeu perfil: \n");
                                    MostrarClienteLogado();
                                    break;
                                default:
                                    System.out.println("\nOpcao invalida. Tente novamente.\n");
                                    break;
                                    
                            }
                        }
                    }
                default:
                    System.out.println("\nOpcao invalida. Tente novamente.\n");
                    break;
            }
        }
    }
}
