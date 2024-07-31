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

public class HomeController {

    @FXML
    private Button loginButton;

    @FXML
    private Button registerButton;

    @FXML
    private Text guestText;

    @FXML
    private void initialize() {
        loginButton.setOnAction(event -> loadScene("login.fxml"));
        registerButton.setOnAction(event -> loadScene("register.fxml"));
        guestText.setOnMouseClicked(event -> loadScene("guest.fxml")); // Assuming there's a guest screen
    }

    private void loadScene(String fxmlFile) {
        try {
            Stage stage = (Stage) loginButton.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
