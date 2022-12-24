package com.br.personal.designspatterns.absctract_pattern;

import com.br.personal.designspatterns.absctract_pattern.model.roda.Roda;
import com.br.personal.designspatterns.absctract_pattern.model.som.Som;

public interface CarroService {

    Roda montarRoda();
    Som montarSom();
}
