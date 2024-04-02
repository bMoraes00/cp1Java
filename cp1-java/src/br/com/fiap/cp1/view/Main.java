package br.com.fiap.cp1.view;


import br.com.fiap.cp1.model.Cliente;
import br.com.fiap.cp1.model.Veiculo;

import java.io.StringReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Veiculo mercedesC180 = new Veiculo("Mercedes","c180","AMG-3890",2024,5,10.8,1.6,1100.00,true,"Gasolina",false,true);
        Veiculo toyotaCorolla = new Veiculo("Toyota","Corolla","COR-4783",2023,5,8.3,2.0,500.00,true,"Álcool",true,false);

        Scanner cadastroCliente = new Scanner(System.in);
        System.out.print("Deseja fazer seu cadastro? : ");
        boolean cadastro = cadastroCliente.nextBoolean();
        System.out.print("Deseja fazer o cadastro de um veiculo? : ");
        boolean cadastroVeiculo = cadastroCliente.nextBoolean();
        System.out.print("Deseja fazer a locacao de algum veiculo? : ");
        boolean locacaoVeiculo = cadastroCliente.nextBoolean();

        if (cadastro) {
            Cliente novoCliente = new Cliente();
            System.out.print("Digite seu nome: ");
            novoCliente.setNome(cadastroCliente.next());
            System.out.print("Digite seu cpf: ");
            novoCliente.setCpf(cadastroCliente.next());

            System.out.println(novoCliente.getNome());
            System.out.println(novoCliente.getCpf());

        }
        if (cadastroVeiculo){
            System.out.println("dadasdadsadasdadsadas");
        }
        if (locacaoVeiculo) {
            System.out.println("No momento estamos com disponibilidade nesses veiculos: ");
        }
        if (!mercedesC180.isAlugado())  {
            System.out.println(mercedesC180.getMarca()+ " " + mercedesC180.getModelo() + mercedesC180.getPlaca());
        }
        if (!toyotaCorolla.isAlugado()) {
            System.out.println(toyotaCorolla.getMarca() + " " + toyotaCorolla.getModelo());
        }

        }
    }
