package com.example.unicitybuildergui;

public class PolutionManager {
    private double currentPolution;
    private  int polutionYield;

    public PolutionManager(){
        currentPolution = 0;
        polutionYield = 0;
    }

    public void setPolutionYield(int polutionYield) {
        this.polutionYield = polutionYield;
    }

    public double getCurrentPolution() {
        return currentPolution;
    }

    public void setCurrentPolution(double currentPolution) {
        this.currentPolution = currentPolution * 0.9;
    }

    public int getPolutionYield() {
        return polutionYield;
    }
}
