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

    boolean textBtnsShown = false;

    // Value from 1-9
    int selectedTile;
    GameMangaer gameMangaer;
    Path currentWorkingDir = Paths.get("").toAbsolutePath();
    //Image backgroundImage = new Image(this.getClass().getResource("src/main/java/com/example/unicitybuildergui/Backgroung.png").toString());
    Image backgroundImage;
    Image money1;
    Image money2;
    Image money3;
    Image energy1;
    Image energy2;
    Image energy3;
    Image science1;
    Image science2;
    Image science3;
    Image house;
    Image scienceIcon;
    Image moneyIcon;
    Image energyIcon;

    //References to our FXML tags
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

    @FXML
    private Label statTxt;

    private int count;

    @FXML
    private Button upgradeInfraBtn;

    @FXML
    private ImageView redXImage;

    @FXML
    private Label infrastructurLvl;

    @FXML
    private Label infraCost;

    @FXML
    private Label scienceLvlLabel;

    @FXML
    private ImageView gameOverScreen;

    @FXML
    private ImageView tile1Image;

    @FXML
    private ImageView tile2Image;

    @FXML
    private ImageView tile3Image;

    @FXML
    private ImageView tile4Image;

    @FXML
    private ImageView tile5Image;

    @FXML
    private ImageView tile6Image;

    @FXML
    private ImageView tile7Image;

    @FXML
    private ImageView tile8Image;

    @FXML
    private ImageView tile9Image;

    @FXML
    private Label costEnergy;

    @FXML
    private Label costHouse;

    @FXML
    private Label costMoney;

    @FXML
    private Label costScience;


    public HelloController() throws FileNotFoundException {
    }

    // Oliver, please fix this with the arguments and code you need.
    @FXML
    void showInfoTxt(MouseEvent event) {
        // do stuff
        Building tempBuilding = HelloApplication.gm.getBuilding(selectedTile);
        if (tempBuilding==null) {
            //When there is no building txt
            infoTxt.setText("There is no building here");
            statTxt.setText("");
            return;
        }




        switch (tempBuilding.buildingType) {
            case MONEY:
                statTxt.setText("Lvl is" + tempBuilding.getCurrentLevel() + "\n" + "Upgrade cost: " + tempBuilding.getUpgradeCost() + "\n" + "Yield is: " + tempBuilding.getYield() + "\n" + "\n" + "Energy upkeep cost: " + tempBuilding.getEnergyUpKeepCost());
                switch (tempBuilding.getCurrentLevel()) {
                    case 1:
                        //Info text
                        infoTxt.setText("The market stand is an early attempt at creating a business, \n you display your products, and the buyer can barter \n for the item they want it was very efficient and \n anyone can do It, it Is still used today in \n low-income countries and farmers markets. ");
                        break;
                    case 2:
                        //Info text
                        infoTxt.setText("The early supermarket became a way to store, refrigerate \n and expand on the idea of the market stand it became \n popular in the 1950’s and gave rise to supermarket \n giants Walmart, Target & Cosco ");

                        break;
                }
                break;
            case ENERGY:
                statTxt.setText("Lvl is" + tempBuilding.getCurrentLevel() + "\n" + "Upgrade cost: " + tempBuilding.getUpgradeCost() + "\n" + "Yield is: " + tempBuilding.getYield() + "\n" + "Money upkeep cost: " + tempBuilding.getMoneyUpKeepCost() + "\n" + "Energy upkeep cost: " + tempBuilding.getEnergyUpKeepCost());
                switch (tempBuilding.getCurrentLevel()) {
                    case 1:
                        infoTxt.setText("In the late 18th century, we see the first coal factories \n located in England. Coal was the basis of the industrial \n revolution and the mechanization of the world. \n Coal generated 37% of global electricity in 2022 \n but it is also  the leading source in CO2 emissions producing \n 15.1 billion metric tons");
                        break;
                    case 2:
                        infoTxt.setText("Today (2022) fossil fuels amount to 60% of total global \n electricity generation but it also emits 36.6 billion \n tons of CO2. That is bad for the environment, \n and it is the cause of climate change and the\n warming of our planet to > 2*C");

                        break;

                    case 3:
                        infoTxt.setText("Renewable energy amounts to 28,1% of global electricity \n generation (2022), they emit little to no emission and \n therefore combat the warming of our planets. \n Renewables include solar, wind, thermal \n and hydro");

                        break;
                }
                break;
            case SCIENCE:
                statTxt.setText("Lvl is" + tempBuilding.getCurrentLevel() + "\n" + "Upgrade cost: " + tempBuilding.getUpgradeCost() + "\n" + "Yield is: " + tempBuilding.getYield() + "\n" + "Money upkeep cost: " + tempBuilding.getMoneyUpKeepCost() + "\n" + "Energy upkeep cost: " + tempBuilding.getEnergyUpKeepCost());
                switch (tempBuilding.getCurrentLevel()) {
                    case 1:
                        infoTxt.setText("primary schools are for children between the age of 5-15, \n these schools contribute to fundamental learning in math, \n science, arts, culture, and language. ");

                        break;
                    case 2:
                        infoTxt.setText("Collage is for teens between the age of 15-18, \n these schools contribute to more advanced topics and \n extending the learnings from primary schools");

                        break;
                    case 3:
                        infoTxt.setText("University is a specialized school for a subject \n you choose, here you are taught by industry leaders to \n understand your chosen subject to its fullest extend \n and gives you the full knowledge of the chosen \n field");

                        break;
                }
                break;
            case HOUSE:
                statTxt.setText("Money upkeep cost: " + tempBuilding.getMoneyUpKeepCost() + "\n" + "Energy upkeep cost: " + tempBuilding.getEnergyUpKeepCost());

                //When a house
                infoTxt.setText("Home is where the uvidenhed are");
                break;

        }

        showTxtBtns();

    }
    //Our text buttons
    private void showTxtBtns() {
        infoTxt.setVisible(true);
        infoTxt.setOpacity(1);
        infoTxt.setDisable(false);
        /*
        statTxt.setVisible(true);
        statTxt.setOpacity(1);
        statTxt.setDisable(false);

         */
        infoButton.setOpacity(0);
        infoButton.setDisable(true);
        continueButton.setOpacity(1);
        continueButton.setDisable(false);
        endTurnButton.setOpacity(0);
        endTurnButton.setDisable(true);


        //Hide alle building buttons
        hideAllBuildButtons();

        /*
        int count = 0;
        System.out.println("count " + count);

         */

        textBtnsShown = true;

    }

    @FXML
    void hideInfoTxt(MouseEvent event) {

        if(count == 1 || statTxt.getText().length() == 0){
            hideTxtBtns();
            count = 0;

        }else{
            infoTxt.setVisible(false);
            infoTxt.setOpacity(0);
            infoTxt.setDisable(true);
            statTxt.setVisible(true);
            statTxt.setOpacity(1);
            statTxt.setDisable(false);
            count++;

            textBtnsShown = false;

        }



    }

    private void hideTxtBtns() {
        //When continue is pressed
        infoTxt.setVisible(false);
        infoTxt.setOpacity(0);
        infoTxt.setDisable(true);
        statTxt.setVisible(false);
        statTxt.setOpacity(0);
        statTxt.setDisable(true);

        // Reset the status message, otherwise the message will show up on every turn.
        HelloApplication.gm.disasterManager.setStatusMessage("");

        infoButton.setOpacity(1);
        infoButton.setDisable(false);
        continueButton.setOpacity(0);
        continueButton.setDisable(true);
        endTurnButton.setOpacity(1);
        endTurnButton.setDisable(false);

        selectTile(selectedTile);
    }

    @FXML
    void upgradeInfra(MouseEvent event) {
        InfastructureManager tempInfra = HelloApplication.gm.infastructureManager;
        String res = tempInfra.upgrade(HelloApplication.gm.moneyManager);

        if(res != null) {
            infoTxt.setText(res);
            statTxt.setText(""); // Set it to an empty string to skip.
            hideAllBuildButtons();
            showTxtBtns();
        }

        updateUI(false);
    }


    void updateUI() {
        moneyLabel.setText(String.valueOf(HelloApplication.gm.moneyManager.getCurrentMoney()));
        scienceLabel.setText(String.valueOf(HelloApplication.gm.scienceManager.getCurrentScience()));
        energyLabel.setText(String.valueOf(HelloApplication.gm.energyManager.getCurrentEnergy()));
        selectTile(selectedTile); // Redraws menu just in case.
        infrastructurLvl.setText("Infrastructure level:"+ HelloApplication.gm.infastructureManager.getLevel());
        infraCost.setText("" + HelloApplication.gm.infastructureManager.getLevel()*150);
        scienceLvlLabel.setText("Science Level: " + HelloApplication.gm.scienceManager.getScienceLevel());
        updateIcons();
    }

    // Method overloading of updateUI so we don't break existing functionality.
    void updateUI(boolean reselectTile) {
        moneyLabel.setText(String.valueOf(HelloApplication.gm.moneyManager.getCurrentMoney()));
        scienceLabel.setText(String.valueOf(HelloApplication.gm.scienceManager.getCurrentScience()));
        energyLabel.setText(String.valueOf(HelloApplication.gm.energyManager.getCurrentEnergy()));
        if (reselectTile)
            selectTile(selectedTile); // Redraws menu just in case.
        infrastructurLvl.setText("Infrastructure level:"+ HelloApplication.gm.infastructureManager.getLevel());
        infraCost.setText("" + HelloApplication.gm.infastructureManager.getLevel()*200);
        scienceLvlLabel.setText("Science Level: " + HelloApplication.gm.scienceManager.getScienceLevel());

        updateIcons();
    }
    public void updateIcons(){
        for (int i = 1;i<=9; i++) {
            if (HelloApplication.gm.getBuilding(i) == null) {
                continue;
            }
            Building tempBuilding = HelloApplication.gm.getBuilding(i);
            switch (tempBuilding.buildingType) {
                case SCIENCE:
                    switch (i) {
                        case 1:
                            tile1Image.setImage(scienceIcon);
                            break;
                        case 2:
                            tile2Image.setImage(scienceIcon);
                            break;
                        case 3:
                            tile3Image.setImage(scienceIcon);
                            break;
                        case 4:
                            tile4Image.setImage(scienceIcon);
                            break;
                        case 5:
                            tile5Image.setImage(scienceIcon);
                            break;
                        case 6:
                            tile6Image.setImage(scienceIcon);
                            break;
                        case 7:
                            tile7Image.setImage(scienceIcon);
                            break;
                        case 8:
                            tile8Image.setImage(scienceIcon);
                            break;
                        case 9:
                            tile9Image.setImage(scienceIcon);
                            break;

                    }
                    break;
                case ENERGY:
                    switch (i) {
                        case 1:
                            tile1Image.setImage(energyIcon);
                            break;
                        case 2:
                            tile2Image.setImage(energyIcon);
                            break;
                        case 3:
                            tile3Image.setImage(energyIcon);
                            break;
                        case 4:
                            tile4Image.setImage(energyIcon);
                            break;
                        case 5:
                            tile5Image.setImage(energyIcon);
                            break;
                        case 6:
                            tile6Image.setImage(energyIcon);
                            break;
                        case 7:
                            tile7Image.setImage(energyIcon);
                            break;
                        case 8:
                            tile8Image.setImage(energyIcon);
                            break;
                        case 9:
                            tile9Image.setImage(energyIcon);
                            break;

                    }
                    break;
                case MONEY:
                    switch (i) {
                        case 1:
                            tile1Image.setImage(moneyIcon);
                            break;
                        case 2:
                            tile2Image.setImage(moneyIcon);
                            break;
                        case 3:
                            tile3Image.setImage(moneyIcon);
                            break;
                        case 4:
                            tile4Image.setImage(moneyIcon);
                            break;
                        case 5:
                            tile5Image.setImage(moneyIcon);
                            break;
                        case 6:
                            tile6Image.setImage(moneyIcon);
                            break;
                        case 7:
                            tile7Image.setImage(moneyIcon);
                            break;
                        case 8:
                            tile8Image.setImage(moneyIcon);
                            break;
                        case 9:
                            tile9Image.setImage(moneyIcon);
                            break;

                    }
                    break;
            }
        }*/
    }

    @FXML
    void buildEnergy(MouseEvent event) {
        int newMoney = HelloApplication.gm.moneyManager.getCurrentMoney() - new EnergyBuilding(0).buildingCost;
        if (newMoney < 0) {
            infoTxt.setText("Error: Insufficient funds.");
            statTxt.setText(""); // Set it to an empty string to skip.
            hideAllBuildButtons();
            showTxtBtns();
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
            infoTxt.setText("Error: Insufficient funds.");
            statTxt.setText(""); // Set it to an empty string to skip.
            hideAllBuildButtons();
            showTxtBtns();
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
            infoTxt.setText("Error: Insufficient funds.");
            statTxt.setText(""); // Set it to an empty string to skip.
            hideAllBuildButtons();
            showTxtBtns();
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
            infoTxt.setText("Error: Insufficient funds.");
            statTxt.setText(""); // Set it to an empty string to skip.
            hideAllBuildButtons();
            showTxtBtns();
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

        upgradeInfraBtn.setDisable(false);
        upgradeInfraBtn.setOpacity(1);

        infraCost.setOpacity(1);

    }

    private void goToBuildMenu() {
        buildMenu.setDisable(false);
        buildMenu.setOpacity(1);

        buildingOptionsMenu.setDisable(true);
        buildingOptionsMenu.setOpacity(0);

        upgradeInfraBtn.setDisable(false);
        upgradeInfraBtn.setOpacity(1);

        infraCost.setOpacity(1);

    }

    private void hideAllBuildButtons() {
        buildMenu.setDisable(true);
        buildMenu.setOpacity(0);

        buildingOptionsMenu.setDisable(true);
        buildingOptionsMenu.setOpacity(0);

        upgradeInfraBtn.setDisable(true);
        upgradeInfraBtn.setOpacity(0);

        infraCost.setOpacity(0);


    }


    void updateBackground() {
        Building tempBuilding = HelloApplication.gm.getBuilding(selectedTile);
        if (tempBuilding==null) {
            background.setImage(backgroundImage);
            buildingLabel.setText("Empty");
            return;
        }
        else if (tempBuilding != null) {
            if (tempBuilding.buildingType == BuildingTypes.HOUSE) {
                background.setImage(backgroundImage);
                //Temp building
                buildingLabel.setText("House Building");
                return;
            }
        }


        switch (tempBuilding.buildingType) {
            case MONEY:
                switch (tempBuilding.getCurrentLevel()) {
                    case 1:
                        background.setImage(money1);
                        //Temp building
                        buildingLabel.setText("Money Building lvl 1");
                        break;
                    case 2:
                        background.setImage(money2);
                        //Temp building
                        buildingLabel.setText("Money Building lvl 2");
                        break;
                    case 3:
                        background.setImage(money3);
                }
                break;
            case ENERGY:
                switch (tempBuilding.getCurrentLevel()) {
                    case 1:
                        //setImage energy1
                        background.setImage(energy1);
                        //Temp building
                        buildingLabel.setText("Energy Building lvl 1");
                        break;
                    case 2:
                        //setImage energy2
                        background.setImage(energy2);
                        //Temp building
                        buildingLabel.setText("Energy Building lvl 2");
                        break;
                    case 3:
                        background.setImage(energy3);
                }
                break;
            case SCIENCE:
                switch (tempBuilding.getCurrentLevel()) {
                    case 1:
                        background.setImage(science1);
                        //Temp building
                        buildingLabel.setText("Science Building lvl 1");
                        break;
                    case 2:
                        background.setImage(science2);
                        //Temp building
                        buildingLabel.setText("Science Building lvl 2");
                        break;
                    case 3:
                        background.setImage(science3);
                }
                break;
            case HOUSE:
                background.setImage(house);
        }
    }

    @FXML
    void endTurn(MouseEvent event) {

        //Running EndTurn method in TurnManager
        TurnManager tempEndTurn = HelloApplication.gm.turnManager;
        tempEndTurn.endTurn(HelloApplication.gm.energyManager,
                HelloApplication.gm.polutionManager,
                HelloApplication.gm.disasterManager,
                HelloApplication.gm.moneyManager,
                HelloApplication.gm.infastructureManager,
                HelloApplication.gm.scienceManager,
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

        count = 1;

        scienceLvlLabel.setText("Science Lvl: " + HelloApplication.gm.scienceManager.getScienceLevel());


        if(HelloApplication.gm.energyManager.getCurrentEnergy() <= 0 || HelloApplication.gm.moneyManager.getCurrentMoney() <= 0){
            gameOverScreen.setOpacity(1);
            gameOverScreen.setDisable(false);
        }


        if (HelloApplication.gm.disasterManager.getStatusMessage().length() == 0)
            return;
        else {
            infoTxt.setText(HelloApplication.gm.disasterManager.getStatusMessage());
            statTxt.setText(""); // Set it to an empty string to skip.
            showTxtBtns();
        }


    }


    void selectTile(int num) {
        selectedTile = num;
        System.out.println(selectedTile);
        updateBackground();

        if (textBtnsShown) {
            textBtnsShown = false;
            hideTxtBtns();
        }
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
            redXImage.setOpacity(1);
            goToBuildingOptionsMenu();
        }else{
            redXImage.setOpacity(0);
        }

    }


    @FXML
    void upgradeBuilding(MouseEvent event) {
        Building tempBuilding = HelloApplication.gm.getBuilding(selectedTile);
        MoneyManager tempMoney = HelloApplication.gm.moneyManager;
        if (HelloApplication.gm.scienceManager.getScienceLevel() >= tempBuilding.getCurrentLevel()+1){
            String res = tempBuilding.upgrade(tempMoney);
            if(res != null) {
                infoTxt.setText(res);
                statTxt.setText(""); // Set it to an empty string to skip.
                showTxtBtns();
            }
        }
        else {
            infoTxt.setText("Error: Insufficient Science Level");
            statTxt.setText(""); // Set it to an empty string to skip.
            showTxtBtns();
        }


        //Set image to a higher upgrade building
        updateBackground();
        updateUI(false);
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
        redXImage.setOpacity(0);
        updateUI();
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
        money1 = new Image("file:src/main/resources/com/example/unicitybuildergui/Money1.png");
        money2 = new Image("file:src/main/resources/com/example/unicitybuildergui/Money2.png");
        money3 = new Image("file:src/main/resources/com/example/unicitybuildergui/Money3.png");
        science1 = new Image("file:src/main/resources/com/example/unicitybuildergui/Science1.png");
        science2 = new Image("file:src/main/resources/com/example/unicitybuildergui/Science2.png");
        science3 = new Image("file:src/main/resources/com/example/unicitybuildergui/Science3.png");
        energy1 = new Image("file:src/main/java/com/example/unicitybuildergui/Factory.png");
        energy2 = new Image("file:src/main/java/com/example/unicitybuildergui/Factory2.png");
        energy3 = new Image("file:src/main/resources/com/example/unicitybuildergui/Energy3.png");
        house = new Image("file:src/main/resources/com/example/unicitybuildergui/House.png");
        energyIcon = new Image("file:src/main/resources/com/example/unicitybuildergui/EnergyIcon.png");
        scienceIcon = new Image("file:src/main/resources/com/example/unicitybuildergui/ScienceIcon.png");
        moneyIcon = new Image("file:src/main/resources/com/example/unicitybuildergui/MoneyIcon.png");

        moneyLabel.setText(""+HelloApplication.gm.moneyManager.getCurrentMoney());
        scienceLabel.setText(""+HelloApplication.gm.scienceManager.getCurrentScience());
        energyLabel.setText(""+HelloApplication.gm.energyManager.getCurrentEnergy());
        infrastructurLvl.setText("InfraStructur level:"+ HelloApplication.gm.infastructureManager.getLevel());
        infraCost.setText("" + HelloApplication.gm.infastructureManager.getLevel()*150);
        scienceLvlLabel.setText("Science Lvl: " + HelloApplication.gm.scienceManager.getScienceLevel());

        selectTile(1);

        infoTxt.setVisible(false);
        continueButton.setOpacity(0);
        continueButton.setDisable(true);
        infoTxt.setOpacity(0);
        infoTxt.setDisable(true);
        statTxt.setVisible(false);
        statTxt.setOpacity(0);
        statTxt.setDisable(false);


    }

}