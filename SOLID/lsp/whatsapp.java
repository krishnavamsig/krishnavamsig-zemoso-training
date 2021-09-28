package lsp;

public class whatsapp extends socialMedia{

    @Override
    public void chatWithFriend() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void publishPost(Object post) {
        // TODO Auto-generated method stub
        //Not applicable
        
    }

    @Override
    public void sendPhotosAndVideos() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void groupVideoCall(String... users) {
        // TODO Auto-generated method stub
        
    }
    
    
}
//Here publishPost is not possible in whatsapp.whatsapp cannot be substituted by socialMedia. So it does not follow lsp