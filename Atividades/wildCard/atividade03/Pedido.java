package Atividades.wildCard.atividade03;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ProdutoX> produtos;

    public Pedido() {
        this.produtos = new ArrayList<>();
    }

    public void adicionar(ProdutoX produto) {
        produtos.add(produto);
    }

    public void mostrarListaDeProdutos() {
        for (ProdutoX produto : produtos) {
            System.out.println(produto);
        }
    }
}
