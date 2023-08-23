package Aulas.aula_designPatter;

public class Main {

    public static void main(String[] args) {
        Conexao link = Conexao.getInstance();
        System.out.println(link);
        Conexao link2 = Conexao.getInstance();
        System.out.println(link2);
    }

}