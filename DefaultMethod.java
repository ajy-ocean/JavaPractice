interface Demo{
    default void demo(){
        System.out.println("Default demo method");
    }
}

public class DefaultMethod implements Demo {

    public static void main(String[] args) {
        DefaultMethod d = new DefaultMethod();
        d.demo();
    }
    
}
