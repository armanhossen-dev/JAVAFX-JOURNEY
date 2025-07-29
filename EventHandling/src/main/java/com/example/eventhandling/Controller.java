package com.example.eventhandling;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML // import javafx.fxml.FXML;
    private Circle myCircle; // import javafx.scene.shape.Circle;
    private double x;
    private double y;

    public void up(ActionEvent e){ // import javafx.event.ActionEvent; for ActionEvent
        myCircle.setCenterY(y-=10); // to make them change position fast i +- 10,
        System.out.println("UP");
    }
    public void down(ActionEvent e){
        myCircle.setCenterY(y+=10);
        System.out.println("DOWN");
    }
    public void right(ActionEvent e){
        myCircle.setCenterX(x+=10);
        System.out.println("RIGHT");
    }
    public void left(ActionEvent e){
        myCircle.setCenterX(x-=10);
        System.out.println("LEFT");
    }

}