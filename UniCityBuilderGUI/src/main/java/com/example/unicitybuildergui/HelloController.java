package com.example.unicitybuildergui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class HelloController {

    void selectTile(int num) {
        System.out.println(num);
    }

    @FXML
    private Button button01;

    @FXML
    private Button button1;

    @FXML
    private ImageView imageView;

    @FXML
    private Button buttonRight1;

    @FXML
    void moveRight1(MouseEvent event) {

    }

    @FXML
    void selectTile1(MouseEvent event, BuildingManager buildingManager, Building building) {
        selectTile(1);
        if(building.isDestroyed()){
            //Show repair menu
        }
        else if(buildingManager.map.containsKey(1)){
            //Show upgrade menu
        }
        else {
            //Show build menu
        }
    }

    @FXML
    void selectTile2(MouseEvent event) {
        selectTile(2);
    }

    @FXML
    void selectTile3(MouseEvent event) {
        selectTile(3);
    }

    @FXML
    void selectTile4(MouseEvent event) {
        selectTile(4);
    }

    @FXML
    void selectTile5(MouseEvent event) {
        selectTile(5);
    }

    @FXML
    void selectTile6(MouseEvent event) {
        selectTile(6);
    }

    @FXML
    void selectTile7(MouseEvent event) {
        selectTile(7);
    }

    @FXML
    void selectTile8(MouseEvent event) {
        selectTile(8);
    }

    @FXML
    void selectTile9(MouseEvent event) {
        selectTile(9);
    }



    @FXML
    public void initialize() {
        //imageView = new ImageView(getClass().getResource("Arrow.png").toExternalForm());
        //button1.setGraphic(imageView);

    }

}