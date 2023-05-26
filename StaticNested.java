public class StaticNested {
  
    static class Inner{
        String name;

        Inner(String name){
            this.name = name;
        }

        public void display(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        StaticNested.Inner in = new StaticNested.Inner("Ajay");
        in.display();
    }
}
