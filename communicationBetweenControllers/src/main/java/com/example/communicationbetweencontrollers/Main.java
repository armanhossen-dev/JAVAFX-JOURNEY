package com.example.communicationbetweencontrollers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 840);
        stage.setTitle("App6 JavaFX communication between controllers! ");
        stage.setScene(scene);
        stage.show();
    }
//https://youtu.be/wxhGKR3PQpo
    public static void main(String[] args) {
        launch();
    }
}