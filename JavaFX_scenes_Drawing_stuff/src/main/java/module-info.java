module com.example.javafx_scenes_drawing_stuff {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_scenes_drawing_stuff to javafx.fxml;
    exports com.example.javafx_scenes_drawing_stuff;
}