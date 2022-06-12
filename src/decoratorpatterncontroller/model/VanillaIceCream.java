package decoratorpatterncontroller.model;

import decoratorpatterncontroller.interfaces.IceCream;
import decoratorpatterncontroller.interfaces.IceCreamDecorator;

public class VanillaIceCream extends IceCreamDecorator {


    public VanillaIceCream(IceCream cream) {
        super(cream);
    }

    @Override
    public double cost() {
        return 15+super.cost();
    }
}
