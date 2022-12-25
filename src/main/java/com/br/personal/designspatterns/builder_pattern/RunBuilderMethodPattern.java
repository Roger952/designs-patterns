package com.br.personal.designspatterns.builder_pattern;

public class RunBuilderMethodPattern {

    public static void main(String[] args) {

        EmpresaVO empresa = EmpresaBuilder
                .anEmpresaDTO()
                .withRazaoSocial("Teste Empresa LTDA")
                .withCnpj("12345678912")
                .withQntdFuncionarios(10)
                .build();

        System.out.println(empresa);
    }
}
