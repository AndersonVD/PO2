package Atividades.wildCard.atividade04;

import java.util.ArrayList;
import java.util.List;

public class MinhaEstrutura<T> {
    private class Par {
        String chave;
        T valor;

        Par(String chave, T valor) {
            this.chave = chave;
            this.valor = valor;
        }
    }

    private List<Par> pares;

    public MinhaEstrutura() {
        this.pares = new ArrayList<>();
    }

    public boolean add(String chave, T valor) {
        for (Par par : pares) {
            if (par.chave.equals(chave)) {
                return false; // Chave já existe
            }
        }
        pares.add(new Par(chave, valor));
        return true;
    }

    public T buscaPelaChave(String chave) {
        for (Par par : pares) {
            if (par.chave.equals(chave)) {
                return par.valor;
            }
        }
        return null; // Não encontrou a chave
    }
}
