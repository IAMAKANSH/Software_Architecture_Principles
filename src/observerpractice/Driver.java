package observerpractice;

import observerpractice.interfaces.Listener;
import observerpractice.model.AirtelProvider;
import observerpractice.model.Customer;

public class Driver {

    public static void main(String[] args) {

        AirtelProvider provider=new AirtelProvider();

        Listener first=new Customer("Akansh");
        Listener second=new Customer("Rajesh");
        Listener third=new Customer("Ajay");

        provider.register(first);
        provider.register(second);
        provider.register(third);

        first.setProvider(provider);
        second.setProvider(provider);
        third.setProvider(provider);


        first.update();

        provider.postShow("Kapil Sharma Show");

    }
}
