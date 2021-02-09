public class Noodle {
    private String name;
    private int quantity=10;
    public Noodle(String name){
        this.name=name;
    }
    public void buy(){
        System.out.println("Noodle "+this.name+" quantity "+quantity+" bought");
    }
}
