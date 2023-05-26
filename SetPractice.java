import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetPractice{

    public static void main(String[] args) {
        
        System.out.println("****HASHSET****");
        
        HashSet hashSet = new HashSet<>();
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("Z");
        hashSet.add("null");
        hashSet.add(10);
        System.out.println(hashSet);
        
        System.out.println("****LINKEDHASHSET****");
        LinkedHashSet linkedHashSet = new LinkedHashSet<>();
        //THE INSERTION IS ACCORDING TO INSERTION ORDER
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("D");
        linkedHashSet.add("Z");
        linkedHashSet.add("null");
        linkedHashSet.add(10);
        System.out.println(linkedHashSet);
        System.out.println("..........................");
        
        System.out.println("****SORTEDSET****");
        //As you can see sortedset is an interface that's why we can create it's object directly that's why I have use Treeset
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(100);
        sortedSet.add(101);
        sortedSet.add(103);
        sortedSet.add(104);
        sortedSet.add(106);
        sortedSet.add(110);
        sortedSet.add(115);
        sortedSet.add(120);
        System.out.println(sortedSet);
        
        //Gives the first&last element 
        System.out.println(sortedSet.first());
        System.out.println(sortedSet.last());
        
        //Gives Lesser than 106, 106 not included
        System.out.println(sortedSet.headSet(106));
        
        //Gives Greater than 106, 106  included
        System.out.println(sortedSet.tailSet(106));
        
        //Gives Greater than 101, 101 included and Less than 115, 115 not included
        System.out.println(sortedSet.subSet(101, 115));

        System.out.println("..........................");


        System.out.println("****TREESET****");
        //Since we have used default constructor so therefore default sorting for numbers i.e Ascending order is going to be done.
        TreeSet treeSet = new TreeSet();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(2);

        // Since TreeSet do not allow Heterogeneous objects if we try to add one then we will get ClassCastException uncomment below code to see it
        // treeSet.add("Value");

        //Null insertion is not allowed in treeset from 1.7 before that it's allowed but only on the first position and on top of that we try to add another element after null we will get error
        System.out.println(treeSet);
        System.out.println("..........................");
    }
}