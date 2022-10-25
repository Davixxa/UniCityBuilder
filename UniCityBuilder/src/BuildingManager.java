// Java program to illustrate HashMap class of java.util
// package
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;



// Main class
class BuildingManager {

	// Main driver method
	public void BuildingManager() 
	{

        Map<Integer, Building> Map = new HashMap<Integer, Building>();
		// Adding elements to the Map
		// using standard put() method
		Map.put(1, new MoneyBuilding(1));
        Map.put(2, new ScienceBuilding(2));
		Map.put(3, new EnergyBuilding(3));
        Map.put(4, new House(4));
		// Print size and content of the Map
		System.out.println("Size of map is:- "
						+ Map.size());

		// Printing elements in object of Map
		System.out.println(Map);

/*         Map.put(5, Building.Factroy);
        Map.remove(4, Building.House);
        Map.put(4, Building.Factroy);

        System.out.println(Map);
*/

		
	}
}
