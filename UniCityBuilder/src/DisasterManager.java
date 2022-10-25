public class DisasterManager{
    private int Pollution = 0;

    public int setPollution(){
        Pollution += setPollution();
        return Pollution;
    }

    public void runDisaster(){
        int Random =2000 + (int)(Math.random()*(8001));
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


        if (Random<Pollution){
            Destroy;
        }

        }
    }