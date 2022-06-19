package iteratordesignpattern;

import java.util.ArrayList;

public class GeeksStoreCatalog{

    private ArrayList<Product> catalog;
    public GeeksStoreCatalog() {
        catalog=new ArrayList<>();
        add("SuperMan comic","the best in town",250);
        add("Star Wars","Can't live without it",698);
        add("Jedi T-shirt","Gotta have it",350);
        add("Batman Comic","Okay,but still good",232.40);
    }

    public void add(String name,String description,double price)
    {
        catalog.add(new Product(name,description,price));
    }

    public ArrayList<Product> getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList<Product> catalog) {
        this.catalog = catalog;
    }

    public GeekyStoreIterator createIterator()
    {
        return new GeekyStoreIterator(catalog);
    }
}
