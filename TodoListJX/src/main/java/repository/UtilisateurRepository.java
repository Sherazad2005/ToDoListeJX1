package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Utilisateur;
import database.Database;
import java.sql.ResultSet;

public class UtilisateurRepository {

    public boolean inscription(Utilisateur user) {
        String query = "INSERT INTO utilisateurs (nom, email, motDePasse) VALUES (?, ?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, user.getNom());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getMot_de_passe());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String connection(String nom, String prenom, String email, String password) {


        return nom;
    }
    public Utilisateur getUtilisateurByEmail(String email) {
        String query = "SELECT * FROM utilisateurs WHERE email = ?";
        try (Connection conn = Database.getConnection()) {
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, email);
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    return new Utilisateur(rs.getString("nom"), rs.getString("email"), rs.getString("motDePasse"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}


