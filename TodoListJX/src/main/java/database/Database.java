package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private String server = "localhost";
    private String nomDeLaBase = "site";
    private static String utilisateur = "root";
    private static String motDePasse = "";
    private static String url = "jdbc:mysql://localhost/database?serverTimezone=UTC";
    public Database() {}
    public Database(String nomDeLaBase, String utilisateur, String motDePasse) {
        this.nomDeLaBase = nomDeLaBase;
        this.utilisateur = utilisateur;
        this.motDePasse = motDePasse;

    }

    public static Connection getConnection(){
        try {
            try (Connection cnx = DriverManager.getConnection(url, utilisateur, motDePasse)) {
                System.out.print("Etat de la connection :");
                System.out.println(cnx.isClosed() ? "fermée" : "ouverte \r\n");
                return cnx;
            }

        } catch (SQLException e) {
           System.out.print("Erreur : lors de la tentative de connexion à la base de données");
           e.printStackTrace();
           return null;
        }
    }
    }

