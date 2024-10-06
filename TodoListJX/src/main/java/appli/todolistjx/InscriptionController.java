package appli.todolistjx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import repository.UtilisateurRepository;
import model.Utilisateur;


public class InscriptionController {

    @FXML
    private TextField txtNom;

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtMotDePasse;

    @FXML
    private PasswordField txtConfirmationMotDePasse;

    @FXML
    private Button btnInscription;

    @FXML
    private Label labelErreur;

    private UtilisateurRepository utilisateurRepository = new UtilisateurRepository();


    @FXML
    public void handleInscription() {

        if (areFieldsFilled()) {
            if (passwordsMatch()) {
                Utilisateur utilisateur = new Utilisateur(txtNom.getText(), txtEmail.getText(), txtMotDePasse.getText());

                boolean success = utilisateurRepository.inscription(utilisateur);

                if (success) {

                    labelErreur.setText("Utilisateur bien ajouté !");
                    clearFields();
                } else {
                    labelErreur.setText("Erreur lors de l'ajout. Veuillez réessayer.");
                }
            } else {
                labelErreur.setText("Erreur, les mots de passe ne correspondent pas !");
            }
        } else {
            labelErreur.setText("Veuillez remplir tous les champs.");
        }
    }


    private boolean areFieldsFilled() {
        return !txtNom.getText().isEmpty() &&
                !txtEmail.getText().isEmpty() &&
                !txtMotDePasse.getText().isEmpty() &&
                !txtConfirmationMotDePasse.getText().isEmpty();
    }

    private boolean passwordsMatch() {
        return txtMotDePasse.getText().equals(txtConfirmationMotDePasse.getText());
    }

    private void clearFields() {
        txtNom.clear();
        txtEmail.clear();
        txtMotDePasse.clear();
        txtConfirmationMotDePasse.clear();
    }

}


