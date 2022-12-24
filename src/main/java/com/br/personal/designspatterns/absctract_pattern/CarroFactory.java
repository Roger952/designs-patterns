package com.br.personal.designspatterns.absctract_pattern;

import com.br.personal.designspatterns.absctract_pattern.model.Carro;

public class CarroFactory {

    public Carro createCarro(String input) {

        CarroService carroService;

        switch (input) {

            case "luxo":
                carroService = new CarroLuxoImpl();
                break;
            case "popular":
                carroService = new CarroPopularImpl();
                break;
            default:
                throw new IllegalArgumentException("");
        }

        return new Carro(carroService.montarSom(), carroService.montarRoda());
    }
}
