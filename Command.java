public class Command {
    public static void main(String[] args){
        Noodle noodle=new Noodle("Hot Dry Noodles",10);
        Noodle noodle2=new Noodle("ZJM",8);
        BuyNoodle buyNoodle=new BuyNoodle(noodle);
        BuyNoodle buyNoodle2=new BuyNoodle(noodle2);
        Broker broker=new Broker();
        broker.takeOrder(buyNoodle);
        broker.takeOrder(buyNoodle2);
        broker.placeOrders();
    }
}
