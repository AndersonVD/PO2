package Aulas.complexidadeClasses;

public class CarroProduct {
    private double preco;
    private String dscMotor;
    private int anoDeFabricacao;
    private String modelo;
    private String montadora;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDscMotor() {
        return dscMotor;
    }

    public void setDscMotor(String dscMotor) {
        this.dscMotor = dscMotor;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public abstract class CarroBuilder {
        protected CarroProduct carro = new CarroProduct();

        public abstract void buildPreco();

        public abstract void buildDscMotor();

        public abstract void buildAnoDeFabricacao();

        public abstract void buildModelo();

        public abstract void buildMontadora();

        public CarroProduct getCarro() {
            return carro;
        }
    }
}