package accueil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class AccueilController {

    @FXML
    private Label labelBienvenue;

    public void setNomUtilisateur(String nom) {
        labelBienvenue.setText("Bienvenue, " + nom + " !");
    }


    @FXML
    private void deconnexion(ActionEvent event) {

        try {

            Stage stage = (Stage) labelBienvenue.getScene().getWindow();
            stage.close();


            javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("/login/LoginView.fxml"));
            javafx.scene.Parent root = loader.load();
            Stage loginStage = new Stage();
            loginStage.setTitle("Connexion");
            loginStage.setScene(new javafx.scene.Scene(root));
            loginStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
