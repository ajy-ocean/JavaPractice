public class Polymorphism {

    Polymorphism() {
        System.out.println("Default Contructor");
    }

    Polymorphism(int number) {
        System.out.println("Parameterized Contructor");
        System.out.println(number);
    }

    Polymorphism(int number, String name) {
        System.out.println("Default Contructor");
        System.out.println(number + " " + name);
    }

    public static void main(String[] args) {
         
        Polymorphism p = new Polymorphism();
        System.out.println("---------------------------");
        Polymorphism ply = new Polymorphism(1);
        System.out.println("---------------------------");
        Polymorphism ploy = new Polymorphism(69, "Karlee grey");
    }
}
