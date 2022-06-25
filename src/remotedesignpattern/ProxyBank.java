package remotedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyBank implements Bank{

    private RealBank realBank=new RealBank();
    private static List<String> bannedClients;

    static {
        bannedClients=new ArrayList<>();
        bannedClients.add("xXcs");
        bannedClients.add("meme");
        bannedClients.add("jlop");
    }

    @Override
    public void withdraw(String clientName)throws Exception {

        if (bannedClients.contains(clientName))
            throw new Exception("Not Access to withdraw money");

        realBank.withdraw(clientName);
    }
}
