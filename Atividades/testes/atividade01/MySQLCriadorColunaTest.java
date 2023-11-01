package Atividades.testes.atividade01;

public class MySQLCriadorColunaTest {

    @org.junit.Test
    public void testCreateColumnScript() {
        String nome = "anderson";
        String tipo = "VARCHAR(255)";
        boolean naoNulo = true;
        boolean autoIncremento = false;
        String expResult = "'anderson' VARCHAR(255) NOT NULL,";
        String result = MySQLCriadorColuna.createColumnScript(nome, tipo, naoNulo, autoIncremento);
        org.junit.Assert.assertEquals(expResult, result);

        // ----------------------------
        nome = "anderson";
        tipo = "VARCHAR(255)";
        naoNulo = false;
        autoIncremento = false;
        expResult = "'anderson' VARCHAR(255),";
        result = MySQLCriadorColuna.createColumnScript(nome, tipo, naoNulo, autoIncremento);
        org.junit.Assert.assertEquals(expResult, result);

        // ----------------------------
        nome = "anderson";
        tipo = "VARCHAR(255)";
        naoNulo = true;
        autoIncremento = true;
        expResult = "'anderson' VARCHAR(255) NOT NULL AUTO_INCREMENT,";
        result = MySQLCriadorColuna.createColumnScript(nome, tipo, naoNulo, autoIncremento);
        org.junit.Assert.assertEquals(expResult, result);

        // ----------------------------

        nome = "anderson";
        tipo = "VARCHAR(255)";
        naoNulo = false;
        autoIncremento = true;
        expResult = "'anderson' VARCHAR(255) AUTO_INCREMENT,";
        result = MySQLCriadorColuna.createColumnScript(nome, tipo, naoNulo, autoIncremento);
        org.junit.Assert.assertEquals(expResult, result);

        // ----------------------------

        nome = "anderson";
        tipo = "VARCHAR(255)";
        naoNulo = false;
        autoIncremento = false;
        expResult = "'anderson' VARCHAR(255),";
        result = MySQLCriadorColuna.createColumnScript(nome, tipo, naoNulo, autoIncremento);
        org.junit.Assert.assertEquals(expResult, result);

        // ----------------------------
        nome = "anderson";
        tipo = "VARCHAR(255)";
        naoNulo = true;
        autoIncremento = true;
        expResult = "'anderson' VARCHAR(255) NOT NULL AUTO_INCREMENT,";
        result = MySQLCriadorColuna.createColumnScript(nome, tipo, naoNulo, autoIncremento);
        org.junit.Assert.assertEquals(expResult, result);

    }
}
