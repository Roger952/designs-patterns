package com.br.personal.designspatterns.singleton_pattern;

public abstract class AbstractSingelton {

    protected static AbstractSingelton makeInstance() {
        return null;
    }

    protected AbstractSingelton(){}

    private static AbstractSingelton instance = null;

    public static AbstractSingelton getAbstractSingelton(){

        if (instance == null)
            instance = makeInstance();

        return instance;
    }
}
