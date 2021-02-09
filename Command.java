public class Command {
    public static void main(String[] args){
        Noodle noodle=new Noodle("Hot Dry Noodles");
        BuyNoodle buyNoodle=new BuyNoodle(noodle);
        Broker broker=new Broker();
        broker.takeOrder(buyNoodle);
        broker.placeOrders();
    }
}
