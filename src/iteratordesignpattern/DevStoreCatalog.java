package iteratordesignpattern;

public class DevStoreCatalog implements Iterator{
    private static final int MAX_ITEMS=4;
    private int numberOfProducts=0;
    int position=0;
    Product[] calalog;

    public DevStoreCatalog() {
        calalog=new Product[MAX_ITEMS];
        addItem("C++ is not dead.Yet!","T-shirt",449.99);
        addItem("Java Rocks. Yes","Silly mouse-pad",200);
        addItem("Java Design Pattern","Book-A must!",799.50);
        addItem("Web Development Cookbook","The best Web Development cookbook-2022",377.89);
    }

    public void addItem(String name,String description,double price)
    {
        Product product=new Product(name, description, price);
        if (numberOfProducts>=MAX_ITEMS)
        {
            System.out.println("Catalog is Full- can't add products");
        }
        else {
            calalog[numberOfProducts]=product;
            numberOfProducts++;
        }
    }

    public Product[] getCalalog() {
        return calalog;
    }

    public void setCalalog(Product[] calalog) {
        this.calalog = calalog;
    }

    @Override
    public boolean hasNext() {
        if (position>=MAX_ITEMS || calalog[position]==null)
            return false;
        return true;
    }

    @Override
    public Object next() {
       Product product=calalog[position];
       position++;
       return product;
    }
}
