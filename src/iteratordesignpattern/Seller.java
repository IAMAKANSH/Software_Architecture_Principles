package iteratordesignpattern;

public class Seller {
    GeeksStoreCatalog catalog;

    public Seller(GeeksStoreCatalog catalog) {
        this.catalog = catalog;
    }

    public void printCatalog()
    {
        GeekyStoreIterator geekyStoreIterator=catalog.createIterator();
        System.out.println("Printing Catalog");
        printCatalog(geekyStoreIterator);
    }

    public void printCatalog(GeekyStoreIterator iterator)
    {
        while (iterator.hasNext())
        {
            Product product= (Product) iterator.next();
            System.out.println(product.getName()+" , "+product.getDescription()+" , "+product.getPrice());
        }
    }
}
