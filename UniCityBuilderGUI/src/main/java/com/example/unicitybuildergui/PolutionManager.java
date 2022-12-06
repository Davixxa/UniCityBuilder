package com.example.unicitybuildergui;

public class PolutionManager {
    //variables
    private int currentPolution;
    private  int polutionYield;
    //Constructor
    public PolutionManager(){
        currentPolution = 0;
        polutionYield = 0;
    }

    public void setPolutionYield(int polutionYield) {
        this.polutionYield = polutionYield;
    }

    public int getCurrentPolution() {
        return currentPolution;
    }

    public void setCurrentPolution(int currentPolution) {
        this.currentPolution = currentPolution;
    }

    public int getPolutionYield() {
        return polutionYield;
    }
}
