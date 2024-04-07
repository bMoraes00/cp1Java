package br.com.fiap.cp1.view;


import br.com.fiap.cp1.model.Cliente;
import br.com.fiap.cp1.model.Veiculo;

import javax.swing.*;
import java.io.StringReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criando novos Clientes e Veiculos
        Cliente novoCliente = new Cliente();
        Veiculo novoVeiculo = new Veiculo();
        //instanciando carros ja presentes na locadora
        Veiculo mercedesC180 = new Veiculo("Mercedes","c180","AMG-3890",2024,5,10.8,1.6,1100.00,true,"Gasolina",false,true);
        Veiculo toyotaCorolla = new Veiculo("Toyota","Corolla","COR-4783",2023,5,8.3,2.0,500.00,true,"Álcool",true,false);

        //loop
        boolean loop = true;

        //loop do programa
while (loop) {
    int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opcao 1-Cadastrar do cliente, -2 Cadastrar um veículo, 3-Locar um veículo ou 4-Sair do programa"));

    switch (opcao) {
        case 1:
            novoCliente.setNome(JOptionPane.showInputDialog("Digite o seu nome:"));
            novoCliente.setCpf(JOptionPane.showInputDialog("Digite o seu cpf:"));
            novoCliente.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o seu Ano de nascimento:")));
            JOptionPane.showMessageDialog(null, "Novo cliente: " + novoCliente.getNome() + " | " + novoCliente.getCpf() + " | " + novoCliente.getAnoNascimento());

            break;

        case 2:
            novoVeiculo.setMarca(JOptionPane.showInputDialog("Digite a marca do veículo:"));
            novoVeiculo.setModelo(JOptionPane.showInputDialog("Digite o modelo do veículo:"));
            novoVeiculo.setAnoFabricacao(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de fabricacao do veículo:")));
            JOptionPane.showMessageDialog(null, "Novo Veículo: " + novoVeiculo.getMarca() + " | " + novoVeiculo.getModelo() + " | " + novoVeiculo.getAnoFabricacao());
            break;

        case 3:
            JOptionPane.showMessageDialog(null, "Estamos com disponibilidade dos seguintes veículos:");

            if (!mercedesC180.isAlugado()) {
                JOptionPane.showMessageDialog(null, mercedesC180.getMarca() + " " + mercedesC180.getModelo() + mercedesC180.getPlaca());
            }
            if (!toyotaCorolla.isAlugado()) {
                JOptionPane.showMessageDialog(null, toyotaCorolla.getMarca() + " " + toyotaCorolla.getModelo() + " " + toyotaCorolla.getPlaca());
            }
            if (!novoVeiculo.isAlugado()) {
                JOptionPane.showMessageDialog(null, novoVeiculo.getMarca() + " " + novoVeiculo.getModelo() + " " + novoVeiculo.getPlaca());
            }
            break;

    }
    if(opcao == 4)
    {
        loop = false;
    }
}
    }
}

