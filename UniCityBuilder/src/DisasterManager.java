public class DisasterManager{
    private int Pollution = 0;

    public int setPollution(){
        Pollution += setPollution();
        return Pollution;
    }

    //Picks a random integer between 2000 and 10000 (eventTrigger).
    //if the pollution level is higher than the random number a disaster happens.
    //Otherwise a popup meassage appears about the pollution level.
    public void runDisaster(){
        int eventTrigger =2000 + (int)(Math.random()*(8001));

            //If the pollution is higher than the eventTrigger,
            //an event/disaster happens on 5 random tiles.
        if (eventTrigger<Pollution){
            for(int i=0; i<5; i++){
            int eventTile = (int)(Math.random()*(16));
            //Hvis building on eventTile --> Destroy;
            //////////
            //////////
            //////////
            }

        }
        //Sends different messages depending on the pollution level.
        else{
            if(Pollution>=10000){
                System.out.println("It's almost impossible to breath because of the pollution.");
            }
            else if(Pollution>=8000){
                System.out.println("The smog is getting worse.");
            }
            else if(Pollution>=6000){
                System.out.println("There is a lot of smog.");
            }
            else if(Pollution>=4000){
                System.out.println("The air pollution is getting worse.");
            }
            else if(Pollution>=2000){
                System.out.println("The air is starting to get polluted.");
            }
            else{}
        }
    }
}