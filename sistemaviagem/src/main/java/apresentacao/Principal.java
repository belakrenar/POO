/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;
import dados.Cidade;
import dados.Cliente;
import dados.Reserva;
import negocio.ReservaPassagem;
import java.util.Scanner;

/**
 *
 * @author bela
 */
public class Principal {
    private static ReservaPassagem sistema = new ReservaPassagem();
    private static Scanner leitor = new Scanner(System.in);
    
    public static void main(String[] args){
        menu();
        
    }
    
    public static void fazerReserva(){
        mostrarClientes();
        System.out.println("\nDigite o CPF do cliente cadastrado:");
        long cpf = leitor.nextLong();
        leitor.nextLine();

        Cliente cliente = null;
        Cliente[] clientes = sistema.mostrarClientes();
        for (Cliente c : clientes) {
            if (c != null && c.getCpf() == cpf) {
                cliente = c;
                System.out.println("\nA viagem sera de ida e volta? Digite 1 para sim e 2 para nao.");
                int resposta = leitor.nextInt();
                leitor.nextLine();
                if(resposta == 1){
                    mostrarCidades();
                    System.out.println("\nDigite o nome da cidade de origem: ");
                    String nomeOrigem = leitor.nextLine();
                    System.out.println("\nDigite o nome da cidade de destino:");
                    String nomeDestino = leitor.nextLine();
                    Cidade origem = null;
                    Cidade destino = null;
                    Cidade[] cidades = sistema.mostrarCidades();
                    for (Cidade ci : cidades) {
                        if (ci != null) {
                            if (ci.getNome().equalsIgnoreCase(nomeOrigem)) {
                                origem = ci;
                            } else if (ci.getNome().equalsIgnoreCase(nomeDestino)) {
                                destino = ci;
                            }
                        }
                    }
                    if (origem == null || destino == null) {
                    System.out.println("Cidade(s) não encontrada(s).");
                    }else{
                        System.out.println("\nVOO DE IDA\n");
                        System.out.println("\nDigite a data do voo:");
                        String dataVoo = leitor.nextLine();
                        System.out.println("\nDigite a hora do voo:");
                        String horaVoo = leitor.nextLine();
                        System.out.println("\nDigite o preço da reserva:\n");
                        float preco = leitor.nextFloat();
                        leitor.nextLine();
                        System.out.println("\nDigite a classe do voo:\n");
                        String classeVoo = leitor.nextLine();
                        System.out.println("\nDigite o número da poltrona:\n");
                        int poltrona = leitor.nextInt();
                        leitor.nextLine();

                        Reserva ida = new Reserva();
                        ida.setDataVoo(dataVoo);
                        ida.setHoraVoo(horaVoo);
                        ida.setPreco(preco);
                        ida.setClasseVoo(classeVoo);
                        ida.setPoltrona(poltrona);
                        ida.setOrigem(origem);
                        ida.setDestino(destino);
                        ida.setIdaEvolta(true);
                        
                        System.out.println("\nVOO DE VOLTA\n");
                        System.out.println("\nDigite a data do voo:");
                        String dataVooVolta = leitor.nextLine();
                        System.out.println("\nDigite a hora do voo:");
                        String horaVooVolta = leitor.nextLine();
                        System.out.println("\nDigite o preço da reserva:\n");
                        float precoVolta = leitor.nextFloat();
                        leitor.nextLine();
                        System.out.println("\nDigite a classe do voo:\n");
                        String classeVooVolta = leitor.nextLine();
                        System.out.println("\nDigite o número da poltrona:\n");
                        int poltronaVolta = leitor.nextInt();
                        leitor.nextLine();

                        Reserva volta = new Reserva();
                        volta.setDataVoo(dataVooVolta);
                        volta.setHoraVoo(horaVooVolta);
                        volta.setPreco(precoVolta);
                        volta.setClasseVoo(classeVooVolta);
                        volta.setPoltrona(poltronaVolta);
                        volta.setOrigem(destino);
                        volta.setDestino(origem);
                        volta.setVolta(volta);
                        
                        sistema.reservarIda(c, ida);
                        sistema.reservarVolta(c, volta, volta.getVolta());
                        System.out.println("Reserva realizada com sucesso.");
                        
                    }

                }
                else{
                    System.out.println("\nDigite o nome da cidade de origem: ");
                    String nomeOrigem = leitor.nextLine();
                    leitor.nextLine();
                    System.out.println("\nDigite o nome da cidade de destino:");
                    String nomeDestino = leitor.nextLine();
                    leitor.nextLine();

                    Cidade origem = null;
                    Cidade destino = null;
                    Cidade[] cidades = sistema.mostrarCidades();
                    for (Cidade ci : cidades) {
                        if (ci != null) {
                            if (ci.getNome().equalsIgnoreCase(nomeOrigem)) {
                                origem = ci;
                            } else if (ci.getNome().equalsIgnoreCase(nomeDestino)) {
                                destino = ci;
                            }
                        }
                    }
                    if (origem == null || destino == null) {
                    System.out.println("Cidade(s) não encontrada(s).");
                    }else{
                        System.out.println("\nDETALHES DO VOO\n");
                        System.out.println("\nDigite a data do voo:");
                        String dataVoo = leitor.nextLine();
                        leitor.nextLine();
                        System.out.println("\nDigite a hora do voo:");
                        String horaVoo = leitor.nextLine();
                        leitor.nextLine();
                        System.out.println("\nDigite o preço da reserva:\n");
                        float preco = leitor.nextFloat();
                        leitor.nextLine();
                        System.out.println("\nDigite a classe do voo:\n");
                        String classeVoo = leitor.nextLine();
                        leitor.nextLine();
                        System.out.println("\nDigite o número da poltrona:\n");
                        int poltrona = leitor.nextInt();
                        leitor.nextLine();

                        Reserva ida = new Reserva();
                        ida.setDataVoo(dataVoo);
                        ida.setHoraVoo(horaVoo);
                        ida.setPreco(preco);
                        ida.setClasseVoo(classeVoo);
                        ida.setPoltrona(poltrona);
                        ida.setOrigem(origem);
                        ida.setDestino(destino);
                        ida.setIdaEvolta(false);
                        
                        sistema.reservarIda(c, ida);
                        System.out.println("Reserva realizada com sucesso.");
                }
                break;
            }
        }

        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
        }
        }
    }
    
public static void cadastrarCliente() {
    System.out.println("\nDigite o nome:\n");
    String nome = leitor.nextLine();
    
    System.out.println("\nDigite o CPF:\n");
    long cpf = leitor.nextLong();
    
    Cliente[] clientes = sistema.mostrarClientes();
    for (Cliente c : clientes) {
        if (c != null && c.getCpf() == cpf) {
            System.out.println("\nCPF já cadastrado.\n");
            return;
        }
    }
    
    System.out.println("\nInsira o endereco:\n");
    String endereco = leitor.nextLine();
    leitor.nextLine();
    
    System.out.println("\nDigite o telefone:\n");
    int telefone = leitor.nextInt();
    leitor.nextLine();
    
    Cliente cliente = new Cliente();
    cliente.setNome(nome);
    cliente.setCpf(cpf);
    cliente.setEndereco(endereco);
    cliente.setTelefone(telefone);
    
    sistema.cadastrarCliente(cliente);
    
    System.out.println("\nCliente cadastrado com sucesso.");
}

    public static void mostrarCidades(){
        Cidade[] cidades = sistema.mostrarCidades();
        if (cidades == null || cidades.length == 0) {
        System.out.println("\nNao ha cidades cadastradas no momento.");
    } else {
        System.out.println("\nCidades cadastradas: ");
        for (Cidade cidade : cidades){
            if (cidade != null) {
                System.out.println(cidade.toString());
            }
        }
    }
    }
    
    public static void cadastrarCidade(){
    System.out.println("\nDigite o nome da cidade:");
    String nome = leitor.nextLine();
    
    System.out.println("\nDigite o estado da cidade:");
    String estado = leitor.nextLine();
    
    Cidade cidade = new Cidade();
    cidade.setNome(nome);
    cidade.setEstado(estado);
    
    sistema.cadastrarCidade(cidade);
    
    System.out.println("\nCidade cadastrada com sucesso.");    
    }
    
    public static void mostrarClientes() {
    Cliente[] clientes = sistema.mostrarClientes();
    if (clientes == null || clientes.length == 0) {
        System.out.println("\nNenhum cliente foi cadastrado.");
    } else {
        System.out.println("\nClientes cadastrados: ");
        for (Cliente cliente : clientes) {
            if (cliente != null) {
                System.out.println(cliente.toString());
            }
        }
    }
}
    
    public static void mostrarReservas(long cpf){
        Reserva[] reservas = sistema.mostrarReservas(cpf);
        if (reservas == null) {
            System.out.println("\nCliente nao encontrado ou nao ha reservas.");
        } else {
            for (Reserva reserva : reservas) {
                if (reserva != null) {
                    System.out.println("\nReserva: " + reserva.toString());
                }
            }
        }
    }
    
    public static void menu(){
        int opcao = -1;
        while(opcao != 0 ){
        System.out.println("\nEscolha uma opcao:");
	System.out.println("\n0 - Encerrar");
	System.out.println("\n1 - Fazer reserva");
	System.out.println("\n2 - Cadastrar cliente");
	System.out.println("\n3 - Cadastrar cidade");
	System.out.println("\n4 - Mostrar Reserva");
        
        opcao = leitor.nextInt();
        leitor.nextLine();
        
        switch(opcao){
                case 0:
                    break;
                case 1:
                    System.out.println("\nVoce escolheu a opcao fazer uma reserva.\n");
                    fazerReserva();
                    break;
                case 2:
                    System.out.println("\nVoce escolheu a opcao cadastrar um cliente.\n");
                    cadastrarCliente();
                    break;
                case 3:
                    System.out.println("\nVoce escolheu a opcao cadastrar uma cidade.\n");
                    mostrarCidades();
                    cadastrarCidade();
                    break;
                case 4:
                    System.out.println("\nVoce escolheu a opcao mostrar reserva.\n");
                    mostrarClientes();
                    System.out.println("\nDigite o CPF de um dos clientes cadastrados para visualizar suas reservas: ");
                    mostrarReservas(leitor.nextLong());
                    leitor.nextLine();
                    break;
                default:
                    System.out.println("\nOpcao invalida. Tente novamente.");
                    break;
            }
        }
                
    }
        
}
