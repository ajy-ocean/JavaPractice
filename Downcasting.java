public class Downcasting extends Demo {

    public static void main(String[] args) {
        Demo d = new Temp();
        d.show();
        d.temp();

        System.out.println("-------------------");
        Temp demo = (Temp) d;
        demo.display();
        demo.temp();
    }
}

class Demo {

    public void show() {
        System.out.println("Demo show method");
    }

    public void temp(){
        System.out.println("Demo temp method");
    }
}

class Temp extends Demo{

    public void show(){
        System.out.println("Temp show Method");
    }

    public void display(){
        System.out.println("Temp display method");
    }
}
