package ISP;

public class Phonepe implements upiPayments {

    @Override
    public void payMoney() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getScratchCard() {
        // TODO Auto-generated method stub
        
    }

    // @Override
    // public void getCashBack() {
    //     // TODO Auto-generated method stub
    //     //NOT APPLICABLE
    // }
    
}
//Here clients is force to implement UPI and override the method getCashBack() even he is not using it.So voilates isp
