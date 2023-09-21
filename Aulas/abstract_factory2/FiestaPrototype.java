package Aulas.abstract_factory2;

public class FiestaPrototype extends CarroPrototype {
    protected FiestaPrototype(FiestaPrototype fiestaPrototype) {
        this.valorCompra = fiestaPrototype.getValorCompra();

    }

    public FiestaPrototype() {
        valorCompra = 0.0;
    }

    @Override
    public String exibirInfo() {
        return "Mode: Fiesta\nMontadora: Ford\n" + "Valor: R$" + getValorCompra();
    }

    @Override
    public CarroPrototype clonar() {
        return new FiestaPrototype(this);
    }
}
