package Atividades.wildCard.atividade03;

public class ProdutoBanana extends ProdutoX {
    private boolean fresco;
    private String tipoBanana;

    public ProdutoBanana(String id, String nome, double preco, boolean fresco, String tipoBanana) {
        super(id, nome, preco);
        this.fresco = fresco;
        this.tipoBanana = tipoBanana;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", fresco=").append(fresco);
        sb.append(", tipoBanana='").append(tipoBanana).append('\'');
        sb.append('}');
        return sb.toString();

    }

}