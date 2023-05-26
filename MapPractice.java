import java.util.HashMap;
import java.util.Map;

public class MapPractice{

    public static void main(String[] args) {
        
        System.out.println("***-Map-***");
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Ajay");
        map.put(2,"Uzumaki Naruto");
        map.put(3,"Monkey.D.Luffy");
        map.put(4,"Uchiha Sasuke");
        System.out.println(map);
        System.out.println("---------------------");

        System.out.println("To get a specific key");
        System.out.println(map.get(1));
        System.out.println("---------------------");
        
        //If you remove a key then value will be automatically will get removed without key we can not have value
        System.out.println("To remove specific key");
        System.out.println(map.remove(4));
        System.out.println(map);
        System.out.println("---------------------");
        
        System.out.println("To check if we have a specific or not key & value(boolean value)");
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Monkey.D.Luffy"));
        System.out.println("---------------------");

        System.out.println("To check if the map is empty or not ");
        System.out.println(map.isEmpty());
        System.out.println("---------------------");

        System.out.println("To check the size of the map ");
        System.out.println(map.size());
        System.out.println("---------------------");
        
        System.out.println("To remove everything from the map");
        // map.clear();
        System.out.println("---------------------");

        System.out.println("========== COLLECTION VIEWS OF MAP ========== ");
        System.out.println("To get all the keys");
        System.out.println(map.keySet());
        System.out.println("---------------------");
        
        System.out.println("To get all the values");
        System.out.println(map.values());
        System.out.println("---------------------");
        
        System.out.println("To get all entry object");
        System.out.println(map.entrySet());
        System.out.println("---------------------");
        System.out.println("========== COLLECTION VIEWS OF MAP ========== ");
    }
}