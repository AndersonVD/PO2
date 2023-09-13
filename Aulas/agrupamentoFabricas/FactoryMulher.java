package Aulas.agrupamentoFabricas;

public class FactoryMulher implements IFactoryPessoa {
    @Override
    public Pessoa criarPessoa(String nome, String sexo) {
        return new Mulher(nome, sexo);

    }
}
