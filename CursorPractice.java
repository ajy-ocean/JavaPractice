import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class CursorPractice {

    public static void main(String[] args) {

        System.out.println("***Enumeration***");
        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);
        vector.addElement(5);
        System.out.println(vector);
        
        // Go into infinite loop
        // while(vector.elements().hasMoreElements()){
        // System.out.println(vector.elements().nextElement());
        // }

        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            Integer number = (Integer) enumeration.nextElement();
            if (number % 2 == 0) {
                System.out.println("Even numbers " + number);
            }
        }
        System.out.println("================");
        
        System.out.println("***Iterator***");
        ArrayList<String> arrayList = new ArrayList<String>();         
        arrayList.add("Ajay");
        arrayList.add("Nilesh Londonderry");
        arrayList.add("Panchi");
        arrayList.add("Arjun j2 pro max");
        System.out.println(arrayList);
        
        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            if(name == "Arjun j2 pro max"){
                iterator.remove();
            }
        }
        System.out.println(arrayList);
        System.out.println("================");


        System.out.println("***List-Iterator***");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);
        System.out.println(linkedList);

        ListIterator<Integer> listiterator = linkedList.listIterator();
        while(listiterator.hasNext()){
            Integer number = listiterator.next();
            if(number.equals(5)){
                listiterator.remove();
            }else if(number.equals(1)){
                listiterator.add(0);
            }else if(number.equals(2)){
                listiterator.set(8);;
            }
        }
        System.out.println(linkedList);
        System.out.println("================");

        System.out.println("---Backward----");
        List<String> list = new ArrayList<>();
        list.add("Lena Paul");
        list.add("Sasha Gray");
        list.add("Karlee Gray");
        list.add("Karma Rx");
        System.out.println(list);
        
        ListIterator<String> listIterator = list.listIterator(list.size());
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
        System.out.println("*******************");

    }
}