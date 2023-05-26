import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TraversingList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Lena Paul");
        list.add("Sasha Gray");
        list.add("Karlee Gray");
        list.add("Karma Rx");

        // Traversing using simple loop
        System.out.println("Traversing using simple loop");
        System.out.println("=========================");
        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("*******************");

        // Traversing using for each loop
        System.out.println("Traversing using for each loop");
        System.out.println("=========================");
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("*******************");

        // Traversing using iterator only forward
        System.out.println("Traversing using for iterator");
        System.out.println("=========================");
        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("*******************");
        
        // Traversing using List-iterator forward & backward
        System.out.println("Traversing using for List-iterator");
        System.out.println("=========================");
        ListIterator<String> listItr = list.listIterator();
        
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }
        System.out.println("*******************");
        System.out.println("***** BACKWORD ORDER **************");
        
        ListIterator<String> listIterator = list.listIterator(list.size());
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
        System.out.println("*******************");
        
        // Traversing using JAVA 8 ABOVE FEATURE list method called forEach
        System.out.println("Traversing using JAVA 8 ABOVE FEATURE list method called forEach");

        list.forEach((element)->{
            System.out.println(element);
        });
        
        System.out.println("*******************");

        // another way of traversing below...
        // list.stream().forEach(null);
    }
}