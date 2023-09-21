package Aulas.abstract_factory;

public class Fiesta implements CarroPopular {
    @Override
    public void exibirInfoPopular() {
        System.out.println("Modelo: Fiesta\nFabrica: Ford\n" + "Categoria: Popular");
    }
}
