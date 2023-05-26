import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListPractice {
    
    public static void main(String[] args) {

        System.out.println("========ArrayList========");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Luffy");
        arrayList.add("Zoro");
        arrayList.add("Sanji");
        arrayList.add("Ace");
        arrayList.add("Luffy");
        System.out.println(arrayList);

        arrayList.remove("Ace");
        System.out.println(arrayList);
        
        arrayList.add(3,"Nami");
        System.out.println(arrayList);

        System.out.println("First Occurrecence of Luffy: "+arrayList.indexOf("Luffy"));
        System.out.println("Last Occurrecence of Luffy: "+arrayList.lastIndexOf("Luffy"));
        System.out.println("**************************");

        System.out.println("========LinkedList========");
        
        LinkedList<String> linkedList  = new LinkedList<>();
        linkedList.add("Rias Gremory");
        linkedList.add("Hinata Hyuga");
        linkedList.add("Akeno Himejima");
        linkedList.add("Kiyoko Shimizu");
        System.out.println(linkedList);
        
        System.out.println("----Getting First&Last Element----");
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        
        System.out.println("----Removing First&Last Element----");
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);
        
        System.out.println("----Adding First&Last Element----");
        linkedList.addFirst("Rias Gremory");
        linkedList.addFirst("Kiyoko Shimizu");
        System.out.println(linkedList);
        
        System.out.println("**************************");
        
        System.out.println("========Vector========");
        
        Vector<Integer> vector = new Vector<>();
        vector.add(69);
        vector.add(9);
        vector.add(19);
        vector.add(29);
        System.out.println(vector);
        
        System.out.println("----Adding & Removing Element----");
        vector.addElement(2);
        System.out.println(vector);

        vector.removeElement(9);
        System.out.println(vector);
        vector.removeElementAt(3);
        System.out.println(vector);

        System.out.println(vector.size());

        System.out.println("**************************");

        System.out.println("========Stack========");

        Stack<Character> stack = new Stack<>();
        stack.add('A');
        stack.add('B');
        stack.add('C');
        stack.add('D');
        System.out.println(stack);
        
        System.out.println("----Pushing&Popping Element----");
        System.out.println(stack.push('E'));
        System.out.println(stack);

        //Since stack follow LIFO so therefore pop do not require any argument since it's going to return the last element
        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println("---Peeking---");
        System.out.println(stack.peek());

        System.out.println("---Searching Element---");
        //It return offset value
        System.out.println(stack.search('A'));

        System.out.println("**************************");
    }
}
