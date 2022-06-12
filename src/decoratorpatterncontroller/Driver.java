package decoratorpatterncontroller;

import decoratorpatterncontroller.interfaces.IceCream;
import decoratorpatterncontroller.model.BasicIceCream;
import decoratorpatterncontroller.model.ChocolateIceCream;
import decoratorpatterncontroller.model.VanillaIceCream;

public class Driver {

    public static void main(String[] args) {


        IceCream iceCream=new BasicIceCream();
        System.out.println("Basic Ice Cream cost is "+iceCream.cost());

        //Adding vanilla

        IceCream vanilla=new VanillaIceCream(iceCream);
        System.out.println("Adding Vanilla Ice Cream cost is "+vanilla.cost());
        IceCream chocolate=new ChocolateIceCream(iceCream);
        System.out.println("Adding Chocolate Ice Cream cost is "+chocolate.cost());
    }
}
