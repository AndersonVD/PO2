package Aulas.aula_designPatter;

public class Conexao {
    private static Conexao link;

    private Conexao() {
    }

    public static Conexao getInstance() {
        if (link == null) {
            link = new Conexao();
        }
        return link;
    }

}
