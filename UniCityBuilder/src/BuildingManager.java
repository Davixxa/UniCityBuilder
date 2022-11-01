// Java program to illustrate HashMap class of java.util
// package
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;



// Main class
class BuildingManager {

	public Map<Integer, Building> map;

	// Main driver method
	public void BuildingManager() 
	{

        Map<Integer, Building> map = new HashMap<Integer, Building>(9);
		// Adding elements to the Map
		// using standard put() method
		map.put(1, new MoneyBuilding(1));
        map.put(2, new ScienceBuilding(2));
		map.put(3, new EnergyBuilding(3));
        map.put(4, new House(4));
	}

	public void buildBuilding(Map<Integer, Building> map)
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter tile:");
		Integer tile = Integer.parseInt(scan.nextLine());

		System.out.println("What type of building do you want:");
		String nameType =  scan.nextLine();
		Building type = Building.valueOf(nameType);
		
	
		Building bValue = (Building) map.put(tile, type);
	}

	public void select(Map<Integer, Building> map) 
	{
		
		Scanner scan = new Scanner(System.in);

		System.out.print("What tile do you want to select  ");
		Integer tileKey = Integer.parseInt(scan.nextLine());


		for(Entry<Integer, Building> Entry: map.entrySet())
		{
			if(Entry.getKey() == tileKey)
			{
				System.out.print("On tile: " + tileKey + " Is " + Entry.getValue());
			}
			else if(tileKey > map.size())
			{
			System.out.print("Tile does not exist");
			}
		}
	}
	public void printMap(){
		System.out.println("this is a map of your current city");

		for (int row = 0; row < )
	}
}
