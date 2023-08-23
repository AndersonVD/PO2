package Aulas.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSocket {
    public static void main(String[] args) throws IOException {
        // Cria o servidor e seta como nulo
        ServerSocket servidor = null;

        // Cria o socket de conexao e seta como nulo
        Socket conexao = null;

        // Entrada de dados
        BufferedReader entrada = null;
        try {

            servidor = new ServerSocket(7000);

            conexao = servidor.accept();

            entrada = new BufferedReader(new InputStreamReader(conexao.getInputStream()));

            do {
                String texto = entrada.readLine();

                if (texto == null) {
                    break;
                }
                System.out.println(texto);
            } while (!"sair".equals(entrada.toString()));

            servidor.close();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            if (entrada != null) {
                entrada.close();
            }
            if (conexao != null) {
                conexao.close();
            }
            if (servidor != null) {
                servidor.close();
            }
        }

    }
}
