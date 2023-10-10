package Atividades.wildCard.atividade03;

public class ProdutoX {
    private String id;
    private String nome;
    private double preco;

    public ProdutoX(String id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "ProdutoX{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
