## Factory METHOD

O design pattern *FACTORY* tem como objetivo definir uma interface para criação de um objeto, mas delega ás suas 
subclasses definirem qual classe será instanciada

<h3 style="color:blue">Exemplo do Código:</h3> 

* #### Interface de criação
`public interface Veiculo {}`
* #### Objetos implementados
`public class Aviao implements Veiculo {}`

`public class Barco implements Veiculo {}`

`public class Carro implements Veiculo {}`
* #### Methodo Fabrica


    public Veiculo createVeiculo(Integer input) {

        switch (input) {
            case 1:
                return new Aviao();
            case 2:
                return new Carro();
            case 3:
                return new Barco();
            default:
                throw new IllegalArgumentException("");
        }
    }

