import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapPractice{

    public static void main(String[] args) {
     
        System.out.println("=== SortedMap ===");
        SortedMap<Integer, String> sortMap = new TreeMap<>();
        sortMap.put(1,"Adele");
        sortMap.put(2,"Jcole");
        sortMap.put(3,"Frank Ocean");
        sortMap.put(4,"Lana Del Rey");
        System.out.println(sortMap);

        System.out.println("Return first key");
        System.out.println(sortMap.firstKey());
        
        System.out.println("Return last key");
        System.out.println(sortMap.lastKey());

        System.out.println("Return keys greater than 4");
        System.out.println(sortMap.headMap(4));

        System.out.println("============================");
        
        System.out.println("Return keys lesser than or equal 4");
        System.out.println(sortMap.tailMap(3));
        
        System.out.println("============================");
        
        System.out.println("Return subset of keys");
        System.out.println(sortMap.subMap(1, 3));
    }
}