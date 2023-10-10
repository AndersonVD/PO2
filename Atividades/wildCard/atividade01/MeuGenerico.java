package Atividades.wildCard.atividade01;

public class MeuGenerico<T> {
    private T dado;

    public MeuGenerico(T dado) {
        this.dado = dado;
    }

    public T getDado() {
        return dado;
    }
}
