// Java program to illustrate HashMap class of java.util
// package
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;



// Main class
class BuildingManager {


	int size = 4;
	int count = 0;


	public Map<Integer, Building> map = new HashMap<Integer, Building>(9);



	// Main driver method
	public void BuildingManager() 
	{
		
	}

	public void buildBuilding(Map<Integer, Building> map, GameMangaer gameMangaer)
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter tile:");
		Integer tile = Integer.parseInt(scan.nextLine());

		System.out.println("Enter the number corresponding to the building you want to build:");
		System.out.println("1. Energy Building\n2. Money Building\n3. Science Building\n4. House\n5. Cancel");
		int buildingType =  Integer.parseInt(scan.nextLine());

		switch(buildingType) {
			case 1:
				EnergyBuilding eBuilding = new EnergyBuilding(tile);
				map.put(tile, eBuilding);
				break;
			case 2:
				MoneyBuilding mBuilding = new MoneyBuilding(tile);
				map.put(tile, mBuilding);
				break;
			case 3:
				ScienceBuilding sBuilding = new ScienceBuilding(tile);
				map.put(tile, sBuilding);
				break;
			case 4:
				// House extends Building, despite seeming illogical from the name, therefore it will go into the Map just fine.
				House house = new House(tile);
				map.put(tile, house);
				break;
			case 5:
				break;

			default:
				System.out.println("Error: Invalid building type. Cancelling.");
				break;
		}
		gameMangaer.displayMainMenu();

	}

	public Building select(Map<Integer, Building> map)
	{
		
		Scanner scan = new Scanner(System.in);

		System.out.print("What tile do you want to select  ");
		Integer tileKey = Integer.parseInt(scan.nextLine());


		for(Entry<Integer, Building> Entry: map.entrySet())
		{
			if(Entry.getKey() == tileKey)
			{
				System.out.print("On tile: " + tileKey + " Is " + Entry.getValue().getDisplayName());

				return Entry.getValue();
			}
			else if(tileKey > map.size())
			{
			System.out.print("Tile does not exist");
			}
		}
		return null;
	}
	public void printMap(){
		for (Building i : map.values()){

		}

		System.out.println("City Map: ");
		int line = 0;
		for (int i = 1; i <= size; i++) {
			System.out.println();
			for(int j = 1; j <= size; j++) {
				if (map.get(j+line)==null) {
					System.out.print("[N] ");
				} else {
					// This changes in every row. Why?
					switch (map.get(j+line).buildingType) {

						case MONEY:
							System.out.print("[M] ");
							break;

						case ENERGY:
							System.out.print("[E] ");
							break;

						case HOUSE:
							System.out.print("[H] ");
							break;

						case SCIENCE:
							// No. I'm not dealing with Danish.
							System.out.print("[S] ");
							break;

						default:
							// code block
					}
				}
			}
			line+=size;
		}

		System.out.println();

		System.out.println("Current amount of buildings placed: " + map.size());


		//for (int row = 0; row < )

		//kris er grim
	}
}
