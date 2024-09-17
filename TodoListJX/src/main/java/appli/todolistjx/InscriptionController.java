package appli.todolistjx;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import java.io.IOException;

public class InscriptionController {
    private SceneController sceneController;


    public void setSceneController(Stage stage) {
        this.sceneController = new SceneController(stage);
    }


    @FXML
    protected void onRetourButtonClick() throws IOException {

        sceneController.changeScene("loginView.fxml");
    }
}
