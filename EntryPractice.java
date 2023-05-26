import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntryPractice {
    public static void main(String[] args) {

        // Entry interface is the inner interface in Map interface
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ajay");
        map.put(2, "Uzumaki Naruto");
        map.put(3, "Monkey.D.Luffy");
        map.put(4, "Uchiha Sasuke");
        System.out.println(map);

        // Get a set of the entries
        Set set = map.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println("++++++++++++++++++++++++++++++++++");
        Map<String, Integer> map1 = new HashMap<>();

        // Add key-value pair to the map
        map1.put("Key1", 10);

        // Get an entry from the map
        Map.Entry<String, Integer> entry = map1.entrySet().iterator().next();

        // Print the initial value
        System.out.println("Initial value: " + entry.getValue());

        // Use setValue to update the value
        entry.setValue(20);

        // Print the updated value
        System.out.println("Updated value: " + entry.getValue());
    }
}
