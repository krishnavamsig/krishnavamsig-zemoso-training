package ISP;

// public class Phonepe implements UpiPayments {

//     @Override
//     public void payMoney() {
//          TODO Auto-generated method stub
        
//     }

//     @Override
//     public void getScratchCard() {
//          TODO Auto-generated method stub
        
//     }

    // @Override
    // public void getCashBack() {
    //     // TODO Auto-generated method stub
    //     //NOT APPLICABLE
    // }
    
//}
//Here clients is force to implement UPI and override the method getCashBack() even he is not using it.So voilates isp

public class GraminaBank implements BankServices{

    @Override
    public void loanService() {
        // TODO Auto-generated method stub
        
    }

  //  @Override
    //public void lockerService() {
        // TODO Auto-generated method stub
        
    //}

    @Override
    public void insuranceService() {
        // TODO Auto-generated method stub
        
    }
    
}
