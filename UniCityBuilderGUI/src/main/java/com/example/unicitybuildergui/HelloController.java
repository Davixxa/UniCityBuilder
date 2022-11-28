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
    /*
    Image backgroundImage = new Image("Backgroung.png");
    Image factory1 = new Image("Factory.png");
    Image factory2 = new Image("Factory2.png");
    Image energy1;
    Image energy2;
    Image science1;
    Image science2;

     */


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
    private Button destroyButton;

    @FXML
    private Button energyButton;

    @FXML
    private Button houseButton;

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
    void buildEnergy(MouseEvent event) {
        HelloApplication.gm.buildingManager.buildBuilding(HelloApplication.gm.buildingManager.map, HelloApplication.gm, selectedTile, BuildingTypes.ENERGY);
    }

    @FXML
    void buildHouse(MouseEvent event) {
        HelloApplication.gm.buildingManager.buildBuilding(HelloApplication.gm.buildingManager.map, HelloApplication.gm, selectedTile, BuildingTypes.HOUSE);
    }

    @FXML
    void buildMoney(MouseEvent event) {
        HelloApplication.gm.buildingManager.buildBuilding(HelloApplication.gm.buildingManager.map, HelloApplication.gm, selectedTile, BuildingTypes.MONEY);
    }

    @FXML
    void buildScience(MouseEvent event) {
        HelloApplication.gm.buildingManager.buildBuilding(HelloApplication.gm.buildingManager.map, HelloApplication.gm, selectedTile, BuildingTypes.SCIENCE);
    }



    @FXML
    void goToMainMenu(MouseEvent event) {
        buildMenu.setDisable(true);
        buildMenu.setOpacity(0);

        buildingOptionsMenu.setDisable(true);
        buildingOptionsMenu.setOpacity(0);

    }


    @FXML
    void goToBuildMenu(MouseEvent event) {
        buildMenu.setDisable(false);
        buildMenu.setOpacity(1);

        buildingOptionsMenu.setDisable(true);
        buildingOptionsMenu.setOpacity(0);

    }

    @FXML
    void goToBuildingOptionsMenu(MouseEvent event) {
        buildMenu.setDisable(true);
        buildMenu.setOpacity(0);

        buildingOptionsMenu.setDisable(false);
        buildingOptionsMenu.setOpacity(1);

    }



    private void goToBuildingOptionsMenu(){
        buildMenu.setDisable(true);
        buildMenu.setOpacity(0);

        buildingOptionsMenu.setDisable(false);
        buildingOptionsMenu.setOpacity(1);

    }

    private void goToBuildMenu() {
        buildMenu.setDisable(false);
        buildMenu.setOpacity(1);

        buildingOptionsMenu.setDisable(true);
        buildingOptionsMenu.setOpacity(0);

    }


    void updateBackground(){
        Building tempBuilding = HelloApplication.gm.getBuilding(selectedTile);
        if (tempBuilding==null || tempBuilding.buildingType == BuildingTypes.HOUSE){
            //background.setImage(backgroundImage);
        }

        /*
        switch (tempBuilding.buildingType){
            case MONEY:
                switch (tempBuilding.getCurrentLevel()){
                    case 1:
                        background.setImage(factory1);
                        break;
                    case 2:
                        background.setImage(factory2);
                        break;
                }
                break;
            case ENERGY:
                switch (tempBuilding.getCurrentLevel()){
                    case 1:
                        //setImage energy1
                        background.setImage(energy1);
                        break;
                    case 2:
                        //setImage energy2
                        background.setImage(energy2);
                        break;
                }
                break;
            case SCIENCE:
                switch (tempBuilding.getCurrentLevel()){
                    case 1:
                        background.setImage(science1);
                        break;
                    case 2:
                        background.setImage(science2);
                        break;
                }
        }

         */
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
    void buildEnergyBuilding(MouseEvent event) {
        //Code that happends when clicking the button
    }

    @FXML
    void buildHouseBuilding(MouseEvent event) {
        //Code that happends when clicking the button
    }

    @FXML
    void buildMoneyBuilding(MouseEvent event) {
        //Code that happends when clicking the button
    }

    @FXML
    void buildScienceBuilding(MouseEvent event) {
        //Code that happends when clicking the button
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



    }

}