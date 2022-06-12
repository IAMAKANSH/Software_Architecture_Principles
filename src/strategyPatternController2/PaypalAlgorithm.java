package strategyPatternController2;

public class PaypalAlgorithm implements Payment{

    private String emailId;
    private String password;

    public PaypalAlgorithm(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" Paid with Paypal");
    }
}
