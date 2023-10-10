package Atividades.wildCard.atividade01;

public class MeuGenerics<T> {

    private T objeto;

    public MeuGenerics(T objeto) {
        setObjeto(objeto);
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        if (objeto != null) {
            this.objeto = objeto;
        } else {
            throw new IllegalArgumentException("Objeto inválido!");
        }
    }

    @Override
    public String toString() {
        return "Objeto: " + getObjeto();
    }
}
