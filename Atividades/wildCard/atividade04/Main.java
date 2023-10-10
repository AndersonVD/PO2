package Atividades.wildCard.atividade04;

public class Main {
    public static void main(String[] args) {
        MinhaEstrutura<Integer> estrutura = new MinhaEstrutura<>();
        MinhaEstrutura<String> estruturaString = new MinhaEstrutura<>();
        MinhaEstrutura<Boolean> estruturaBool = new MinhaEstrutura<>();

        System.out.println(estrutura.add("idade", 200)); // true
        System.out.println(estruturaString.add("nome", "Carlinhos"));
        System.out.println(estruturaBool.add("bonito", false));
        // :) é isso curvas :) jazz dancing happines, family, friends we are the world
        System.out.println("Valor da primeira key: " + estrutura.buscaPelaChave("idade"));
        System.out.println("Valor da segunda key: " + estruturaString.buscaPelaChave("nome"));
        System.out.println("Valor da terceira key: " + estruturaBool.buscaPelaChave("bonito"));
    }
}
