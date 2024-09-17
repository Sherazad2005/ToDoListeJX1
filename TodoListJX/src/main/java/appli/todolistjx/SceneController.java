package appli.todolistjx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class SceneController {
    private Stage stage;


    public SceneController(Stage stage) {
        this.stage = stage;
    }


    public void changeScene(String fxmlFile) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFile));
        Scene newScene = new Scene(fxmlLoader.load());
        stage.setScene(newScene);
        stage.show();
    }
}