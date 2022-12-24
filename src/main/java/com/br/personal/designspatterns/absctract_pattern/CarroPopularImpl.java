package com.br.personal.designspatterns.absctract_pattern;

import com.br.personal.designspatterns.absctract_pattern.model.roda.Roda;
import com.br.personal.designspatterns.absctract_pattern.model.roda.RodaSimples;
import com.br.personal.designspatterns.absctract_pattern.model.som.Som;
import com.br.personal.designspatterns.absctract_pattern.model.som.TocaFitas;

public class CarroPopularImpl implements CarroService {
    @Override
    public Roda montarRoda() {
        return new RodaSimples();
    }

    @Override
    public Som montarSom() {
        return new TocaFitas();
    }
}
