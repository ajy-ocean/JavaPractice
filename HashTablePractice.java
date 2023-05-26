import java.util.Hashtable;

public class HashTablePractice {

    public static void main(String[] args) {

        Hashtable<Temp, String> hash = new Hashtable<>();
        hash.put(new Temp(5), "A");
        hash.put(new Temp(2), "B");
        hash.put(new Temp(6), "C");
        hash.put(new Temp(15), "D");
        hash.put(new Temp(23), "E");
        hash.put(new Temp(16), "F");
        System.out.println(hash);
    }
}
class Temp {

    int flag;

    Temp(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return flag+"";
    }

    @Override
    public int hashCode() {
        return flag;
    }
    
}