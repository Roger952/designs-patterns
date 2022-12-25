package com.br.personal.designspatterns.builder_pattern;

public class EmpresaVO {

    private String razaoSocial;
    private String cnpj;
    private Integer qntdFuncionarios;
    private Double rendaPorMes;

    public EmpresaVO() {
    }

    public EmpresaVO(String razaoSocial, String cnpj, Integer qntdFuncionarios, Double rendaPorMes) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.qntdFuncionarios = qntdFuncionarios;
        this.rendaPorMes = rendaPorMes;
    }


    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getQntdFuncionarios() {
        return qntdFuncionarios;
    }

    public void setQntdFuncionarios(Integer qntdFuncionarios) {
        this.qntdFuncionarios = qntdFuncionarios;
    }

    public Double getRendaPorMes() {
        return rendaPorMes;
    }

    public void setRendaPorMes(Double rendaPorMes) {
        this.rendaPorMes = rendaPorMes;
    }

    @Override
    public String toString() {
        return "EmpresaVO{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", qntdFuncionarios=" + qntdFuncionarios +
                ", rendaPorMes=" + rendaPorMes +
                '}';
    }
}
