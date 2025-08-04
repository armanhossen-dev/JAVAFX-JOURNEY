module com.example.communicationbetweencontrollers {
    requires javafx.controls;
    requires javafx.fxml;

    // This is required to allow the FXML files to access the controller classes.
    opens CODE to javafx.fxml;

    // This exports the package so that other modules (including the JavaFX runtime) can see the classes.
    exports CODE;
}
