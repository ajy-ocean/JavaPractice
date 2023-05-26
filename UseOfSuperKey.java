class Temp {
    int id = 23;

    Temp(){
        System.out.println("Temp");
    }

    public void display() {
        System.out.println("Display Method");
    }
}

public class UseOfSuperKey extends Temp{

    UseOfSuperKey(){
        super();
    }

    public void show(){
        super.display();
        System.out.println(super.id);
    }

    public static void main(String[] args) {
        new UseOfSuperKey().show();
        System.out.println("=========================");
        new UseOfSuperKey();
    }

}
