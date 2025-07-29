package com.example.fxscenebuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    //how to set up scenebuilder
    // go search : Scene Builder - Gluon and go to gluonhq.com website then download  scenebuilder windows installer then download and install this
    //after download install it and go to the folder where it is installed then, where its exe file is located, 
    //javafx project then go to
    ///  file -> settings -> Languages & Frameworks -> javaFX ->find the path and  select SceneBuilder.exe location then apply and ok
    /// then inside project, src -> main -> open .fxml file with scenebuilder then edit and make drop and drag what necessary things you need
    /// then file -> save then exit by closing the window,
    /// then in this Main Page in this line
    /// Scene scene = new Scene(fxmlLoader.load()); , delete width and height then run this file and have the design you did

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}