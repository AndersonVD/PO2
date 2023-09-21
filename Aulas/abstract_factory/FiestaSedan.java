package Aulas.abstract_factory;

public class FiestaSedan implements CarroSedan {
    @Override
    public void exibirInfoSedan() {
        System.out.println("Mode: Fiesta\nFabrica:Ford\n" + "Categoria:Sedan");
    }
}