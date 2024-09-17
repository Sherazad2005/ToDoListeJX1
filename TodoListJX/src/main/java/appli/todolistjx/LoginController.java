package appli.todolistjx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;
public class LoginController {
    @FXML
    private Label welcomeText;
    private StartApplication application;
    private SceneController sceneController;

    public void setApplication(StartApplication application, Stage stage) {
        this.application = application;
        this.sceneController = new SceneController(stage);
    }



    @FXML
    protected void onInscriptionButtonClick() throws IOException {

        sceneController.changeScene("inscriptionView.fxml");
    }
}