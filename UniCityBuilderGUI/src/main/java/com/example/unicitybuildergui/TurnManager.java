package com.example.unicitybuildergui;

public class TurnManager {
    private int currentTurn;

    //Runs all methods that needs to be run at the end of the turn.
    public void endTurn(EnergyManager energyManager, PolutionManager polutionManager, DisasterManager disasterManager, MoneyManager moneyManager, InfastructureManager infastructureManager, ScienceManager scienceManager, BuildingManager buildingManager, GameMangaer gameMangaer){
        currentTurn++;
        int newPolutionYield = 0;
        scienceManager.calcScienceGain(energyManager);
        energyManager.calcEnergyGain(moneyManager);
        moneyManager.calcMoneyGain(energyManager);
        for (int i = 1; i<buildingManager.size+1; i++){
            if (buildingManager.map.get(i) == null)
                continue;
            System.out.println(i + ": " + buildingManager.map.get(i).getPollutionYield());
            newPolutionYield += buildingManager.map.get(i).getPollutionYield();
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

