public class Upcasting extends Demo {

    public void show(){
        System.out.println("Child Demo method");
    }

    public static void main(String[] args) {
        //upcasting
        Demo demo = new Upcasting();
        demo.show();
        System.out.println(demo.id);
    }
    
}

class Demo{
    int id = 69;
    public void show(){
        System.out.println("Parent Demo method");
    }
}