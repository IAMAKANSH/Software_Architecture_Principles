package remotedesignpattern;

public class Driver {

    public static void main(String[] args) throws Exception {


        Bank bank=new ProxyBank();
        bank.withdraw("Akansh");

        bank.withdraw("xXcs");
    }
}
