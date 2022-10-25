// Java program to illustrate HashMap class of java.util
// package
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;



// Main class
class HAP {

	// Main driver method
	public void BuildingManager() 
	{

        Map<Integer, Enum<?>> Map = new HashMap<Integer, Enum<?>>();
		// Adding elements to the Map
		// using standard put() method
		Map.put(1, Building.MONEY);
        Map.put(2, Building.SCIENCE);
		Map.put(3, Building.Energy);
        Map.put(4, Building.House);
        Map.put(5, Building.None);
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
