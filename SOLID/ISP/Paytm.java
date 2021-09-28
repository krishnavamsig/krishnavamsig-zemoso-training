package ISP;

public class Paytm implements upiPayments{

    @Override
    public void payMoney() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getScratchCard() {
        // TODO Auto-generated method stub
        
    }

    // @Override
    // public void getCashBack(){ // into the account
        // TODO Auto-generated method stub
        //It is not applicable
        
    //}
    
}
//Here clients is force to implement UPI and override the method getCashBack() even he is not using it.So voilates isp