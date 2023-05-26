public class AnonymousInnerClass{

    public static void main(String[] args) {
        Display d = new Display() {
            public void display() {
                System.out.println("Display");
            }
        };
        d.display();
    }
}

interface Display {
    void display();
}

