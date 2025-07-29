package com.example.javafx_css_styling;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Collection;

public class Main extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add("app4.css"); // i created this css file inside java code folde
        stage.setTitle("App4");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
//JavaFX CSS styling watch more to understand and work this code    https://youtu.be/o-lAsVuskKI?list=PLZPZq0r_RZOM-8vJA3NQFZB7JroDcMwev

