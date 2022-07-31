package visitordesignpattern;

public interface Visitor {
    int visitor(Shirt shirtItem);
    int visitor(Tshirt tShirtItem);
    int visitor(Jacket jacketItem);

}
