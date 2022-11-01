import java.security.cert.PolicyQualifierInfo;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Initial program
        // Aleksander
        System.out.println("**** Start apprication ****");
        System.out.println("Enter name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Name: " + name);
        
        InfastructureManager infastructureManager = new InfastructureManager();
        BuildingManager buildingManager = new BuildingManager();
        MoneyManager moneyManager = new MoneyManager(buildingManager);
        EnergyManager energyManager = new EnergyManager(buildingManager);
        ScienceManager scienceManager = new ScienceManager(buildingManager);
        DisasterManager disasterManager = new DisasterManager(buildingManager);

        Scanner scan = new Scanner(System.in);

    }
}

