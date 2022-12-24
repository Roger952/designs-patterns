package com.br.personal.designspatterns.factory_pattern;

import java.util.Scanner;

public class RunFactoryPattern {


    public static void main(String[] args) {

        VeiculoFactory factory = new VeiculoFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um meio de locomoção para sua viagem: 1- Ar, 2- Estrada, 3- Mar");

        Integer inputRecived = scanner.nextInt();

        Veiculo factoryVeiculo = factory.createVeiculo(inputRecived);

        factoryVeiculo.print();
    }
}
