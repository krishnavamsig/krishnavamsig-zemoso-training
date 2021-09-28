package DIP;

 
public class shoppingMall {
    //private debitCard debitCard;
    private bankCard bankCard;
    //constructor
    // public shoppingMall(debitCard debitCard) {
    //     this.debitCard = debitCard;
    // }
    public shoppingMall(bankCard bankCard) {
        this.bankCard = bankCard;
    }
    public void purchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }
    public static void main(String args[]) {
    //      debitCard debitCard=new debitCard();
    //    creditCard creditCard=new creditCard();

       bankCard bankCard=new creditCard();
       shoppingMall shoppingMall=new shoppingMall(bankCard);
       shoppingMall.purchaseSomething(5000);
        
    }
}
