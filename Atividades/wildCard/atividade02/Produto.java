package Atividades.wildCard.atividade02;

import java.util.Date;

public class Produto<T> {
    private T id;
    private double valor;
    private Date dataFabricacao;
    private Date dataVencimento;

    public Produto(T id, double valor, Date dataFabricacao, Date dataVencimento) {
        this.id = id;
        this.valor = valor;
        this.dataFabricacao = dataFabricacao;
        this.dataVencimento = dataVencimento;
    }

    public T getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produto{id=").append(id);
        sb.append(", valor=").append(valor);
        sb.append(", dataFabricacao=").append(dataFabricacao);
        sb.append(", dataVencimento=").append(dataVencimento);
        sb.append('}');
        return sb.toString();

    }

}
