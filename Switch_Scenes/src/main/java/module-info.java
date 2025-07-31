module com.example.switch_scenes {
    // JavaFX modules required for UI and FXML
    requires javafx.controls;
    requires javafx.fxml;

    // Export the main application package
    exports com.example.switch_scenes;

    // Allow JavaFX to use reflection (for FXML controllers)
    opens com.example.switch_scenes to javafx.fxml;
}
