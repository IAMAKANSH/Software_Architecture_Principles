package visitordesignpattern;

public class TaxVisitor implements  Visitor{

//    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    @Override
    public int visitor(Shirt shirtItem) {
        System.out.println("Shirt final price with taxi");
        return (int)(shirtItem.getPrice()*0.10+
                shirtItem.getPrice());
    }

    @Override
    public int visitor(Tshirt tShirtItem) {
        System.out.println("TShirt final price with taxi");
        return (int)(tShirtItem.getPrice()*0.18+
                tShirtItem.getPrice());
    }

    @Override
    public int visitor(Jacket jacketItem) {
        System.out.println("Jacket final price with taxi");
        return (int)(jacketItem.getPrice()*0.20+
                jacketItem.getPrice());
    }
}
