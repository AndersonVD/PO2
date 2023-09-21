package Aulas.abstract_factory;

public class Siena implements CarroSedan {
    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: Siena\nFabrica: Fiat\n" + "Categoria:Sedan");
    }
}