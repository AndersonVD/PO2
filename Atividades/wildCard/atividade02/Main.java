package Atividades.wildCard.atividade02;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date dataFab = new Date();
        Date dataVenc = new Date(dataFab.getTime() + (1000 * 60 * 60 * 24 * 7)); // Uma semana depois da data de
                                                                                 // fabricação

        Produto<Integer> produtoComIdInt = new Produto<>(1, 50.00, dataFab, dataVenc);
        System.out.println(produtoComIdInt);

        Produto<String> produtoComIdString = new Produto<>("001A", 60.00, dataFab, dataVenc);
        System.out.println(produtoComIdString);
    }
}
