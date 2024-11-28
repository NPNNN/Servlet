package demo;



public class DebitCardPayment implements IPayment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Debit Card.");
    }
}
