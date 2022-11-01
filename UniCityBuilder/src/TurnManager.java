public class TurnManager {
    private int currentTurn;

    //Runs all methods that needs to be run at the end of the turn.
    private void endTurn(PolutionManager polutionManager, ScienceManager scienceManager, EnergyManager energyManager, MoneyManager moneyManager, InfastructureManager infastructureManager, EventManager eventManager, BuildingManager buildingManager){
        currentTurn++;
        int tempPolution;
        scienceManager.calcScienceGain();
        energyManager.calcEnergyGain();
        moneyManager.calcMoneyGain();
        eventManager.runDisaster();
        polutionManager.setCurrentPolution(polutionManager.getCurrentPolution()+polutionManager.getPolutionYield());
    }

    public int getCurrentTurn() {
        return currentTurn;
    }
}
