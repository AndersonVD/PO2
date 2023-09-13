package Aulas.agrupamentoFabricas;

public class FactoryPessoa implements IFactoryPessoa {
    @Override
    public Pessoa criarPessoa(String nome, String sexo) {
        if ("F".equals(sexo))
            return new Mulher(nome, sexo);
        else if ("M".equals(sexo))
            return new Homem(nome, sexo);
        else
            return new Pessoa(nome, sexo);
    }
}