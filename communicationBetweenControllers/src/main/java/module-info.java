module com.example.communicationbetweencontrollers {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.communicationbetweencontrollers to javafx.fxml;
    exports com.example.communicationbetweencontrollers;
}