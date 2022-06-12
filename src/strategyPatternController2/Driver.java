package strategyPatternController2;

public class Driver {

    public static void main(String[] args) {


        Product pants=new Product(500,"234");
        Product shirt=new Product(400,"300");

        ShoppingCart cart=new ShoppingCart();
        cart.addProduct(pants);
        cart.addProduct(shirt);

        //payment decision

        cart.pay(new PaypalAlgorithm("akansh@gmail.com","akansh"));

        cart.pay(new CreditCardAlgorithm("Akansh Srivastava","7856472856"));
    }
}
