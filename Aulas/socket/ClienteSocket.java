package Aulas.socket;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.io.PrintStream;

public class ClienteSocket {
    public static void main(String[] args) throws IOException {
        // Cria o scanner para entrada de dados
        Scanner entrada = new Scanner(System.in);

        String texto = "";

        // Cria o socket de conexao e seta como nulo
        Socket cliente = null;

        // Cria a saida de dados.7
        PrintStream saida = null;

        try {
            cliente = new Socket("172.16.3.42", 7000);

            saida = new PrintStream(cliente.getOutputStream());

            do {
                // System.out.println("Digite uma mensagem: ");
                texto = entrada.nextLine();
                saida.println(texto);
            } while (!"sair".equals(texto));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            if (cliente != null) {
                cliente.close();
            }
        }
    }
}
