## Builder METHOD

O design pattern *BUILDER* permite a você construir objetos complexos passo a passo. O padrão permite que você produza
diferentes tipos e representações de um objeto usando o mesmo código de construção.

<h3 style="color:blue">Exemplo do Código:</h3> 

* #### Empresa


    private String razaoSocial;
    private String cnpj;
    private Integer qntdFuncionarios;
    private Double rendaPorMes;

* #### Construtores
    

    public EmpresaVO() {}


    public EmpresaVO(String razaoSocial, String cnpj, Integer qntdFuncionarios, Double rendaPorMes) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.qntdFuncionarios = qntdFuncionarios;
        this.rendaPorMes = rendaPorMes;
    }

* #### Montando o Objeto


    EmpresaVO empresa = EmpresaBuilder
        .anEmpresaDTO()
        .withRazaoSocial("Teste Empresa LTDA")
        .withCnpj("12345678912")
        .withQntdFuncionarios(10)
        .build();