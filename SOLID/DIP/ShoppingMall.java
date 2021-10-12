package DIP;

 
public class ShoppingMall {
    //private debitCard debitCard;
    private BankCard BankCard;
    //constructor
    // public shoppingMall(debitCard debitCard) {
    //     this.debitCard = debitCard;
    // }
    public ShoppingMall(BankCard BankCard) {
        this.BankCard = BankCard;
    }
    public void purchaseSomething(long amount){
        BankCard.doTransaction(amount);
    }
    public static void main(String args[]) {
    //      debitCard debitCard=new debitCard();
    //    creditCard creditCard=new creditCard();

       BankCard bankCard=new CreditCard();
       ShoppingMall shoppingMall=new ShoppingMall(bankCard);
       shoppingMall.purchaseSomething(5000);
        
    }
}
