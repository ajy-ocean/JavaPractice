import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapPractice {

    public static void main(String[] args) {
        
        NavigableMap<Integer, String> navSet = new TreeMap<>();
        // you replace NavigableMap to TreeMap same output
        // TreeMap<Integer, String> tree = new TreeMap<>();

        navSet.put(1,"Ajay");
        navSet.put(2, "Naruto");
        navSet.put(3, "Luffy");
        navSet.put(4, "Sanji");
        navSet.put(5, "Zoro");
        navSet.put(6, "Sasuke");
        navSet.put(7, "Jiraya");
        System.out.println(navSet);

        System.out.println("Return last smaller number before 5 i.e 4");
        System.out.println(navSet.lowerKey(5));
        
        System.out.println("Return last smaller number before 6 and equal to 6 i.e 6");
        System.out.println(navSet.floorKey(6));

        System.out.println("Return first higher number than 4 i.e 5");
        System.out.println(navSet.higherKey(4));
        
        System.out.println("Return first higher number than 6 and equal to 6  i.e 6");
        System.out.println(navSet.ceilingKey(6));
    }
    
}
