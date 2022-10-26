import java.util.Map;

public class DisasterManager{
    private int Pollution = 0;

    public int setPollution(){
        Pollution += setPollution();
        return Pollution;
    }

    public void runDisaster(){
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
            System.out.println("The air is starting to be polluted.");
        }
        //Sends different messages depending on the pollution level.
        
        
        int eventTrigger =2000 + (int)(Math.random()*(8001));
        //Picks a random integer between 2000 and 10000 (eventTrigger).
        //if the pollution level is higher than the random number a disaster happens.

        int eventTile = (int)(Math.random()*(16));
        //Picks a random tile where the event is impacting.

        if (eventTrigger<Pollution){
            for(int i=0; i<5; i++){
            eventTile = (int)(Math.random()*(16));
            
            Hvis building on eventTile --> Destroy;
            }
        //If the pollution is higher than the eventTrigger,
        //an event/disaster happens on 5 random tiles.
        }
    }
}