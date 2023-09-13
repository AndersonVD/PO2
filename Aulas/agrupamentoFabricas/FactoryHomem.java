package Aulas.agrupamentoFabricas;

public class FactoryHomem implements IFactoryPessoa {
    @Override
    public Pessoa criarPessoa(String nome, String sexo) {
        return new Homem(nome, sexo);

    }
}
