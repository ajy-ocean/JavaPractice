public class NestedInterface implements Display.Demo {

    public void display() {
        System.out.println("Display Method");
    }

    public static void main(String[] args) {
        NestedInterface nestedInterface = new NestedInterface();
        nestedInterface.display();
        nestedInterface.show();
    }
}

interface Display {

    interface Demo {
        void display();

        default void show() {
            System.out.println("default show inner interface");
        }
    }
}
