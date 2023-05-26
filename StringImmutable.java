public class StringImmutable{    

    public static void main(String[] args) {
        // String is immutable
        String st1 = "Hello";
        System.out.println(st1);
        st1.concat("Hellooooooooo");
        System.out.println(st1);
        
        // StringBuffer  is mutable
        StringBuffer buff = new StringBuffer("Ajay");
        System.out.println(buff);
        buff.append(" world");
        System.out.println(buff);
    }
}