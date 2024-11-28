package demo;



public class CreditCardPayment implements IPayment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
