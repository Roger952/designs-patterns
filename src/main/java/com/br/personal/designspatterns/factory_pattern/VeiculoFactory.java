package com.br.personal.designspatterns.factory_pattern;

public class VeiculoFactory {

    public Veiculo createVeiculo(Integer input) {

        switch (input) {
            case 1:
                return new Aviao();
            case 2:
                return new Carro();
            case 3:
                return new Barco();
            default:
                throw new IllegalArgumentException("");
        }
    }
}
