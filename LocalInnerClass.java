public class LocalInnerClass {

    public static void main(String[] args) {
    
        //Local inner class object
        Temp temp = new Temp();
        temp.display();

    }
}

class Temp {
    void display() {
        class Demo {
            void show() {
                System.out.println("This is local inner class");
            }
        }
        Demo demo = new Demo();
        demo.show();
    }
}