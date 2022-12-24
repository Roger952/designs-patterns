## Absctract Factory METHOD

O design pattern *ABSTRACT FACTORY* permite produzir familias de objetos relacionados sem ter que especificar suas 
classes concretas

<h3 style="color:blue">Exemplo do Código:</h3> 

* #### Classe abstrata

`public class Carro { 
    private Som som;
    private Roda roda;
}`

Em este exemplo o que interessa para o usuário final é apenas o que tem dentro do carro sem saber os detalhes

* #### SOM
  * CD Player
  * Toca Fitas
* #### RODA
  * Liga Leve
  * Simples

#### Carros disponiveis:

<h4 style="color:red"> LUXO e POPULAR</h4>

* #### Fabrica Abstrata

`interface CarroService {
    Roda montarRoda();
    Som montarSom();
}`

* #### Fabricas Concretas

    `class CarroLuxoImpl implements CarroService`

    `class CarroPopularImpl implements CarroService`

* #### Client

public class CarroFactory {

    public Carro createCarro(String input) {}