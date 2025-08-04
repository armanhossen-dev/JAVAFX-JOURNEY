package CODE;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Scene1Controller {

    @FXML
    private TextField usernameInput;

    @FXML
    private PasswordField passwordInput;

    @FXML
    private ChoiceBox<String> userTypeChoiceBox;

    @FXML
    private Label errorLabel;

    private final Map<String, String> userPasswords = new HashMap<>();

    @FXML
    public void initialize() {
        userTypeChoiceBox.setItems(FXCollections.observableArrayList(
                "Student", "House Owner", "Admin/Developer"
        ));
        userTypeChoiceBox.setValue("Student");
        userPasswords.put("Student", "123stu");
        userPasswords.put("House Owner", "123own");
        userPasswords.put("Admin/Developer", "123admin");
    }

    @FXML
    public void login(ActionEvent e) throws IOException {
        String username = usernameInput.getText();
        String password = passwordInput.getText();
        String userType = userTypeChoiceBox.getValue();

        if (userType == null) {
            errorLabel.setText("Please select a user type.");
            return;
        }

        String correctPassword = userPasswords.get(userType);

        if (password.equals(correctPassword)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
            Parent root = loader.load();

            Scene2Controller s2Controller = loader.getController();
            s2Controller.displayUserData(username, userType);

            Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);

            scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

            stage.setScene(scene);
            stage.setTitle("Dashboard");
            stage.show();
        } else {
            errorLabel.setText("Incorrect password or username. Try again.");
        }
    }
}