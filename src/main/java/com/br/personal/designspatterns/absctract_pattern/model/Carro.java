package com.br.personal.designspatterns.absctract_pattern.model;

import com.br.personal.designspatterns.absctract_pattern.model.roda.Roda;
import com.br.personal.designspatterns.absctract_pattern.model.som.Som;

public class Carro {

    private Som som;
    private Roda roda;

    public Carro() {
    }

    public Carro(Som som, Roda roda) {
        this.som = som;
        this.roda = roda;
    }

    public Som getSom() {
        return som;
    }

    public void setSom(Som som) {
        this.som = som;
    }

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }
}
