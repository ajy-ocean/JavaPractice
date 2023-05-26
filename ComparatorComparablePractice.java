import java.util.TreeSet;

public class ComparatorComparablePractice {
    public static void main(String[] args) {

        // Comparable:- Default Natural Order:- Ascending order
        // For comparable the corresponding class should implement comparable interface
        // as well as the objects should be homogenouse if both of these condition are
        // not met then we will get Runtime Exception as ClassCastException
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        System.out.println(treeSet);

        // Comparable:- Default Natural Order:- Alphabetical order
        TreeSet<String> treeSet0 = new TreeSet<>();
        treeSet0.add(new String("a"));
        treeSet0.add(new String("z"));
        treeSet0.add(new String("l"));
        treeSet0.add(new String("b"));
        System.out.println(treeSet0);

        System.out.println("Printing values");
        System.out.println("z".compareTo("a"));
        System.out.println("l".compareTo("z"));
        System.out.println("b".compareTo("l"));
        System.out.println("l".compareTo("l"));
        // Gives null pointer exception
        // System.out.println("l".compareTo(null));

        // In later version of java, StringBuffer has implemented comparable interface
        // so that's why it allows natural ordering
        // Comparable:- Default Natural Order:- Alphabetical order
        TreeSet<StringBuffer> treeSet1 = new TreeSet<>();
        treeSet1.add(new StringBuffer("A"));
        treeSet1.add(new StringBuffer("Z"));
        treeSet1.add(new StringBuffer("L"));
        treeSet1.add(new StringBuffer("B"));
        System.out.println(treeSet1);

    }
}