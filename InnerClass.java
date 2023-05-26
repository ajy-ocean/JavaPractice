class Outer {

    int value;

    Outer(int value){
        this.value = value;
    }

    public void display(){
        System.out.println(value);
    }

    class Inner {
        String name;

        Inner(String name){
            this.name = name;
        }

        public void display(){
            System.out.println(name);
        }
    }
}

public class InnerClass{

    public static void main(String[] args) {

        Outer out = new Outer(1);
        out.display();
        
        //Inner class object
        Outer.Inner in = out.new Inner("Ajay");
        in.display();

    }
}