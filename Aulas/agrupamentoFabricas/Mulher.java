package Aulas.agrupamentoFabricas;

public class Mulher extends Pessoa {
    public Mulher(String nome, String sexo) {
        super(nome, sexo);
    }

    public String info() {
        return "Mulher";
    }
}