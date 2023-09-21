package Aulas.agrupamentoFabricas;

public class Homem extends Pessoa {
    public Homem(String nome, String sexo) {
        super(nome, sexo);
    }

    public String info() {
        return "Homem";
    }

}