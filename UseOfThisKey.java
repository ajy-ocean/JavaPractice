public class UseOfThisKey {

    int eid;

    UseOfThisKey(){
        this(23);
        System.out.println("Default Constructor");
    }

    UseOfThisKey(int eid){
        this.eid = eid;
        System.out.println(eid);
    }

    void display(){
        this.show();
        System.out.println("Display method");
    }

    void show(){
        System.out.println("Show method");
    }

    public static void main(String[] args) {
        UseOfThisKey key = new UseOfThisKey();
        key.display();
        
    }
    
}
