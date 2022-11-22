package com.example.javafxbuilder;

public class PolutionManager {
    private int currentPolution;
    private  int polutionYield;

    public PolutionManager(){
        currentPolution = 0;
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
