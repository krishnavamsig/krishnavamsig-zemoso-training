//Every java class must perform a single functionality. It is voialting here so divide.
package SOLID.srp;
public class BankService {
    public long deposit(long amount,String AccNo){
        return 0;
    }
    public long withdraw(long amount,String AccNo){
        return 0;
    }
    public void print(){

    }
    public void getInfo(String loanType){
        if (loanType.equals("homeLoan")) {
            //...
        }
        if (loanType.equals("personalLoan")) {
            //...
        }
        if (loanType.equals("car")) {
            //...
        }
    }
    public void sendOTP(String medium)
    {
        if(medium.equals("email")){
            //...
        }
        else if(medium.equals("mobile")){
            //...
        }
    }
}
