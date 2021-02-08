public class BuyNoodle implements Order {
    private Noodle noodle;
    public BuyNoodle(Noodle noodle){
        this.noodle=noodle;
    }
    public void execute(){
        noodle.buy();
    }
}
