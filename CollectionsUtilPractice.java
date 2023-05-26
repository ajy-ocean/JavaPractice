import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsUtilPractice {

    public static void main(String[] args) {

        System.out.println("====/Collections-Utility-Class/=====");
        System.out.println("***********************************");

        System.out.println("Sorting Operation");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(23);
        arrayList.add(1);
        arrayList.add(169);
        System.out.println("Before sorting:-" + arrayList);

        System.out.println("--------------------------");

        System.out.println("Default natural sorting");
        Collections.sort(arrayList);
        System.out.println("After sorting:-" + arrayList);

        System.out.println("--------------------------");

        // If our list has null then we can use sort() method coz it will return null
        // pointer exception
        /*
         * arrayList.add(null);
         * Collections.sort(arrayList);
         * System.out.println("sorting:-"+arrayList);
         */

        System.out.println("Customized natural sorting");
        Collections.sort(arrayList, new MyComparator());
        System.out.println("Customized-sorting:" + arrayList);

        System.out.println("***********************************");

        System.out.println("Searching Operation");
        // Imp thing for searching operation the list should be first sorted
        List<String> list = new ArrayList<>();
        list.add("Z");
        list.add("A");
        list.add("M");
        list.add("k");
        list.add("a");
        System.out.println("Normal list:-" + list);
        Collections.sort(list);
        System.out.println("Sorted list:-" + list);

        // Return index position of the element(Default natural sorting)
        System.out.println(Collections.binarySearch(list, "A"));

        // Return insertion point if element is not there in the list
        System.out.println(Collections.binarySearch(list, "J"));

        // Searching for customized order
        System.out.println(Collections.binarySearch(arrayList, 169, new MyComparator()));

        System.out.println("***********************************");
        System.out.println("Reverse Operation");

        // Reverse of the list
        System.out.println("Before Reversing" + list);
        Collections.reverse(list);
        System.out.println("After Reversing" + list);

    }
}

class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Integer I1 = (Integer) o1;
        Integer I2 = (Integer) o2;
        return I2.compareTo(I1);
    }
}