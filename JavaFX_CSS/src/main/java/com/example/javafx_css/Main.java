package com.example.javafx_css;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        try {
            // Locate FXML
            URL fxmlPath = Main.class.getResource("/Main.fxml");
            FXMLLoader fxmlLoader = new FXMLLoader(fxmlPath);

            // Load scene
            Scene scene = new Scene(fxmlLoader.load());

            // Attach CSS
            URL cssPath = Main.class.getResource("/App4.css");
            if (cssPath != null) {
                scene.getStylesheets().add(cssPath.toExternalForm());
            } else {
                System.err.println("⚠ App4.css not found. Skipping stylesheet.");
            }

            // Add App Icon
            URL logoPath = Main.class.getResource("/logo.png");
            if (logoPath != null) {
                stage.getIcons().add(new Image(logoPath.toExternalForm()));
            } else {
                System.err.println("⚠ logo.png not found. Skipping icon.");
            }

            // Stage configuration
            stage.setTitle("App4 [JavaFX-CSS]");
            stage.setResizable(false); // now its size is fixed
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            System.err.println("Failed to load UI: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}