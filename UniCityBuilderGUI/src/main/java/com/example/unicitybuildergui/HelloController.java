package com.example.unicitybuildergui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HelloController {

    // Value from 1-9
    int selectedTile;
    GameMangaer gameMangaer;
    //Oliver du er træls
    Path currentWorkingDir = Paths.get("").toAbsolutePath();
    //Image backgroundImage = new Image(this.getClass().getResource("src/main/java/com/example/unicitybuildergui/Backgroung.png").toString());
    Image backgroundImage;
    Image factory1;
    Image factory2;
    Image energy1;
    Image energy2;
    Image science1;
    Image science2;


    @FXML
    private Label energyLabel;

    @FXML
    private Label moneyLabel;

    @FXML
    private Label scienceLabel;


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
    private Label buildingLabel;

    @FXML
    private Label infoTxt;

    @FXML
    private Button infoButton;

    @FXML
    private Button continueButton;

    @FXML
    private Button endTurnButton;

    public HelloController() throws FileNotFoundException {
    }

    // Oliver, please fix this with the arguments and code you need.
    @FXML
    void showInfoTxt(MouseEvent event) {
        // do stuff
        showTxtBtns();

        Building tempBuilding = HelloApplication.gm.getBuilding(selectedTile);
        if (tempBuilding==null) {
            //When there is no building txt
            infoTxt.setText("");

            return;
        }


        switch (tempBuilding.buildingType) {
            case MONEY:
                switch (tempBuilding.getCurrentLevel()) {
                    case 1:
                        infoTxt.setText("");
                        break;
                    case 2:
                        infoTxt.setText("");
                        break;
                }
                break;
            case ENERGY:
                switch (tempBuilding.getCurrentLevel()) {
                    case 1:
                        infoTxt.setText("In the late 18th century, we see the first coal factories located in England. Coal was the \n basis of the industrial revolution and the mechanization of the world. Coal generated 37% of global electricity in \n 2022 but it is also the leading source in CO2 emissions producing 15.1 billion metric tons not cool :(");
                        break;
                    case 2:
                        infoTxt.setText("Today (2022) fossil fuels amount to 60% of total global electricity generation but it also emits 36.6 \n billion tons of CO2. That is bad for the environment, and it is the cause of climate change and the\n warming of our planet to > 2*C");
                        break;

                    case 3:
                        infoTxt.setText("Renewable energy amounts to 28,1% of global electricity generation (2022), they emit little to no emission and therefore combat the warming of our planets. Renewables include solar, wind, thermal and hydro");
                        break;
                }
                break;
            case SCIENCE:
                switch (tempBuilding.getCurrentLevel()) {
                    case 1:
                        infoTxt.setText("primary schools are for children between the age of 5-15, these schools contribute to fundamental learning in math, science, arts, culture, and language. ");
                        break;
                    case 2:
                        infoTxt.setText("Collage is for teens between the age of 15-18, these schools contribute to more advanced topics and extending the learnings from primary schools");
                        break;
                    case 3:
                        infoTxt.setText("University is a specialized school for a subject you choose, here you are taught by industry leaders to understand your chosen subject to its fullest extend and gives you the full knowledge of the chosen field");
                        break;
                }
                break;
            case HOUSE:
                //When a house
                infoTxt.setText("Home is where the uvidenhed are");
                break;

        }

        infoTxt.setText("In the late 18th century, we see the first coal factories located in England. Coal was the \n basis of the industrial revolution and the mechanization of the world. Coal generated 37% of global electricity in \n 2022 but it is also the leading source in CO2 emissions producing 15.1 billion metric tons not cool :( ");

    }

    private void showTxtBtns() {
        infoTxt.setVisible(true);
        infoTxt.setOpacity(1);
        infoTxt.setDisable(false);
        infoButton.setOpacity(0);
        infoButton.setDisable(true);
        continueButton.setOpacity(1);
        continueButton.setDisable(false);
        endTurnButton.setOpacity(0);
        endTurnButton.setDisable(true);


        //Hide alle building buttons
        hideAllBuildButtons();


    }

    @FXML
    void hideInfoTxt(MouseEvent event) {
        hideTxtBtns();

    }

    private void hideTxtBtns() {
        //When continue is pressed
        infoTxt.setVisible(false);
        infoTxt.setOpacity(0);
        infoTxt.setDisable(true);
        infoButton.setOpacity(1);
        infoButton.setDisable(false);
        continueButton.setOpacity(0);
        continueButton.setDisable(true);
        endTurnButton.setOpacity(1);
        endTurnButton.setDisable(false);

        selectTile(selectedTile);
    }

    void updateUI() {
        moneyLabel.setText(String.valueOf(HelloApplication.gm.moneyManager.getCurrentMoney()));
        scienceLabel.setText(String.valueOf(HelloApplication.gm.scienceManager.getCurrentScience()));
        energyLabel.setText(String.valueOf(HelloApplication.gm.energyManager.getCurrentEnergy()));
        selectTile(selectedTile); // Redraws menu just in case.
    }

    @FXML
    void buildEnergy(MouseEvent event) {
        int newMoney = HelloApplication.gm.moneyManager.getCurrentMoney() - new EnergyBuilding(0).buildingCost;
        if (newMoney < 0) {
            System.out.println("Error: Insufficient funds");
        }
        else {
            HelloApplication.gm.moneyManager.setCurrentMoney(newMoney);
            HelloApplication.gm.buildingManager.buildBuilding(HelloApplication.gm.buildingManager.map, HelloApplication.gm, selectedTile, BuildingTypes.ENERGY);
            goToBuildingOptionsMenu();
        }
        updateUI();

    }

    @FXML
    void buildHouse(MouseEvent event) {

        int newMoney = HelloApplication.gm.moneyManager.getCurrentMoney() - new House(0).buildingCost;
        if (newMoney < 0) {
            System.out.println("Error: Insufficient funds");
        }
        else {
            HelloApplication.gm.moneyManager.setCurrentMoney(newMoney);
            HelloApplication.gm.buildingManager.buildBuilding(HelloApplication.gm.buildingManager.map, HelloApplication.gm, selectedTile, BuildingTypes.HOUSE);
            goToBuildingOptionsMenu();
        }
        updateUI();
    }

    @FXML
    void buildMoney(MouseEvent event) {


        int newMoney = HelloApplication.gm.moneyManager.getCurrentMoney() - new MoneyBuilding(0).buildingCost;
        if (newMoney < 0) {
            System.out.println("Error: Insufficient funds");
        }
        else {
            HelloApplication.gm.moneyManager.setCurrentMoney(newMoney);
            HelloApplication.gm.buildingManager.buildBuilding(HelloApplication.gm.buildingManager.map, HelloApplication.gm, selectedTile, BuildingTypes.MONEY);
            goToBuildingOptionsMenu();
        }
        updateUI();
        updateBackground();

    }

    @FXML
    void buildScience(MouseEvent event) {
        int newMoney = HelloApplication.gm.moneyManager.getCurrentMoney() - new ScienceBuilding(0).buildingCost;
        if (newMoney < 0) {
            System.out.println("Error: Insufficient funds");
        }
        else {
            HelloApplication.gm.moneyManager.setCurrentMoney(newMoney);
            HelloApplication.gm.buildingManager.buildBuilding(HelloApplication.gm.buildingManager.map, HelloApplication.gm, selectedTile, BuildingTypes.SCIENCE);
            goToBuildingOptionsMenu();
        }
        updateUI();
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


    private void goToBuildingOptionsMenu() {
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

    private void hideAllBuildButtons() {
        buildMenu.setDisable(true);
        buildMenu.setOpacity(0);

        buildingOptionsMenu.setDisable(true);
        buildingOptionsMenu.setOpacity(0);

    }


    void updateBackground() {
        Building tempBuilding = HelloApplication.gm.getBuilding(selectedTile);
        if (tempBuilding==null) {
            background.setImage(backgroundImage);
            buildingLabel.setText("FUCKING TOMT!!!");
            return;
        }
        else if (tempBuilding != null) {
            if (tempBuilding.buildingType == BuildingTypes.HOUSE) {
                background.setImage(backgroundImage);
                //Temp building
                buildingLabel.setText("HOUSEBUILDING !!!!!");
                return;
            }
        }


        switch (tempBuilding.buildingType) {
            case MONEY:
                switch (tempBuilding.getCurrentLevel()) {
                    case 1:
                        background.setImage(factory1);
                        //Temp building
                        buildingLabel.setText("MONEYBUILDING LVL1 !!!!!");
                        break;
                    case 2:
                        background.setImage(factory2);
                        //Temp building
                        buildingLabel.setText("MONEYBUILDING LVL2 !!!!!");
                        break;
                }
                break;
            case ENERGY:
                switch (tempBuilding.getCurrentLevel()) {
                    case 1:
                        //setImage energy1
                        background.setImage(energy1);
                        //Temp building
                        buildingLabel.setText("ENERGYBUILDING LVL1 !!!!!");
                        break;
                    case 2:
                        //setImage energy2
                        background.setImage(energy2);
                        //Temp building
                        buildingLabel.setText("ENERGYBUILDING LVL2 !!!!!");
                        break;
                }
                break;
            case SCIENCE:
                switch (tempBuilding.getCurrentLevel()) {
                    case 1:
                        background.setImage(science1);
                        //Temp building
                        buildingLabel.setText("SCIENCEBUILDING LVL1 !!!!!");
                        break;
                    case 2:
                        background.setImage(science2);
                        //Temp building
                        buildingLabel.setText("SCIENCEBUILDING LVL2 !!!!!");
                        break;
                }
                break;
        }
    }

    @FXML
    void endTurn(MouseEvent event) {

        //Running EndTurn method in TurnManager
        TurnManager tempEndTurn = HelloApplication.gm.turnManager;
        tempEndTurn.endTurn(HelloApplication.gm.polutionManager,
                HelloApplication.gm.scienceManager,
                HelloApplication.gm.energyManager,
                HelloApplication.gm.moneyManager,
                HelloApplication.gm.infastructureManager,
                HelloApplication.gm.disasterManager,
                HelloApplication.gm.buildingManager,
                HelloApplication.gm);


        // Updating currency labels
        MoneyManager tempMoney = HelloApplication.gm.moneyManager;
        ScienceManager tempScience = HelloApplication.gm.scienceManager;
        EnergyManager tempEnergy = HelloApplication.gm.energyManager;

        //tempMoney.calcMoneyGain();
        moneyLabel.setText(String.valueOf(tempMoney.getCurrentMoney()));

        //tempScience.calcScienceGain();
        scienceLabel.setText(String.valueOf(tempScience.getCurrentScience()));

        //tempEnergy.calcEnergyGain();
        energyLabel.setText(String.valueOf(tempEnergy.getCurrentEnergy()));

        showTxtBtns();

    }


    void selectTile(int num) {
        selectedTile = num;
        System.out.println(selectedTile);
        updateBackground();
        // This is how you can change the background image in the imageview
        // background.setImage();`





        //Update menu
        Building tempBuilding = HelloApplication.gm.getBuilding(selectedTile);
        if (tempBuilding == null) {
            goToBuildMenu();
        } else {
            goToBuildingOptionsMenu();
        }

        if(HelloApplication.gm.getBuilding(selectedTile) == null)
            return;

        //Check if buildings are destroyed
        if(HelloApplication.gm.getBuilding(selectedTile).isDestroyed()){
            buildingLabel.setText("Fucking destroyed");
            goToBuildingOptionsMenu();

        }

    }


    @FXML
    void upgradeBuilding(MouseEvent event) {
        Building tempBuilding = HelloApplication.gm.getBuilding(selectedTile);
        MoneyManager tempMoney = HelloApplication.gm.moneyManager;
        if (HelloApplication.gm.scienceManager.getScienceLevel() >= tempBuilding.getCurrentLevel()+1){
            tempBuilding.upgrade(tempMoney);
        }


        //Set image to a higher upgrade building
        updateBackground();
    }

    @FXML
    void destroyBuilding(MouseEvent event) {
        /*
        Building tempBuilding = HelloApplication.gm.getBuilding(selectedTile);
        tempBuilding.setDestroyed(true);

         */

        HelloApplication.gm.buildingManager.remove(selectedTile);

        //Set image to a destroyed building
        updateBackground();
        goToBuildMenu();
    }

    @FXML
    void repairBuilding(MouseEvent event) {
        Building tempBuilding = HelloApplication.gm.getBuilding(selectedTile);
        MoneyManager tempMoney = HelloApplication.gm.moneyManager;
        tempBuilding.repair(tempMoney);

        //Set image to a repaired building
        updateBackground();
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
    private ImageView imageView1_1;

    @FXML
    private Button button1_1;





    @FXML
    void moveRight1(MouseEvent event) {

    }

    @FXML
    void selectTile1(MouseEvent event) {
        selectTile(1);

        /*
        if (building.isDestroyed()) {
            //Show repair menu
        } else if (buildingManager.map.containsKey(1)) {
            //Show upgrade menu
        } else {

            //Show build menu
        }

         */

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
    void placeEnergy(MouseEvent event) {

    }

    @FXML
    void placeHouse(MouseEvent event) {


    }

    @FXML
    void placeMoney(MouseEvent event) {

    }

    @FXML
    void placeScience(MouseEvent event) {

    }

    @FXML
    void cancelMenu(MouseEvent event) {

    }

    


    @FXML
    public void initialize() {

        buildMenu.setDisable(true);
        buildMenu.setOpacity(0);

        buildingOptionsMenu.setDisable(true);
        buildingOptionsMenu.setOpacity(0);

        backgroundImage = new Image("file:src/main/java/com/example/unicitybuildergui/Backgroung.png");
        factory1 = new Image("file:src/main/java/com/example/unicitybuildergui/Factory.png");
        factory2 = new Image("file:src/main/java/com/example/unicitybuildergui/Factory2.png");

        moneyLabel.setText(""+HelloApplication.gm.moneyManager.getCurrentMoney());
        scienceLabel.setText(""+HelloApplication.gm.scienceManager.getCurrentScience());
        energyLabel.setText(""+HelloApplication.gm.energyManager.getCurrentEnergy());


        selectTile(1);

        infoTxt.setVisible(false);
        continueButton.setOpacity(0);
        continueButton.setDisable(true);
        infoTxt.setOpacity(0);
        infoTxt.setDisable(true);


    }

}