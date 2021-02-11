public class Noodle {
    private String name;
    private int quantity;
    public Noodle(String name,int q){
        this.name=name;
        quantity=q;
    }
    public void buy(){
        System.out.println("Noodle "+this.name+" quantity "+quantity+" bought");
    }
}
