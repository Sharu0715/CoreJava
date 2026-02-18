package org.example.Polymorphism;

 class Pay {

    void processPayment(double amount){
        System.out.println("Payment Suceesfully");

    }



}
class PhonePay extends Pay {
    @Override
    void processPayment(double amount){
        super.processPayment(amount);
        System.out.println("Processing payment of ₹" +amount+ " Using PhonePay payment");

    }


}
class GPay extends Pay {
  @Override
    void processPayment(double amount){
        System.out.println("Processing payment of ₹" +amount+ " Using GPay payment");
    }
}
class FPay extends Pay {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing payment of ₹" +amount+ " Using FPay payment");
    }

}
    public class Payment {
        public static void main(String[] args) {
            Pay pay = new PhonePay();
           pay.processPayment(1000);
           Pay pay2 = new GPay();
             pay2.processPayment(2000);
            Pay pay3 = new FPay();
            pay3.processPayment(3000);

        }
    }

