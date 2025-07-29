package com.example.hellofx_stages;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    ///  Application class is the parent class
    ///  Main class is our child class
    ///  we see the Main class is underlined by red line we select and click right -> show context action -> then Enter
    /// to impleent the method , of Applications abstract method, public void start(Stage stage) throws Exception
    ///
    /// inorder to run our main class need start method
    /// we will launch()and pass args
    /// launch() method is a static method, it belongs to Application
    public static void main(String[] args) {
        launch(args);  //  we can also write like ->  Application.launch(args);
        // here , launch(); method we pass the string array of arguments
    }

    @Override
    public void start(Stage Stage) throws Exception {
        // how to creating a stage
        // Stage stage = new Stage(); // import javafx.stage.Stage;
        //but there is already a  Stage created so don't have to do this
        // if we want to view this stage , we can write -> stage.show(); then run, we will get a blank page
        // but it has a problem, if we resize this window, if make it small then big we see the white area is fixed to the small and makes a problem so
        // so we need to add scene in it to see something

        // lets create scene,  Scene scene = new Scene(); // import javafx.scene.Scene;
        // but we have to constract it by node, lets create a basic Group of node, named root,
        // lets create
        Group root = new Group(); //import javafx.scene.Group;

        // creating a group root node to arrange all of the different nodes that we have are components
        // adding the root node to Scene
        // Scene scene = new Scene(root); -> this creates the blank white default page
        // lets add color to scene
        Scene scene = new Scene(root, Color.ORANGE); //import javafx.scene.paint.Color;


        //lets change the window icon left top corner
        // copy icon.png to the src folders -> resources folder -> of this project

        // Adding Image to the windo as icon
        Image icon = new Image("logo.png"); // import javafx.scene.image.Image;
        Stage.getIcons().add(icon);
        // Stage.setTitle("This will be the App Title");
        Stage.setTitle("App1");

        //lets make the size when it runs fixed
        Stage.setWidth(500);
        Stage.setHeight(700);
        //still its resizeable , we can stop it being resizeable by
        Stage.setResizable(false); // now its size is fixed

        //lets set where this window will open on the screen , seting the x, y axis
        // by default it makes or opens center, but we can change it, and every time we opne it will be there then we can move it

        //Stage.setX(10); // Sets the stage’s X position on the screen in pixels (device-independent)
        //Stage.setY(50);

        //every time the window opens if we want to make it open full screen,
        //Stage.setFullScreen(true);// this is full screen mode, by pressing Esc button, we can escape form the full screen
        // the escape key is by default is Esc , we can change it
        // lets show what to do:
        //Stage.setFullScreenExitHint("You Can't Escape unless you press q");
        // set that key
        //Stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));


        //now adding the Scene to stage
        Stage.setScene(scene);
        // at the end we show the stage, so i have to set the scene before present the stage
        Stage.show();
    }
}