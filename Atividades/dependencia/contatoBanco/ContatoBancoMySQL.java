package Atividades.dependencia.contatoBanco;

import Atividades.dependencia.Contato;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContatoBancoMySQL implements ContatoBanco {

    private Connection connect() {
        String url = "jdbc:mysql://localhost:3306/seubanco";
        String user = "usuario";
        String password = "senha";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    @Override
    public Contato getContatoId(int id) {
        String query = "SELECT * FROM contatos WHERE id = ?";
        try (Connection conn = connect();
                PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Contato(rs.getInt("id"), rs.getString("nome"), rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Contato getContatoEmail(String email) {
        String query = "SELECT * FROM contatos WHERE email = ?";
        try (Connection conn = connect();
                PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Contato(rs.getInt("id"), rs.getString("nome"), rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Contato> getTodosContatos() {
        ArrayList<Contato> contatos = new ArrayList<>();
        String query = "SELECT * FROM contatos";
        try (Connection conn = connect();
                PreparedStatement stmt = conn.prepareStatement(query);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                contatos.add(new Contato(rs.getInt("id"), rs.getString("nome"), rs.getString("email")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contatos;
    }

    @Override
    public boolean inserir(Contato contato) {
        String query = "INSERT INTO contatos (nome, email) VALUES (?, ?)";
        try (Connection conn = connect();
                PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean alterar(Contato contato) {
        String query = "UPDATE contatos SET nome = ?, email = ? WHERE id = ?";
        try (Connection conn = connect();
                PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setInt(3, contato.getId());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean excluir(int id) {
        String query = "DELETE FROM contatos WHERE id = ?";
        try (Connection conn = connect();
                PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
