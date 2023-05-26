import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapPractice {
    public static void main(String[] args) {
        HashMap<Temp, String> hashmap = new HashMap<>();
        Temp temp = new Temp();
        hashmap.put(temp, "Durga");
        System.out.println(hashmap);
        temp = null;
        System.gc();
        try {
            Thread.sleep(5000);
            System.out.println(hashmap);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("=================================");
        WeakHashMap<Temp, String> weakHash = new WeakHashMap<>();
        Temp t = new Temp();
        weakHash.put(t, "Ajay");
        System.out.println(weakHash);
        t = null;
        System.gc();
        try {
            Thread.sleep(5000);
            System.out.println(weakHash);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Temp {

    @Override
    public String toString() {
        return "Temp";
    }

    public void finalize() {
        System.out.println("Finalize method called");
    }
}