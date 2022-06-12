package decoratorpatterncontroller.interfaces;

public class IceCreamDecorator  implements IceCream{

    private IceCream iceCream;

    public IceCreamDecorator(IceCream cream) {
        this.iceCream=cream;
    }

    @Override
    public double cost() {
        return this.iceCream.cost();
    }
}
