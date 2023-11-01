package Atividades.testes.atividade01;

public class MySQLCriadorColuna {
    public static String createColumnScript(String nome, String tipo, boolean naoNulo, boolean autoIncremento) {
        StringBuilder script = new StringBuilder();
        script.append("'").append(nome).append("' ").append(tipo);

        if (naoNulo) {
            script.append(" NOT NULL");
        }

        if (autoIncremento) {
            script.append(" AUTO_INCREMENT");
        }

        script.append(",");

        return script.toString();
    }
}
