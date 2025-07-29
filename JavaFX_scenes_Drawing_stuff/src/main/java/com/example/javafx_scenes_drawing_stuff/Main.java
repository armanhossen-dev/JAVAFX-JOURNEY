package com.example.javafx_scenes_drawing_stuff;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {

        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        //                            width, height, color
        Scene scene1 = new Scene(root,580,680, Color.SKYBLUE);
        Stage stg1 = new Stage();


        Image icon = new Image("logo.png");
        // if i add any icon so i must have to add the name, if its empty like this Image icon = new Image(""); then this will not run
        stg1.getIcons().add(icon);
        stg1.setTitle("App2");


        //lets set some text inside the window
        Text text = new Text();  //import javafx.scene.text.Text;
        text.setText("Dream House!!!"); // we need to set where this text will be show
        text.setX(50);
        text.setY(50);
        //text.setOnMouseEntered(e -> text.setFill(Color.WHITE));
        //text.setOnMouseExited(e -> text.setFill(Color.BLACK));

        //finaly we have to add this text to our root node,
//        root.getChildren().add(text); // now we will see our text in the windowwww
        //lets change few properties of this text ,
        //           Font.font("FontName", size)
        text.setFont(Font.font("Roboto", FontWeight.BOLD, 32)); // import javafx.scene.text.FontWeight;
        //text.setFont(Font.font("Roboto", FontPosture.ITALIC, 20));
        // FontNameS ->
        // Segoe UI / Arial / Georgia / Open Sans / Lato / Roboto / Calibri /
        // Tahoma / Helvetica / Noto Sans / Inter / Poppins / Montserrat / Source Sans Pro
        text.setFill(Color.WHITE);

        //creating a line
        Line line = new Line(); //import javafx.scene.shape.Line;
        line.setStartX(50); // Set the X-coordinate for the starting point of the line (40px from the left of the scene)
        line.setStartY(60);// Set the Y-coordinate for the starting point of the line (60px from the top of the scene)
        line.setEndX(520);// Set the X-coordinate for the ending point of the line (500px from the left of the scene)
        line.setEndY(60);// Set the Y-coordinate for the ending point of the line (60px from the top of the scene, same as startY → horizontal line)

        //lets change the stroke of the line
        line.setStrokeWidth(3);
        line.setStroke(Color.BLACK);
        line.setOpacity(.9); //0 to 0.1-.9 to 1

        // rotate this line
        Line rline = new Line();
        rline.setStartX(20);
        rline.setStartY(40);
        rline.setEndX(60);
        rline.setEndY(40);

        rline.setStrokeWidth(10);
        rline.setStroke(Color.RED);
        rline.setOpacity(1);
        rline.setRotate(90); // value in degree


        Rectangle recta1 = new Rectangle();
        recta1.setX(50);
        recta1.setY(80);
        recta1.setWidth(300);
        recta1.setHeight(150);
        recta1.setFill(Color.GREEN);

        // Hover effect
//        recta1.setOnMouseEntered(e -> recta1.setFill(Color.RED));
//        recta1.setOnMouseExited(e -> recta1.setFill(Color.GREEN));


        Circle c1 = new Circle();
        c1.setCenterX(200);
        c1.setCenterY(155);
        c1.setRadius(50);
        c1.setFill(Color.RED);

        // Hover effect
        recta1.setOnMouseEntered(e -> {
            recta1.setFill(Color.WHITE);
//            c1.setFill(Color.RED); // i can change the color but not now, Now let's leave it like this.
        });

        recta1.setOnMouseExited(e -> {
            recta1.setFill(Color.GREEN);
//            c1.setFill(Color.RED);
        });

        Rectangle rectLine = new Rectangle();
        rectLine.setFill(Color.SILVER);
        rectLine.setWidth(10);
        rectLine.setHeight(580);
        rectLine.setStroke(Color.BLACK);
        rectLine.setStrokeWidth(2);
        rectLine.setX(50);
        rectLine.setY(80);

        //lets creat triangle, to create this we have to use PolygonClass
        Polygon tri1 = new Polygon(); // import javafx.scene.shape.Polygon;
        tri1.getPoints().setAll(
                60.0, 660.0, // coordinates with double value
                120.0, 660.0,
                60.0, 600.0
        );
        tri1.setFill(Color.GRAY);


        Image img01 = new Image("Dream.png");
        ImageView iv = new ImageView(img01);
        iv.setX(90);
        iv.setY(172);
        iv.setFitWidth(500);
        iv.setFitHeight(500);


        //add to screen
        root.getChildren().add(text); // now we will see our text in the windowwww
        root.getChildren().add(line);
        root.getChildren().add(rline);
        root.getChildren().add(recta1);
        root.getChildren().add(c1);
        root.getChildren().add(rectLine);
        root.getChildren().add(tri1);
        root.getChildren().add(iv);


        stg1.setScene(scene1);
        stg1.show();

    }
}