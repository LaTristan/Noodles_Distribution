public class Command {
    public static void main(String[] args){
        Noodle noodle=new Noodle();
        BuyNoodle buyNoodle=new BuyNoodle(noodle);
        Broker broker=new Broker();
        broker.takeOrder(buyNoodle);
        broker.placeOrders();
    }
}
