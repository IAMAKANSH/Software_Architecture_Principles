package remotedesignpattern;

public class RealBank implements Bank{
    @Override
    public void withdraw(String clientName) throws Exception {
        System.out.println(clientName+" is withdrawn from the ATM");
    }
}
