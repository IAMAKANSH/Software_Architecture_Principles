package strategyPatternController2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Product> productList;

    public ShoppingCart(List<Product> productList) {
        this.productList = productList;
    }

    public ShoppingCart() {
        this.productList=new ArrayList<>();
    }

    public void addProduct(Product product)
    {
        productList.add(product);
    }
    public  void removeProduct(Product product)
    {
        productList.remove(product);
    }

    public int calculateCost()
    {
        return this.productList.stream().mapToInt(value -> value.getPrice()).sum();
    }

    public void pay(Payment paymentStrategy)
    {
        int amount=calculateCost();
        paymentStrategy.pay(amount);
    }
}
