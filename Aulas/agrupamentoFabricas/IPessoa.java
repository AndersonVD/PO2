package Aulas.agrupamentoFabricas;

public interface IPessoa {
    public default String info() {
        return "Generico";
    }
}