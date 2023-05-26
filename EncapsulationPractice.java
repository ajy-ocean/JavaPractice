public class EncapsulationPractice {

    public static void main(String[] args) {
        Temp t = new Temp();
        t.setName("Ajay");
        System.out.println(t.getName());
        t.setId(1);
        System.out.println(t.getId());
    }
}

class Temp {

    private int id;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}