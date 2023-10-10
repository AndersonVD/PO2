package Atividades.wildCard.atividade03;

public class Main {
    public static void main(String[] args) {
        ProdutoX produto1 = new ProdutoX("001", "Camiseta", 29.90);
        ProdutoX produto2 = new ProdutoBanana("002", "Banana", 59.90, true, "Nanica");

        Pedido pedido = new Pedido();
        pedido.adicionar(produto1);
        pedido.adicionar(produto2);

        System.out.println("Lista de Produtos no Pedido:");
        pedido.mostrarListaDeProdutos();
    }
}
