package Aulas.complexidadeClasses;

import Aulas.complexidadeClasses.CarroProduct.CarroBuilder;

public class FiatBuilder extends CarroBuilder {
    @Override
    public void buildPreco() {
        carro.setPreco(43000.00);
    }

    @Override
    public void buildDscMotor() {
        carro.setDscMotor("V5");
    }

    @Override
    public void buildAnoDeFabricacao() {
        carro.setAnoDeFabricacao(2003);
    }

    @Override
    public void buildModelo() {
        carro.setModelo("Modelo");
    }

    @Override
    public void buildMontadora() {
        carro.setMontadora("Montadora");
    }

}
