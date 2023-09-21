package Aulas.abstract_factory;

public class Palio implements CarroPopular {
    @Override
    public void exibirInfoPopular() {
        System.out.println("Modelo: Palio\nFabrica: Fiat\n" + "Categoria:Popular");
    }
}