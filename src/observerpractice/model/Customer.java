package observerpractice.model;

import observerpractice.interfaces.Listener;
import observerpractice.interfaces.Provider;

public class Customer implements Listener {

    private Provider provider;
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String show= (String) provider.getUpdate(this);
        if (show==null)
            System.out.println(name+ " No notification for the show");
        else
            System.out.println(name+ " Upcoming show is "+show);
    }

    @Override
    public void setProvider(Provider provider) {
            this.provider=provider;
    }
}
