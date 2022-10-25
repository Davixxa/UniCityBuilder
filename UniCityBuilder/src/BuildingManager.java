// Java program to illustrate HashMap class of java.util
// package
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;



// Main class
class BuildingManager {

	public Map<Integer, Building> map;

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
		// Print size and content of the Map
		System.out.println("Size of map is:- "
						+ map.size());

		// Printing elements in object of Map
		System.out.println(map);

/*         Map.put(5, Building.Factroy);
        Map.remove(4, Building.House);
        Map.put(4, Building.Factroy);

        System.out.println(Map);
*/

		
	}
}
