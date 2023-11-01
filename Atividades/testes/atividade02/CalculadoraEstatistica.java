package Atividades.testes.atividade02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculadoraEstatistica {
    private List<Double> valores;

    public CalculadoraEstatistica(List<Double> valores) {
        this.valores = valores;
    }

    public double calcularMedia() {
        if (valores.isEmpty()) {
            return 0.0;
        }

        double soma = 0.0;
        for (Double valor : valores) {
            soma += valor;
        }

        return soma / valores.size();
    }

    public double calcularModa() {
        if (valores.isEmpty()) {
            return 0.0;
        }

        Map<Double, Integer> contador = new HashMap<>();
        for (Double valor : valores) {
            contador.put(valor, contador.getOrDefault(valor, 0) + 1);
        }

        double moda = 0.0;
        int maxFrequencia = 0;

        for (Map.Entry<Double, Integer> entry : contador.entrySet()) {
            if (entry.getValue() > maxFrequencia) {
                moda = entry.getKey();
                maxFrequencia = entry.getValue();
            }
        }

        return moda;
    }

    public double calcularMediana() {
        if (valores.isEmpty()) {
            return 0.0;
        }

        Collections.sort(valores);

        if (valores.size() % 2 == 0) {
            int meio = valores.size() / 2;
            return (valores.get(meio - 1) + valores.get(meio)) / 2.0;
        } else {
            int meio = valores.size() / 2;
            return valores.get(meio);
        }
    }

    public double calcularVariancia() {
        if (valores.isEmpty()) {
            return 0.0;
        }

        double media = calcularMedia();
        double somaDiferencasAoQuadrado = 0.0;

        for (Double valor : valores) {
            somaDiferencasAoQuadrado += Math.pow(valor - media, 2);
        }

        return somaDiferencasAoQuadrado / valores.size();
    }

    public double calcularDesvioPadrao() {
        if (valores.isEmpty()) {
            return 0.0;
        }

        double variancia = calcularVariancia();
        return Math.sqrt(variancia);
    }
}
