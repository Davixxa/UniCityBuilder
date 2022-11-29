package com.example.unicitybuildergui;

public class TurnManager {
    private int currentTurn;

    //Runs all methods that needs to be run at the end of the turn.
    public void endTurn(PolutionManager polutionManager, ScienceManager scienceManager, EnergyManager energyManager, MoneyManager moneyManager, InfastructureManager infastructureManager, DisasterManager disasterManager, BuildingManager buildingManager, GameMangaer gameMangaer){
        currentTurn++;
        int newPolutionYield = 0;
        scienceManager.calcScienceGain();
        energyManager.calcEnergyGain();
        moneyManager.calcMoneyGain();
        for (int i = 1; i<buildingManager.size+1; i++){
            if (buildingManager.map.get(i) == null)
                continue;
            System.out.println(i + ": " + buildingManager.map.get(i).pollution);
            newPolutionYield += buildingManager.map.get(i).pollution;
        }
        System.out.println(polutionManager.getCurrentPolution());
        polutionManager.setPolutionYield(newPolutionYield);
        polutionManager.setCurrentPolution(polutionManager.getCurrentPolution()+polutionManager.getPolutionYield());
        disasterManager.runDisaster(polutionManager);
        //gameMangaer.displayMainMenu();
    }

    public int getCurrentTurn() {
        return currentTurn;
    }
}

