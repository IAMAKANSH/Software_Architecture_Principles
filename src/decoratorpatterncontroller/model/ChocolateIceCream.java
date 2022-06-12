package decoratorpatterncontroller.model;

import decoratorpatterncontroller.interfaces.IceCream;
import decoratorpatterncontroller.interfaces.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {

    public ChocolateIceCream(IceCream cream) {
        super(cream);
    }

    @Override
    public double cost() {
        return 20+super.cost();
    }
}
