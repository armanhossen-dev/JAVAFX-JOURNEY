package com.example.switch_scenes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        try {
            // Load the main FXML layout
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/Main.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            // Apply the CSS stylesheet
            scene.getStylesheets().add(Main.class.getResource("/App5.css").toExternalForm());

            // Set window icon
            stage.getIcons().add(new Image(Main.class.getResource("/logo.png").toExternalForm()));

            // Configure and show the stage
            stage.setTitle("App5 [JavaFX with scenes]");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            System.err.println("⚠️ Failed to load UI: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(); // Launch the JavaFX application
    }
}