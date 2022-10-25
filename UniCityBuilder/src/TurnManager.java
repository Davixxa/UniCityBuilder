public class TurnManager {
    private int currentTurn;

    TurnManager(){
        currentTurn = 0;
    }

    private void endTurn(ScienceManager scienceManager, EnergyManager energyManager, MoneyManager moneyManager, InfastructureManager infastructureManager, EventManager eventManager, BuildingManager buildingManager){
        currentTurn++;
        int tempPolution;
        scienceManager.setCurrentScience(scienceManager.getCurrentScience()+scienceManager.getScienceGain);
        energyManager.setCurrentEnergy(energyManager.getCurrentEnergy()+energyManager.getEnergyGain());
        moneyManager.setCurrentMoney(moneyManager.getCurrentMoney()+moneyManager.getMoneyGain());
        eventManager.runEvent();
        //eventManager.setPolution(tempPolution);
    }
}
