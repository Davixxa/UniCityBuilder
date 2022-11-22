package com.example.unicitybuildergui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {

    @FXML
    private Button button1;

    @FXML
    private ImageView imageView;

    @FXML
    public void initialize() {
        //imageView = new ImageView(getClass().getResource("Arrow.png").toExternalForm());
        //button1.setGraphic(imageView);

    }

}