// Java program to illustrate HashMap class of java.util
// package
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



// Main class
class BuildingManager {

	// Main driver method
	public void BuildingManager() 
	{

        Map<Integer, Building> map = new HashMap<Integer, Building>();
		// Adding elements to the Map
		// using standard put() method
		map.put(1, new MoneyBuilding(1));
        map.put(2, new ScienceBuilding(2));
		map.put(3, new EnergyBuilding(3));
        map.put(4, new House(4));
	}

	public void buildBuilding()
	{
		Scanner scan = new Scanner(System.in);

		do{
			//Asks user for input on which tile they want to acess/place
			System.out.print("Enter Tile:");
			Integer key = Integer.parseInt(scan.nextLine());

			//Ask user which type of building they want to place
			System.out.println(BuildingTypes.ENERGY, BuildingTypes.HOUSE, BuildingTypes.MONEY, BuildingTypes.SCIENCE );
			String type = scan.nextLine();
			

			Building oldvalue = map.put(key, type);
		}
	}

	public void select() 
	{

	}
}
