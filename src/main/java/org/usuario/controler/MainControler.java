package org.usuario.controler;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainControler {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}