package demo;



public class BillCollector {
    private IPayment payment;

    public void setPayment(IPayment payment) {
        this.payment = payment;
    }

    public void collectPayment(double amount) {
        payment.pay(amount);
    }
}
