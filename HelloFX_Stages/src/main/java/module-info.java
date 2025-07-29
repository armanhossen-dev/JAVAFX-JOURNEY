module com.example.hellofx_stages {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hellofx_stages to javafx.fxml;
    exports com.example.hellofx_stages;
}