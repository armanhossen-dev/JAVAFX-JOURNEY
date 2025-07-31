package com.example.switch_scenes;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    private Stage stage;
    private Scene scene;

    //  Reusable method to switch scenes with FXML and CSS
    private void switchScene(ActionEvent event, String fxmlFile, String cssFile) throws IOException {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("/" + fxmlFile));
        Parent root = loader.load();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(Main.class.getResource("/" + cssFile).toExternalForm());

        stage.setScene(scene);
        stage.show();
    }

    //  Scene 1
    public void SwitchToScene1(ActionEvent event) throws IOException {
        switchScene(event, "Main.fxml", "App5.css");
    }

    //  Scene 2
    public void SwitchToScene2(ActionEvent event) throws IOException {
        switchScene(event, "scene2.fxml", "App5s2.css");
    }

    //  Scene 3
    public void SwitchToScene3(ActionEvent event) throws IOException {
        switchScene(event, "scene3.fxml", "App5s3.css");
    }

    //  Scene 4
    public void SwitchToScene4(ActionEvent event) throws IOException {
        switchScene(event, "scene4.fxml", "App5s4.css");
    }
}
