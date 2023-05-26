public class MethodOverriding extends Temp {

    //Method overriding
    public void display(){
        System.out.println("child display method");
    }

    public static void main(String[] args) {

        MethodOverriding meth = new MethodOverriding();
        meth.display();   
    } 
}

class Temp{
    protected void display(){
        System.out.println("Parent display method");
    }
}