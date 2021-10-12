package lsp;

// public class Instagram extends SocialMedia{

//     @Override
//     public void chatWithFriend() {
//         TODO Auto-generated method stub
        
//     }

//     @Override
//     public void publishPost(Object post) {
//          TODO Auto-generated method stub
        
//     }

//     @Override
//     public void sendPhotosAndVideos() {
//          TODO Auto-generated method stub
        
//     }

//     @Override
//     public void groupVideoCall(String... users) {
//         TODO Auto-generated method stub
//         NOT APPLICABLE
//     }
    
    
// }
//Because of the method groupVideoCall is not a substitute of its parent-socialMedia,it doesnot follow lsp.


public class GraminaBank extends BankServices{

    @Override
    public void loanService() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void lockerService(Object post) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void insuranceService() {
        // TODO Auto-generated method stub
        
    }
    

}