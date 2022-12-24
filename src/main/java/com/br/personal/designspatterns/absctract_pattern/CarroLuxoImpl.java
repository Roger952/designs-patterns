package com.br.personal.designspatterns.absctract_pattern;

import com.br.personal.designspatterns.absctract_pattern.model.roda.Roda;
import com.br.personal.designspatterns.absctract_pattern.model.roda.RodaLigaLeve;
import com.br.personal.designspatterns.absctract_pattern.model.som.CDPlayer;
import com.br.personal.designspatterns.absctract_pattern.model.som.Som;

public class CarroLuxoImpl implements CarroService {
    @Override
    public Roda montarRoda() {
        return new RodaLigaLeve();
    }

    @Override
    public Som montarSom() {
        return new CDPlayer();
    }
}
