package com.example.unicitybuildergui;

public class TurnManager {
    private int currentTurn;

    //Runs all methods that needs to be run at the end of the turn.
    public void endTurn(PolutionManager polutionManager, ScienceManager scienceManager, EnergyManager energyManager, MoneyManager moneyManager, InfastructureManager infastructureManager, DisasterManager disasterManager, BuildingManager buildingManager, GameMangaer gameMangaer){
        currentTurn++;
        int tempPolution;
        scienceManager.calcScienceGain();
        energyManager.calcEnergyGain();
        moneyManager.calcMoneyGain();
        disasterManager.runDisaster(polutionManager);
        polutionManager.setCurrentPolution(polutionManager.getCurrentPolution()+polutionManager.getPolutionYield());
        gameMangaer.displayMainMenu();
    }

    public int getCurrentTurn() {
        return currentTurn;
    }
}

