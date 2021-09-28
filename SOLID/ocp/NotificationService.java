//OCP: open for extension and closed for modification 
package ocp;

public interface NotificationService {

    public void sendOTP(String medium);

    public void sendTransactionReport(String medium);

}
