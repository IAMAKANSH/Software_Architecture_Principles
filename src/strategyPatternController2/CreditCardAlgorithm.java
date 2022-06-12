package strategyPatternController2;

public class CreditCardAlgorithm implements Payment{

    private String name;
    private String cardNumber;

    public CreditCardAlgorithm(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+"Paid with CreditCard");
    }
}
