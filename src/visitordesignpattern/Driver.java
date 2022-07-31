package visitordesignpattern;

public class Driver {
    public static void main(String[] args) {


        TaxVisitor taxVisitor=new TaxVisitor();
        Jacket jacket=new Jacket(45.99);
        Tshirt tshirt=new Tshirt(24.99);
        Shirt shirt=new Shirt(22.89);

        //use tax calculation
        System.out.println(jacket.accept(taxVisitor));
        System.out.println(tshirt.accept(taxVisitor));
        System.out.println(shirt.accept(taxVisitor));
    }

}
