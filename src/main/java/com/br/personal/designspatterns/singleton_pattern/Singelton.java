package com.br.personal.designspatterns.singleton_pattern;

public class Singelton {

    private static Singelton instance;

    private Singelton() {
    }

    /**
     * synchronized -> para evitar que mais de uma thread consiga acessalo
     * */
    public static synchronized Singelton getInstanceSingelton() {

        if (instance == null)
            instance = new Singelton();

        return instance;
    }
}
