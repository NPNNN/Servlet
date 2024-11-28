package demo;



public class UpiPayment implements IPayment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

