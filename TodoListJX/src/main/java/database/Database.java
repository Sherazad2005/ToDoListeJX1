package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private String server = "localhost";
    private String nomDeLaBase = "database";
    private String utilisateur = "root";
    private String motDePasse = "";
    public Database() {}
    public Database(String nomDeLaBase, String utilisateur, String motDePasse) {
        this.nomDeLaBase = nomDeLaBase;
        this.utilisateur = utilisateur;
        this.motDePasse = motDePasse;

    }
    private String getUrl() {

        return "jdbc:mysql://localhost/database?serverTimezone=UTC";
    }
    public Connection getConnection(){
        try {
            Connection cnx = DriverManager.getConnection(this.getUrl(),this.utilisateur,this.motDePasse);
                System.out.print("Etat de la connection :");
                System.out.println(cnx.isClosed()?"fermée":"ouverte \r\n");
            return cnx;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    }
}
