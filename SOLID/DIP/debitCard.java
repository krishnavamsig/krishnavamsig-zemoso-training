//We use abstraction instead of concrete implementations.High level modules should not depend on low level modules but both should depend on abstraction.

package DIP;

public class debitCard implements bankCard{
    public void doTransaction(long amount)
    {
        System.out.println("debit card payment");
    }
}
