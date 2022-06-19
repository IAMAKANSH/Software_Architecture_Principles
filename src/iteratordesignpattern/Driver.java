package iteratordesignpattern;

public class Driver {

    public static void main(String[] args) {

        Seller seller=new Seller(new GeeksStoreCatalog());
        seller.printCatalog();
    }
}
