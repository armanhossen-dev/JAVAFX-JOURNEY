module com.example.fxscenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxscenebuilder to javafx.fxml;
    exports com.example.fxscenebuilder;
}