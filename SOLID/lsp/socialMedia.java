//LSP: derived class must be completely substitute of parent class
package lsp;

    public abstract class socialMedia {

        // WhatsApp,Facebook,Instagram
        public abstract  void chatWithFriend();
    
        //Facebook,Instagram
        public abstract void publishPost(Object post);
    
        //WhatsApp,Facebook,Instagram
        public abstract  void sendPhotosAndVideos();
    
        //WhatsApp,Facebook
        public abstract  void groupVideoCall(String... users);
    }

