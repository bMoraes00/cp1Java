package br.com.fiap.cp1.view;

import br.com.fiap.cp1.model.Veiculo;

import java.io.StringReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cadastroVeiculos = new Scanner(System.in);
        cadastroVeiculos.next();
        Veiculo mercedesC180 = new Veiculo("Mercedes","c180","AMG-3890",2024,5,10.8,1.6,1100.00,true,"Gasolina",false,true);
        Veiculo toyotaCorolla = new Veiculo("Toyota","Corolla","COR-4783",2023,5,8.3,2.0,500.00,true,"Álcool",true,false);
        System.out.println(mercedesC180.getMarca());
        }
    }
