package com.example.unicitybuildergui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

public class HelloController {

    // Value from 1-9
    int selectedTile;
    GameMangaer gameMangaer;



    @FXML
    private ImageView background;

    @FXML
    private Button buildButton;

    @FXML
    private HBox buildMenu;

    @FXML
    private Button buildingOptionsButton;

    @FXML
    private HBox buildingOptionsMenu;

    @FXML
    private Button cancelButton;

    @FXML
    private Button destroyButton;

    @FXML
    private Button energyButton;

    @FXML
    private Button houseButton;

    @FXML
    private HBox mainMenu;

    @FXML
    private Button moneyButton;

    @FXML
    private Button repairButton;

    @FXML
    private Button scienceButton;

    @FXML
    private Button upgradeButton;

    @FXML
    private Button selectTile1;

    @FXML
    private Button selectTile2;

    @FXML
    private Button selectTile3;

    @FXML
    private Button selectTile4;

    @FXML
    private Button selectTile5;

    @FXML
    private Button selectTile6;

    @FXML
    private Button selectTile7;

    @FXML
    private Button selectTile8;

    @FXML
    private Button selectTile9;


    @FXML
    void goToMainMenu(MouseEvent event) {
        buildMenu.setDisable(true);
        buildMenu.setOpacity(0);

        buildingOptionsMenu.setDisable(true);
        buildingOptionsMenu.setOpacity(0);

        mainMenu.setDisable(false);
        mainMenu.setOpacity(1);
    }


    @FXML
    void goToBuildMenu(MouseEvent event) {
        buildMenu.setDisable(false);
        buildMenu.setOpacity(1);

        buildingOptionsMenu.setDisable(true);
        buildingOptionsMenu.setOpacity(0);

        mainMenu.setDisable(true);
        mainMenu.setOpacity(0);
    }

    @FXML
    void goToBuildingOptionsMenu(MouseEvent event) {
        buildMenu.setDisable(true);
        buildMenu.setOpacity(0);

        buildingOptionsMenu.setDisable(false);
        buildingOptionsMenu.setOpacity(1);

        mainMenu.setDisable(true);
        mainMenu.setOpacity(0);
    }

    void updateBackground(){
    }

    private void goToBuildingOptionsMenu(){
        buildMenu.setDisable(true);
        buildMenu.setOpacity(0);

        buildingOptionsMenu.setDisable(false);
        buildingOptionsMenu.setOpacity(1);

        mainMenu.setDisable(true);
        mainMenu.setOpacity(0);
    }

    private void goToBuildMenu() {
        buildMenu.setDisable(false);
        buildMenu.setOpacity(1);

        buildingOptionsMenu.setDisable(true);
        buildingOptionsMenu.setOpacity(0);

        mainMenu.setDisable(true);
        mainMenu.setOpacity(0);
    }






    void selectTile(int num) {
        selectedTile = num;
        System.out.println(selectedTile);
        updateBackground();
        // This is how you can change the background image in the imageview
        // background.setImage();`


        //Update menu
        Building tempBuilding = HelloApplication.gm.getBuilding(selectedTile);
        if(tempBuilding == null){
            goToBuildMenu();
        }else {
            goToBuildingOptionsMenu();
        }

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
    void selectTile1(MouseEvent event) {
        selectTile(1);

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

        buildMenu.setDisable(true);
        buildMenu.setOpacity(0);

        buildingOptionsMenu.setDisable(true);
        buildingOptionsMenu.setOpacity(0);

        mainMenu.setDisable(false);
        mainMenu.setOpacity(1);


    }

}