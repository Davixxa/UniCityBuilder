public class DisasterManager{

    BuildingManager buildingManager;
    public DisasterManager(BuildingManager buildingManager) {
        this.buildingManager = buildingManager;
    }
    
    Building building;
    public DisasterManager(Building building) {
        this.building = building;
    }

    //Picks a random integer between 2000 and 10000 (eventTrigger).
    //if the pollution level is higher than the random number a disaster happens.
    //Otherwise a popup meassage appears about the pollution level.
    public void runDisaster(PolutionManager polutionManager){
        int eventTrigger =2000 + (int)(Math.random()*(8001));
            //If the pollution is higher than the eventTrigger,
            //an event/disaster happens on 2 random tiles if there is a building.
        if (eventTrigger<polutionManager.getCurrentPolution()){
            System.out.println("A disaster has happend.");
            for(int i=0; i<2; i++){
            int eventTile = (int)(Math.random()*(buildingManager.map.size()));
                if(buildingManager.map.containsKey(eventTile)){
                    buildingManager.map.get(eventTile).setDestroyed(true);
                    System.out.println("The building at cordinates " + eventTile + " has been destroyed and needs to be repaired.");
                }
            }

        }
        //Sends different messages depending on the pollution level.
        else{
            if(polutionManager.getCurrentPolution()>=10000){
                System.out.println("The pollution level is very hazardous.");
                System.out.println("It's almost impossible to breathe.");
            }
            else if(polutionManager.getCurrentPolution()>=8000){
                System.out.println("The pollution level is hazardous.");
            }
            else if(polutionManager.getCurrentPolution()>=6000){
                System.out.println("The pollution level is very unhealthy.");
            }
            else if(polutionManager.getCurrentPolution()>=4000){
                System.out.println("The pollution level is unhealthy.");
            }
            else if(polutionManager.getCurrentPolution()>=2000){
                System.out.println("The pollution level is moderate");
            }
            else{}
        }
    }
}