package com.mobilelogin.app.mobile_login_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class RegisterController {

    @FXML
    private Button backButton;

    @FXML
    private Text loginText;

    @FXML
    private void initialize() {
        backButton.setOnAction(event -> loadScene("home.fxml"));
        loginText.setOnMouseClicked(event -> loadScene("login.fxml"));
    }

    private void loadScene(String fxmlFile) {
        try {
            Stage stage = (Stage) backButton.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
