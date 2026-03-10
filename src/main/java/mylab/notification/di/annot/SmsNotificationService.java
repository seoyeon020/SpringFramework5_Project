package mylab.notification.di.annot;

public class SmsNotificationService implements NotificationService {
	//SMS 알림을 전송하는 기능
	private String provider; //제공업체 
    
    public SmsNotificationService(String provider) {
        this.provider = provider;
    }
    
    public String getProvider() { return provider; }
    
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS 알림 전송: " + message + " (제공업체: " + provider + ")");
    }

}
