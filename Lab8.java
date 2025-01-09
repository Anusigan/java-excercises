abstract class Payment{
    public abstract void payment();

}
class CreditCardPayment extends Payment{
    @Override
   public void payment(){
    System.out.println("payment using credit card");
   } 

}

class PayPalPayment extends Payment{
    @Override
    public void payment(){
        System.out.println("payment using paypal");
    }
}



