package com.br.personal.designspatterns.singleton_pattern;

public class RunSingeltonMethodPattern {

    public static void main(String[] args) {

        Singelton singeltonOne = Singelton.getInstanceSingelton();
        Singelton singeltonTwo = Singelton.getInstanceSingelton();

        System.out.println(singeltonOne);
        System.out.println(singeltonTwo);
    }
}
