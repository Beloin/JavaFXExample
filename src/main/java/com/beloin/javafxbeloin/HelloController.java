package com.beloin.javafxbeloin;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;

public class HelloController {
    @FXML
    private Label welcomeText;
    private Integer num = 0;

    @FXML
    protected void onHelloButtonClick() {
        num++;
        welcomeText.setText("Welcome to JavaFX Application! " + num);
    }
}