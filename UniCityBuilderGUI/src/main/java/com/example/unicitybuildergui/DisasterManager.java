package com.example.unicitybuildergui;

public class DisasterManager{

    public String statusMessage = "";
    boolean moderateShowable = true;
    boolean unhealthyShowable = true;
    boolean veryUnhealthyShowable = true;
    boolean hazardousShowable = true;
    boolean veryHazardousShowable = true;

    BuildingManager buildingManager;
    //Constructor
    public DisasterManager(BuildingManager buildingManager) {
        this.buildingManager = buildingManager;
    }

    Building building;
    //default constructor
    public DisasterManager(Building building) {
        this.building = building;
    }


    public void setStatusMessage(String message) {
        this.statusMessage = message;
    }
    public String getStatusMessage() {
        return statusMessage;
    }


    //Picks a random integer between 2000 and 10000 (eventTrigger).
    //if the pollution level is higher than the random number a disaster happens.
    //Otherwise a popup meassage appears about the pollution level.
    public void runDisaster(PolutionManager polutionManager){
        int eventTrigger =2000 + (int)(Math.random()*(8001));
            //If the pollution is higher than the eventTrigger,
            //an event/disaster happens on 2 random tiles if there is a building.
        if (eventTrigger<polutionManager.getCurrentPolution()){
            this.statusMessage = "A disaster has happened.";
            System.out.println(this.statusMessage);
            for(int i=0; i<2; i++){
            int eventTile = (int)(Math.random()*(buildingManager.map.size()));
                if(buildingManager.map.containsKey(eventTile)){
                    buildingManager.map.get(eventTile).setDestroyed(true);
                    this.statusMessage += "\nThe building at tile " + eventTile + " has been destroyed\nand needs to be repaired.";
                    System.out.println(this.statusMessage);
                }
            }

        }
        //Sends different messages depending on the pollution level.
        //It is not supposed to show the same message on consecutive ter
        else{
            if(polutionManager.getCurrentPolution()>=10000){
                this.statusMessage = "The pollution level is very hazardous.\nIt is almost impossible to breathe.";
                System.out.println(this.statusMessage);
            }
            else if(polutionManager.getCurrentPolution()>=8000){
                this.statusMessage = "The pollution level is hazardous.";
                System.out.println(this.statusMessage);
            }
            else if(polutionManager.getCurrentPolution()>=6000){
                this.statusMessage = "The pollution level is very unhealthy.";
                System.out.println(this.statusMessage);
            }
            else if(polutionManager.getCurrentPolution()>=4000){
                this.statusMessage = "The pollution level is unhealthy.";
                System.out.println(this.statusMessage);

            }
            else if(polutionManager.getCurrentPolution()>=2000){
                    this.statusMessage = "The pollution level is moderate";
                    System.out.println(this.statusMessage);
            }
            else{
                this.statusMessage = "";
            }
        }
    }
}