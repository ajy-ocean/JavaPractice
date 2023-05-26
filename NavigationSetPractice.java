import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigationSetPractice {

    public static void main(String[] args) {
        
        NavigableSet<Integer> navSet = new TreeSet<>();
        // you replace Navigableset to Treeset same output
        // Treeset<Integer, String> tree = new Treeset<>();

        navSet.add(1);
        navSet.add(2);
        navSet.add(3);
        navSet.add(4);
        navSet.add(5);
        navSet.add(6);
        navSet.add(7);
        System.out.println(navSet);

        System.out.println("Return last smaller number before 5 i.e 4");
        System.out.println(navSet.lower(5));
        
        System.out.println("Return last smaller number before 6 and equal to 6 i.e 6");
        System.out.println(navSet.floor(6));

        System.out.println("Return first higher number than 4 i.e 5");
        System.out.println(navSet.higher(4));
        
        System.out.println("Return first higher number than 6 and equal to 6  i.e 6");
        System.out.println(navSet.ceiling(6));

    }
    
}
