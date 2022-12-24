package com.br.personal.designspatterns.absctract_pattern;

import java.util.Scanner;

public class RunAbstractMethodPattern {

    public static void main(String[] args) {

        CarroFactory factory = new CarroFactory();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um tipo de carro: Luxo ou Popular");

        String inputRecived = scanner.next();

        System.out.println("Aqui o carro que você escolheu: " + factory.createCarro(inputRecived).getClass());
    }
}
