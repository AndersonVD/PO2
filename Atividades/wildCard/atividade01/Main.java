package Atividades.wildCard.atividade01;

public class Main {
    public static void main(String[] args) {
        // exemplo com tipos diferentes
        MeuGenerics<String> stringGeneric = new MeuGenerics<>("Olá, mundo!");
        MeuGenerics<Integer> integerGeneric = new MeuGenerics<>(42);
        MeuGenerics<Double> doubleGeneric = new MeuGenerics<>(3.14);

        // com objeto criado
        Pessoa pessoa = new Pessoa("José", 30);
        MeuGenerics<Pessoa> pessoaGeneric = new MeuGenerics<>(pessoa);

        // acessando o objeto de cada classe MeuGenerics
        String mensagem = stringGeneric.getObjeto();
        Integer numero = integerGeneric.getObjeto();
        Double pi = doubleGeneric.getObjeto();
        Pessoa pessoaObj = pessoaGeneric.getObjeto();

        System.out.println(mensagem);
        System.out.println(numero);
        System.out.println(pi);
        System.out.println("Nome da Pessoa: " + pessoaObj.getNome() + ", Idade: " + pessoaObj.getIdade());
    }
}
