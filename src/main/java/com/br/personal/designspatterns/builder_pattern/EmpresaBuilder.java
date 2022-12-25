package com.br.personal.designspatterns.builder_pattern;

public final class EmpresaBuilder {
    private String razaoSocial;
    private String cnpj;
    private Integer qntdFuncionarios;
    private Double rendaPorMes;

    private EmpresaBuilder() {
    }

    public static EmpresaBuilder anEmpresaDTO() {
        return new EmpresaBuilder();
    }

    public EmpresaBuilder withRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public EmpresaBuilder withCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public EmpresaBuilder withQntdFuncionarios(Integer qntdFuncionarios) {
        this.qntdFuncionarios = qntdFuncionarios;
        return this;
    }

    public EmpresaBuilder withRendaPorMes(Double rendaPorMes) {
        this.rendaPorMes = rendaPorMes;
        return this;
    }

    public EmpresaBuilder but() {
        return anEmpresaDTO().withRazaoSocial(razaoSocial).withCnpj(cnpj).withQntdFuncionarios(qntdFuncionarios).withRendaPorMes(rendaPorMes);
    }

    public EmpresaVO build() {
        EmpresaVO empresaVO = new EmpresaVO();
        empresaVO.setRazaoSocial(razaoSocial);
        empresaVO.setCnpj(cnpj);
        empresaVO.setQntdFuncionarios(qntdFuncionarios);
        empresaVO.setRendaPorMes(rendaPorMes);
        return empresaVO;
    }
}
