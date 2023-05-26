import java.util.Arrays;
import java.util.Comparator;

public class ArraysUtilPractice {

    public static void main(String[] args) {

        System.out.println("====/Arrays-Utility-Class/=====");
        System.out.println("***********************************");

        System.out.println("Sorting Operation(Primitive Type)");
        // There is no customized sorting for primitive type
        System.out.println("------------------------");

        System.out.println("Primitive type before sorting");
        int[] numbers = { 12, 54, 2, 45, 1 };
        for (int values : numbers) {
            System.out.println(values);
        }

        System.out.println("Primitive type After sorting");
        Arrays.sort(numbers);
        for (int values : numbers) {
            System.out.println(values);
        }
        System.out.println("====================================");

        System.out.println("Sorting Operation(Object Type)");
        System.out.println("------------------------");

        System.out.println("Object type before sorting");
        String[] letters = { "A", "W", "B", "Q" };
        for (String values : letters) {
            System.out.println(values);
        }

        System.out.println("Object type After sorting");
        Arrays.sort(letters);
        for (String values : letters) {
            System.out.println(values);
        }

        System.out.println("Customized sorting(Descending order)");
        Arrays.sort(letters, new MyComparator());
        for (String values : letters) {
            System.out.println(values);
        }

    }

}

class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }

}
