package Atividades.wildCard.atividade04;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe base que recebe um paramtro genérico
 * 
 * @author anderson1565@live.com
 * 
 * @param <T> Parametro genérico
 * 
 */
public class MinhaEstrutura<T> {
    private class Par {
        String chave;
        T valor;

        /**
         * Detalhamento do construtor da classe Par
         * 
         * @param chave Chave da classe, tuliznado como uma chave primário valor String
         * @param valor
         */

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
