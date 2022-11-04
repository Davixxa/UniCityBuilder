import java.util.Scanner;

public class GameMangaer {


    InfastructureManager infastructureManager = new InfastructureManager();
    BuildingManager buildingManager = new BuildingManager();
    MoneyManager moneyManager = new MoneyManager(buildingManager);
    EnergyManager energyManager = new EnergyManager(buildingManager);
    ScienceManager scienceManager = new ScienceManager(buildingManager);
    DisasterManager disasterManager = new DisasterManager(buildingManager);
    TurnManager turnManager = new TurnManager();
    PolutionManager polutionManager = new PolutionManager();

    public  void setupGame(){
        displayMainMenu();
    }
    public void displayMainMenu(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Intro text");
        System.out.println("1: Build a new building \n 2: Select a building to upgrade or repair \n 3: End turn");
        buildingManager.printMap();

        String playerInput = scan.nextLine();

        //1 = build,     2 = select building to upgrade/rapair,      3 = next turn
        switch(Integer.parseInt(playerInput)) {
            case 1:
                buildingManager.buildBuilding(buildingManager.map, this);
                break;
            case 2:
                Building selectedBuilding = buildingManager.select(buildingManager.map);
                if (selectedBuilding == null){
                    System.out.println("There is no selected building");
                    displayMainMenu();
                    break;
                }else {
                    if (selectedBuilding.isDestroyed()){
                        System.out.println("do you want to repair this building (Y/N)");
                        String input = scan.nextLine().toLowerCase();
                        if (input.equals("y")){
                            selectedBuilding.repair(moneyManager);
                        } else if (input.equals("n")) {
                            displayMainMenu();
                        }else {
                            System.out.println("Error: Invalid input");
                        }

                    }else {
                        System.out.println("do you want to upgrade this building (Y/N)");
                        String input = scan.nextLine().toLowerCase();
                        if (input.equals("y")){
                            selectedBuilding.upgrade(/*moneyManager*/);
                        } else if (input.equals("n")) {
                            displayMainMenu();
                        }else {
                            System.out.println("Error: Invalid input");
                        }
                    }
                    displayMainMenu();
                    break;
                }
            case 3:
                turnManager.endTurn(polutionManager, scienceManager, energyManager, moneyManager, infastructureManager, disasterManager, buildingManager);
                break;

            default:
                System.out.println("Error: Invalid input. Cancelling.");
                displayMainMenu();
                break;
        }
    }


}
