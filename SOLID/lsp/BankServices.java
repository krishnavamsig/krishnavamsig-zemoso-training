//LSP: derived class must be completely substitute of parent class
package lsp;

    public abstract class BankServices {

        public abstract  void loanService();
    
        public abstract void lockerService(Object post);
    
        public abstract  void insuranceService();
    
        //WhatsApp,Facebook
        // public abstract  void groupVideoCall(String... users);
    }

