package com.br.personal.designspatterns.factory_pattern;

public interface Veiculo {

    default void print(){

        System.out.print("Sou um veículo qualquer");
    }
}
